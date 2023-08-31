package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Staff;
import com.ruoyi.system.service.IStaffService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 职工Controller
 *
 * @author Chiliz
 * @date 2023-08-30
 */
@RestController
@RequestMapping("/system/staff")
public class StaffController extends BaseController
{
    @Autowired
    private IStaffService staffService;

    /**
     * 查询职工列表
     */
    @PreAuthorize("@ss.hasPermi('system:staff:list')")
    @GetMapping("/list")
    public TableDataInfo list(Staff staff)
    {
        startPage();
        List<Staff> list = staffService.selectStaffList(staff);
        return getDataTable(list);
    }

    /**
     * 导出职工列表
     */
    @PreAuthorize("@ss.hasPermi('system:staff:export')")
    @Log(title = "职工", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Staff staff)
    {
        List<Staff> list = staffService.selectStaffList(staff);
        ExcelUtil<Staff> util = new ExcelUtil<Staff>(Staff.class);
        util.exportExcel(response, list, "职工数据");
    }

    /**
     * 获取职工详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:staff:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(staffService.selectStaffById(id));
    }

    /**
     * 新增职工
     */
    @PreAuthorize("@ss.hasPermi('system:staff:add')")
    @Log(title = "职工", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Staff staff)
    {
        return toAjax(staffService.insertStaff(staff));
    }

    /**
     * 修改职工
     */
    @PreAuthorize("@ss.hasPermi('system:staff:edit')")
    @Log(title = "职工", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Staff staff)
    {
        return toAjax(staffService.updateStaff(staff));
    }

    /**
     * 删除职工
     */
    @PreAuthorize("@ss.hasPermi('system:staff:remove')")
    @Log(title = "职工", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(staffService.deleteStaffByIds(ids));
    }
}
