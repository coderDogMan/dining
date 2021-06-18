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

import io.renren.modules.dining.entity.MenuTypeEntity;
import io.renren.modules.dining.service.MenuTypeService;
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
@RequestMapping("generator/menutype")
public class MenuTypeController {
    @Autowired
    private MenuTypeService menuTypeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:menutype:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = menuTypeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:menutype:info")
    public R info(@PathVariable("id") Integer id){
		MenuTypeEntity menuType = menuTypeService.getById(id);

        return R.ok().put("menuType", menuType);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:menutype:save")
    public R save(@RequestBody MenuTypeEntity menuType){
		menuTypeService.save(menuType);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:menutype:update")
    public R update(@RequestBody MenuTypeEntity menuType){
		menuTypeService.updateById(menuType);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:menutype:delete")
    public R delete(@RequestBody Integer[] ids){
		menuTypeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
