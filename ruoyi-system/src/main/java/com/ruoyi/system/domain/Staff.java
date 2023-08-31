package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 职工对象 staff
 * 
 * @author Chiliz
 * @date 2023-08-30
 */
public class Staff extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 职工ID */
    private Long id;

    /** 职员姓名 */
    @Excel(name = "职员姓名")
    private String empName;

    /** 性别（0男 1女 2未知） */
    @Excel(name = "性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;

    /** 年龄 */
    @Excel(name = "年龄")
    private Integer age;

    /** 部门名称[业务部，后勤部，人事部] */
    @Excel(name = "部门名称[业务部，后勤部，人事部]")
    private String deptName;

    /** 学历[大专，本科，研究生] */
    @Excel(name = "学历[大专，本科，研究生]")
    private String empDegreeName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setEmpName(String empName) 
    {
        this.empName = empName;
    }

    public String getEmpName() 
    {
        return empName;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setAge(Integer age) 
    {
        this.age = age;
    }

    public Integer getAge() 
    {
        return age;
    }
    public void setDeptName(String deptName) 
    {
        this.deptName = deptName;
    }

    public String getDeptName() 
    {
        return deptName;
    }
    public void setEmpDegreeName(String empDegreeName) 
    {
        this.empDegreeName = empDegreeName;
    }

    public String getEmpDegreeName() 
    {
        return empDegreeName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("empName", getEmpName())
            .append("sex", getSex())
            .append("age", getAge())
            .append("deptName", getDeptName())
            .append("empDegreeName", getEmpDegreeName())
            .toString();
    }
}
