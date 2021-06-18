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

import io.renren.modules.dining.entity.CallServeEntity;
import io.renren.modules.dining.service.CallServeService;
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
@RequestMapping("generator/callserve")
public class CallServeController {
    @Autowired
    private CallServeService callServeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:callserve:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = callServeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{wechatNumber}")
    @RequiresPermissions("generator:callserve:info")
    public R info(@PathVariable("wechatNumber") String wechatNumber){
		CallServeEntity callServe = callServeService.getById(wechatNumber);

        return R.ok().put("callServe", callServe);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:callserve:save")
    public R save(@RequestBody CallServeEntity callServe){
		callServeService.save(callServe);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:callserve:update")
    public R update(@RequestBody CallServeEntity callServe){
		callServeService.updateById(callServe);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:callserve:delete")
    public R delete(@RequestBody String[] wechatNumbers){
		callServeService.removeByIds(Arrays.asList(wechatNumbers));

        return R.ok();
    }

}
