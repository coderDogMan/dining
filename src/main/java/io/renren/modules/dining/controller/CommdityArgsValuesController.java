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

import io.renren.modules.dining.entity.CommdityArgsValuesEntity;
import io.renren.modules.dining.service.CommdityArgsValuesService;
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
@RequestMapping("generator/commdityargsvalues")
public class CommdityArgsValuesController {
    @Autowired
    private CommdityArgsValuesService commdityArgsValuesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:commdityargsvalues:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = commdityArgsValuesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{commdityId}")
    @RequiresPermissions("generator:commdityargsvalues:info")
    public R info(@PathVariable("commdityId") Integer commdityId){
		CommdityArgsValuesEntity commdityArgsValues = commdityArgsValuesService.getById(commdityId);

        return R.ok().put("commdityArgsValues", commdityArgsValues);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:commdityargsvalues:save")
    public R save(@RequestBody CommdityArgsValuesEntity commdityArgsValues){
		commdityArgsValuesService.save(commdityArgsValues);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:commdityargsvalues:update")
    public R update(@RequestBody CommdityArgsValuesEntity commdityArgsValues){
		commdityArgsValuesService.updateById(commdityArgsValues);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:commdityargsvalues:delete")
    public R delete(@RequestBody Integer[] commdityIds){
		commdityArgsValuesService.removeByIds(Arrays.asList(commdityIds));

        return R.ok();
    }

}
