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

import io.renren.modules.dining.entity.CommdityKindEntity;
import io.renren.modules.dining.service.CommdityKindService;
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
@RequestMapping("generator/commditykind")
public class CommdityKindController {
    @Autowired
    private CommdityKindService commdityKindService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:commditykind:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = commdityKindService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:commditykind:info")
    public R info(@PathVariable("id") Integer id){
		CommdityKindEntity commdityKind = commdityKindService.getById(id);

        return R.ok().put("commdityKind", commdityKind);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:commditykind:save")
    public R save(@RequestBody CommdityKindEntity commdityKind){
		commdityKindService.save(commdityKind);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:commditykind:update")
    public R update(@RequestBody CommdityKindEntity commdityKind){
		commdityKindService.updateById(commdityKind);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:commditykind:delete")
    public R delete(@RequestBody Integer[] ids){
		commdityKindService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
