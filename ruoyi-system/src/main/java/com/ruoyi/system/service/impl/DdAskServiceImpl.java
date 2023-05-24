package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DdAskMapper;
import com.ruoyi.system.domain.DdAsk;
import com.ruoyi.system.service.IDdAskService;

/**
 * 应答Service业务层处理
 *
 * @author ruoyi
 * @date 2023-05-24
 */
@Service
public class DdAskServiceImpl implements IDdAskService
{
    @Autowired
    private DdAskMapper ddAskMapper;

    /**
     * 查询应答
     *
     * @param askId 应答主键
     * @return 应答
     */
    @Override
    public DdAsk selectDdAskByAskId(Long askId)
    {
        return ddAskMapper.selectDdAskByAskId(askId);
    }

    /**
     * 查询应答列表
     *
     * @param ddAsk 应答
     * @return 应答
     */
    @Override
    public List<DdAsk> selectDdAskList(DdAsk ddAsk)
    {
        return ddAskMapper.selectDdAskList(ddAsk);
    }

    /**
     * 新增应答
     *
     * @param ddAsk 应答
     * @return 结果
     */
    @Override
    public int insertDdAsk(DdAsk ddAsk)
    {
        ddAsk.setCreateTime(DateUtils.getNowDate());
        return ddAskMapper.insertDdAsk(ddAsk);
    }

    /**
     * 修改应答
     *
     * @param ddAsk 应答
     * @return 结果
     */
    @Override
    public int updateDdAsk(DdAsk ddAsk)
    {
        ddAsk.setUpdateTime(DateUtils.getNowDate());
        return ddAskMapper.updateDdAsk(ddAsk);
    }

    /**
     * 批量删除应答
     *
     * @param askIds 需要删除的应答主键
     * @return 结果
     */
    @Override
    public int deleteDdAskByAskIds(Long[] askIds)
    {
        return ddAskMapper.deleteDdAskByAskIds(askIds);
    }

    /**
     * 删除应答信息
     *
     * @param askId 应答主键
     * @return 结果
     */
    @Override
    public int deleteDdAskByAskId(Long askId)
    {
        return ddAskMapper.deleteDdAskByAskId(askId);
    }
}
