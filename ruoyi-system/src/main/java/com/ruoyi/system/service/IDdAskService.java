package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DdAsk;

/**
 * 应答Service接口
 *
 * @author ruoyi
 * @date 2023-05-24
 */
public interface IDdAskService
{
    /**
     * 查询应答
     *
     * @param askId 应答主键
     * @return 应答
     */
    public DdAsk selectDdAskByAskId(Long askId);

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
     * 批量删除应答
     *
     * @param askIds 需要删除的应答主键集合
     * @return 结果
     */
    public int deleteDdAskByAskIds(Long[] askIds);

    /**
     * 删除应答信息
     *
     * @param askId 应答主键
     * @return 结果
     */
    public int deleteDdAskByAskId(Long askId);
}
