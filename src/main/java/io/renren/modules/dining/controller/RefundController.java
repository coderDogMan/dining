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

import io.renren.modules.dining.entity.RefundEntity;
import io.renren.modules.dining.service.RefundService;
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
@RequestMapping("generator/refund")
public class RefundController {
    @Autowired
    private RefundService refundService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:refund:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = refundService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:refund:info")
    public R info(@PathVariable("id") Integer id){
		RefundEntity refund = refundService.getById(id);

        return R.ok().put("refund", refund);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:refund:save")
    public R save(@RequestBody RefundEntity refund){
		refundService.save(refund);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:refund:update")
    public R update(@RequestBody RefundEntity refund){
		refundService.updateById(refund);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:refund:delete")
    public R delete(@RequestBody Integer[] ids){
		refundService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
