package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DdAsk;

/**
 * 应答Mapper接口
 *
 * @author ruoyi
 * @date 2023-05-23
 */
public interface DdAskMapper
{
    /**
     * 查询应答
     *
     * @param createdby 应答主键
     * @return 应答
     */
    public DdAsk selectDdAskByCreatedby(String createdby);

    /**
     * 查询应答列表
     *
     * @param ddAsk 应答
     * @return 应答集合
     */
    public List<DdAsk> selectDdAskList(DdAsk ddAsk);

    /**
     * 新增应答
     *
     * @param ddAsk 应答
     * @return 结果
     */
    public int insertDdAsk(DdAsk ddAsk);

    /**
     * 修改应答
     *
     * @param ddAsk 应答
     * @return 结果
     */
    public int updateDdAsk(DdAsk ddAsk);

    /**
     * 删除应答
     *
     * @param createdby 应答主键
     * @return 结果
     */
    public int deleteDdAskByCreatedby(String createdby);

    /**
     * 批量删除应答
     *
     * @param createdbys 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDdAskByCreatedbys(String[] createdbys);
}
