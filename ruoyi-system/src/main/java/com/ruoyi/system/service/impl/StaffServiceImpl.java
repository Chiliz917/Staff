package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StaffMapper;
import com.ruoyi.system.domain.Staff;
import com.ruoyi.system.service.IStaffService;

/**
 * 职工Service业务层处理
 * 
 * @author Chiliz
 * @date 2023-08-30
 */
@Service
public class StaffServiceImpl implements IStaffService 
{
    @Autowired
    private StaffMapper staffMapper;

    /**
     * 查询职工
     * 
     * @param id 职工主键
     * @return 职工
     */
    @Override
    public Staff selectStaffById(Long id)
    {
        return staffMapper.selectStaffById(id);
    }

    /**
     * 查询职工列表
     * 
     * @param staff 职工
     * @return 职工
     */
    @Override
    public List<Staff> selectStaffList(Staff staff)
    {
        return staffMapper.selectStaffList(staff);
    }

    /**
     * 新增职工
     * 
     * @param staff 职工
     * @return 结果
     */
    @Override
    public int insertStaff(Staff staff)
    {
        return staffMapper.insertStaff(staff);
    }

    /**
     * 修改职工
     * 
     * @param staff 职工
     * @return 结果
     */
    @Override
    public int updateStaff(Staff staff)
    {
        return staffMapper.updateStaff(staff);
    }

    /**
     * 批量删除职工
     * 
     * @param ids 需要删除的职工主键
     * @return 结果
     */
    @Override
    public int deleteStaffByIds(Long[] ids)
    {
        return staffMapper.deleteStaffByIds(ids);
    }

    /**
     * 删除职工信息
     * 
     * @param id 职工主键
     * @return 结果
     */
    @Override
    public int deleteStaffById(Long id)
    {
        return staffMapper.deleteStaffById(id);
    }
}
