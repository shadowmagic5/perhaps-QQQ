package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 阶段对象 dd_phase
 * 
 * @author ruoyi
 * @date 2023-05-09
 */
public class DdPhase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createdby;

    /** 创建时间 */
    @Excel(name = "创建时间")
    private String createdon;

    /** 修改人 */
    @Excel(name = "修改人")
    private String modifiedby;

    /** 修改时间 */
    @Excel(name = "修改时间")
    private String modifiedon;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCreatedby(String createdby) 
    {
        this.createdby = createdby;
    }

    public String getCreatedby() 
    {
        return createdby;
    }
    public void setCreatedon(String createdon) 
    {
        this.createdon = createdon;
    }

    public String getCreatedon() 
    {
        return createdon;
    }
    public void setModifiedby(String modifiedby) 
    {
        this.modifiedby = modifiedby;
    }

    public String getModifiedby() 
    {
        return modifiedby;
    }
    public void setModifiedon(String modifiedon) 
    {
        this.modifiedon = modifiedon;
    }

    public String getModifiedon() 
    {
        return modifiedon;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("createdby", getCreatedby())
            .append("createdon", getCreatedon())
            .append("modifiedby", getModifiedby())
            .append("modifiedon", getModifiedon())
            .append("status", getStatus())
            .append("name", getName())
            .toString();
    }
}
