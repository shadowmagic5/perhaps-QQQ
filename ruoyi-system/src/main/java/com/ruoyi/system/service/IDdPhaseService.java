package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DdPhase;

/**
 * 阶段Service接口
 * 
 * @author ruoyi
 * @date 2023-05-09
 */
public interface IDdPhaseService 
{
    /**
     * 查询阶段
     * 
     * @param id 阶段主键
     * @return 阶段
     */
    public DdPhase selectDdPhaseById(Long id);

    /**
     * 查询阶段列表
     * 
     * @param ddPhase 阶段
     * @return 阶段集合
     */
    public List<DdPhase> selectDdPhaseList(DdPhase ddPhase);

    /**
     * 新增阶段
     * 
     * @param ddPhase 阶段
     * @return 结果
     */
    public int insertDdPhase(DdPhase ddPhase);

    /**
     * 修改阶段
     * 
     * @param ddPhase 阶段
     * @return 结果
     */
    public int updateDdPhase(DdPhase ddPhase);

    /**
     * 批量删除阶段
     * 
     * @param ids 需要删除的阶段主键集合
     * @return 结果
     */
    public int deleteDdPhaseByIds(Long[] ids);

    /**
     * 删除阶段信息
     * 
     * @param id 阶段主键
     * @return 结果
     */
    public int deleteDdPhaseById(Long id);
}
