package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DdPhaseMapper;
import com.ruoyi.system.domain.DdPhase;
import com.ruoyi.system.service.IDdPhaseService;

/**
 * 阶段Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-09
 */
@Service
public class DdPhaseServiceImpl implements IDdPhaseService 
{
    @Autowired
    private DdPhaseMapper ddPhaseMapper;

    /**
     * 查询阶段
     * 
     * @param id 阶段主键
     * @return 阶段
     */
    @Override
    public DdPhase selectDdPhaseById(Long id)
    {
        return ddPhaseMapper.selectDdPhaseById(id);
    }

    /**
     * 查询阶段列表
     * 
     * @param ddPhase 阶段
     * @return 阶段
     */
    @Override
    public List<DdPhase> selectDdPhaseList(DdPhase ddPhase)
    {
        return ddPhaseMapper.selectDdPhaseList(ddPhase);
    }

    /**
     * 新增阶段
     * 
     * @param ddPhase 阶段
     * @return 结果
     */
    @Override
    public int insertDdPhase(DdPhase ddPhase)
    {
        return ddPhaseMapper.insertDdPhase(ddPhase);
    }

    /**
     * 修改阶段
     * 
     * @param ddPhase 阶段
     * @return 结果
     */
    @Override
    public int updateDdPhase(DdPhase ddPhase)
    {
        return ddPhaseMapper.updateDdPhase(ddPhase);
    }

    /**
     * 批量删除阶段
     * 
     * @param ids 需要删除的阶段主键
     * @return 结果
     */
    @Override
    public int deleteDdPhaseByIds(Long[] ids)
    {
        return ddPhaseMapper.deleteDdPhaseByIds(ids);
    }

    /**
     * 删除阶段信息
     * 
     * @param id 阶段主键
     * @return 结果
     */
    @Override
    public int deleteDdPhaseById(Long id)
    {
        return ddPhaseMapper.deleteDdPhaseById(id);
    }
}
