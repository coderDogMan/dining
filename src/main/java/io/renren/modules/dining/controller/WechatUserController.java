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

import io.renren.modules.dining.entity.WechatUserEntity;
import io.renren.modules.dining.service.WechatUserService;
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
@RequestMapping("generator/wechatuser")
public class WechatUserController {
    @Autowired
    private WechatUserService wechatUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:wechatuser:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wechatUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{wechatNumber}")
    @RequiresPermissions("generator:wechatuser:info")
    public R info(@PathVariable("wechatNumber") String wechatNumber){
		WechatUserEntity wechatUser = wechatUserService.getById(wechatNumber);

        return R.ok().put("wechatUser", wechatUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:wechatuser:save")
    public R save(@RequestBody WechatUserEntity wechatUser){
		wechatUserService.save(wechatUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:wechatuser:update")
    public R update(@RequestBody WechatUserEntity wechatUser){
		wechatUserService.updateById(wechatUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:wechatuser:delete")
    public R delete(@RequestBody String[] wechatNumbers){
		wechatUserService.removeByIds(Arrays.asList(wechatNumbers));

        return R.ok();
    }

}
