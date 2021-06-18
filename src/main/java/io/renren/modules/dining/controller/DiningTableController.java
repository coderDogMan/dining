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

import io.renren.modules.dining.entity.DiningTableEntity;
import io.renren.modules.dining.service.DiningTableService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-18 00:23:28
 */
@RestController
@RequestMapping("generator/diningtable")
public class DiningTableController {
    @Autowired
    private DiningTableService diningTableService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:diningtable:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = diningTableService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:diningtable:info")
    public R info(@PathVariable("id") Integer id){
		DiningTableEntity diningTable = diningTableService.getById(id);

        return R.ok().put("diningTable", diningTable);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:diningtable:save")
    public R save(@RequestBody DiningTableEntity diningTable){
		diningTableService.save(diningTable);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:diningtable:update")
    public R update(@RequestBody DiningTableEntity diningTable){
		diningTableService.updateById(diningTable);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:diningtable:delete")
    public R delete(@RequestBody Integer[] ids){
		diningTableService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
