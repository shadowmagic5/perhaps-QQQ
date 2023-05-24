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
 * @date 2023-05-24
 */
@Data
public class DdAsk extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long askId;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 阶段 */
    @Excel(name = "阶段")
    private Long phaseId;

    /** 问题 */
    @Excel(name = "问题")
    private String question;

    /** 线上类型 */
    @Excel(name = "线上类型")
    private Long onlineType;

}
