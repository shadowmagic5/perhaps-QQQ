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
import com.ruoyi.system.domain.DdAsk;
import com.ruoyi.system.service.IDdAskService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 应答Controller
 *
 * @author ruoyi
 * @date 2023-05-23
 */
@RestController
@RequestMapping("/system/ask")
public class DdAskController extends BaseController
{
    @Autowired
    private IDdAskService ddAskService;

    /**
     * 查询应答列表
     */
    @PreAuthorize("@ss.hasPermi('system:ask:list')")
    @GetMapping("/list")
    public TableDataInfo list(DdAsk ddAsk)
    {
        startPage();
        List<DdAsk> list = ddAskService.selectDdAskList(ddAsk);
        return getDataTable(list);
    }

    /**
     * 导出应答列表
     */
    @PreAuthorize("@ss.hasPermi('system:ask:export')")
    @Log(title = "应答", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DdAsk ddAsk)
    {
        List<DdAsk> list = ddAskService.selectDdAskList(ddAsk);
        ExcelUtil<DdAsk> util = new ExcelUtil<DdAsk>(DdAsk.class);
        util.exportExcel(response, list, "应答数据");
    }

    /**
     * 获取应答详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ask:query')")
    @GetMapping(value = "/{createdby}")
    public AjaxResult getInfo(@PathVariable("createdby") String createdby)
    {
        return success(ddAskService.selectDdAskByCreatedby(createdby));
    }

    /**
     * 新增应答
     */
    @PreAuthorize("@ss.hasPermi('system:ask:add')")
    @Log(title = "应答", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DdAsk ddAsk)
    {
        return toAjax(ddAskService.insertDdAsk(ddAsk));
    }

    /**
     * 修改应答
     */
    @PreAuthorize("@ss.hasPermi('system:ask:edit')")
    @Log(title = "应答", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DdAsk ddAsk)
    {
        return toAjax(ddAskService.updateDdAsk(ddAsk));
    }

    /**
     * 删除应答
     */
    @PreAuthorize("@ss.hasPermi('system:ask:remove')")
    @Log(title = "应答", businessType = BusinessType.DELETE)
    @DeleteMapping("/{createdbys}")
    public AjaxResult remove(@PathVariable String[] createdbys)
    {
        return toAjax(ddAskService.deleteDdAskByCreatedbys(createdbys));
    }
}
