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

import io.renren.modules.dining.entity.CommdityEntity;
import io.renren.modules.dining.service.CommdityService;
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
@RequestMapping("generator/commdity")
public class CommdityController {
    @Autowired
    private CommdityService commdityService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:commdity:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = commdityService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:commdity:info")
    public R info(@PathVariable("id") Integer id){
		CommdityEntity commdity = commdityService.getById(id);

        return R.ok().put("commdity", commdity);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:commdity:save")
    public R save(@RequestBody CommdityEntity commdity){
		commdityService.save(commdity);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:commdity:update")
    public R update(@RequestBody CommdityEntity commdity){
		commdityService.updateById(commdity);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:commdity:delete")
    public R delete(@RequestBody Integer[] ids){
		commdityService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
