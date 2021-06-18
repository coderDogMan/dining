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

import io.renren.modules.dining.entity.OrderDetailEntity;
import io.renren.modules.dining.service.OrderDetailService;
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
@RequestMapping("generator/orderdetail")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:orderdetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{commdityId}")
    @RequiresPermissions("generator:orderdetail:info")
    public R info(@PathVariable("commdityId") Integer commdityId){
		OrderDetailEntity orderDetail = orderDetailService.getById(commdityId);

        return R.ok().put("orderDetail", orderDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:orderdetail:save")
    public R save(@RequestBody OrderDetailEntity orderDetail){
		orderDetailService.save(orderDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:orderdetail:update")
    public R update(@RequestBody OrderDetailEntity orderDetail){
		orderDetailService.updateById(orderDetail);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:orderdetail:delete")
    public R delete(@RequestBody Integer[] commdityIds){
		orderDetailService.removeByIds(Arrays.asList(commdityIds));

        return R.ok();
    }

}
