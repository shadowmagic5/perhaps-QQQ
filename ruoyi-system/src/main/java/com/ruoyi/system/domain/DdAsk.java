package com.ruoyi.system.domain;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 应答对象 dd_ask
 *
 * @author ruoyi
 * @date 2023-05-23
 */
@Data
public class DdAsk extends BaseEntity
{
    private static final long serialVersionUID = 1L;

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

    /** 阶段 */
    @Excel(name = "阶段")
    private Long phaseid;

    /** 问题 */
    @Excel(name = "问题")
    private String question;

    /** ID */
    @Excel(name = "ID")
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String onlinetype;

}
