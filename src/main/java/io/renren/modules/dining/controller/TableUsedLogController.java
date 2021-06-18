package io.renren.modules.dining.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.dining.entity.TableUsedLogEntity;
import io.renren.modules.dining.service.TableUsedLogService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-18 00:23:27
 */
@RestController
@RequestMapping("generator/tableusedlog")
public class TableUsedLogController {
    @Autowired
    private TableUsedLogService tableUsedLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:tableusedlog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tableUsedLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:tableusedlog:info")
    public R info(@PathVariable("id") Integer id){
		TableUsedLogEntity tableUsedLog = tableUsedLogService.getById(id);

        return R.ok().put("tableUsedLog", tableUsedLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:tableusedlog:save")
    public R save(@RequestBody TableUsedLogEntity tableUsedLog){
		tableUsedLogService.save(tableUsedLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:tableusedlog:update")
    public R update(@RequestBody TableUsedLogEntity tableUsedLog){
		tableUsedLogService.updateById(tableUsedLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:tableusedlog:delete")
    public R delete(@RequestBody Integer[] ids){
		tableUsedLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
