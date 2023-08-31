package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Staff;

/**
 * 职工Service接口
 * 
 * @author Chiliz
 * @date 2023-08-30
 */
public interface IStaffService 
{
    /**
     * 查询职工
     * 
     * @param id 职工主键
     * @return 职工
     */
    public Staff selectStaffById(Long id);

    /**
     * 查询职工列表
     * 
     * @param staff 职工
     * @return 职工集合
     */
    public List<Staff> selectStaffList(Staff staff);

    /**
     * 新增职工
     * 
     * @param staff 职工
     * @return 结果
     */
    public int insertStaff(Staff staff);

    /**
     * 修改职工
     * 
     * @param staff 职工
     * @return 结果
     */
    public int updateStaff(Staff staff);

    /**
     * 批量删除职工
     * 
     * @param ids 需要删除的职工主键集合
     * @return 结果
     */
    public int deleteStaffByIds(Long[] ids);

    /**
     * 删除职工信息
     * 
     * @param id 职工主键
     * @return 结果
     */
    public int deleteStaffById(Long id);
}
