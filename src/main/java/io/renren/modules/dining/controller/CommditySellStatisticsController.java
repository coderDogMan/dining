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

import io.renren.modules.dining.entity.CommditySellStatisticsEntity;
import io.renren.modules.dining.service.CommditySellStatisticsService;
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
@RequestMapping("generator/commditysellstatistics")
public class CommditySellStatisticsController {
    @Autowired
    private CommditySellStatisticsService commditySellStatisticsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:commditysellstatistics:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = commditySellStatisticsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{commdityId}")
    @RequiresPermissions("generator:commditysellstatistics:info")
    public R info(@PathVariable("commdityId") Integer commdityId){
		CommditySellStatisticsEntity commditySellStatistics = commditySellStatisticsService.getById(commdityId);

        return R.ok().put("commditySellStatistics", commditySellStatistics);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:commditysellstatistics:save")
    public R save(@RequestBody CommditySellStatisticsEntity commditySellStatistics){
		commditySellStatisticsService.save(commditySellStatistics);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:commditysellstatistics:update")
    public R update(@RequestBody CommditySellStatisticsEntity commditySellStatistics){
		commditySellStatisticsService.updateById(commditySellStatistics);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:commditysellstatistics:delete")
    public R delete(@RequestBody Integer[] commdityIds){
		commditySellStatisticsService.removeByIds(Arrays.asList(commdityIds));

        return R.ok();
    }

}
