package io.renren.modules.dining.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.modules.sys.controller.AbstractController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.dining.entity.EmployeeEntity;
import io.renren.modules.dining.service.EmployeeService;
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
@RequestMapping("generator/employee")
public class EmployeeController extends AbstractController {
    @Autowired
    private EmployeeService employeeService;

    /**
     * 列表
     */
    @GetMapping("/list")
    @RequiresPermissions("generator:employee:list")
    public R list(@RequestParam Map<String, Object> params){
        System.out.println("####################################################看看数据");
        PageUtils page = employeeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:employee:info")
    public R info(@PathVariable("id") Integer id){
		EmployeeEntity employee = employeeService.getById(id);

        return R.ok().put("employee", employee);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:employee:save")
    public R save(@RequestBody EmployeeEntity employee){
		employeeService.save(employee);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:employee:update")
    public R update(@RequestBody EmployeeEntity employee){
		employeeService.updateById(employee);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:employee:delete")
    public R delete(@RequestBody Integer[] ids){
		employeeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
