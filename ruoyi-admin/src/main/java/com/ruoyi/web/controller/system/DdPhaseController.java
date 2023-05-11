package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.DdPhase;
import com.ruoyi.system.service.IDdPhaseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 阶段Controller
 * 
 * @author ruoyi
 * @date 2023-05-09
 */
@RestController
@RequestMapping("/system/phase")
public class DdPhaseController extends BaseController
{
    @Autowired
    private IDdPhaseService ddPhaseService;

    /**
     * 查询阶段列表
     */
    @PreAuthorize("@ss.hasPermi('system:phase:list')")
    @GetMapping("/list")
    public TableDataInfo list(DdPhase ddPhase)
    {
        startPage();
        List<DdPhase> list = ddPhaseService.selectDdPhaseList(ddPhase);
        return getDataTable(list);
    }

    /**
     * 导出阶段列表
     */
    @PreAuthorize("@ss.hasPermi('system:phase:export')")
    @Log(title = "阶段", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DdPhase ddPhase)
    {
        List<DdPhase> list = ddPhaseService.selectDdPhaseList(ddPhase);
        ExcelUtil<DdPhase> util = new ExcelUtil<DdPhase>(DdPhase.class);
        util.exportExcel(response, list, "阶段数据");
    }

    /**
     * 获取阶段详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:phase:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ddPhaseService.selectDdPhaseById(id));
    }

    /**
     * 新增阶段
     */
    @PreAuthorize("@ss.hasPermi('system:phase:add')")
    @Log(title = "阶段", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DdPhase ddPhase)
    {
        return toAjax(ddPhaseService.insertDdPhase(ddPhase));
    }

    /**
     * 修改阶段
     */
    @PreAuthorize("@ss.hasPermi('system:phase:edit')")
    @Log(title = "阶段", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DdPhase ddPhase)
    {
        return toAjax(ddPhaseService.updateDdPhase(ddPhase));
    }

    /**
     * 删除阶段
     */
    @PreAuthorize("@ss.hasPermi('system:phase:remove')")
    @Log(title = "阶段", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ddPhaseService.deleteDdPhaseByIds(ids));
    }
}
