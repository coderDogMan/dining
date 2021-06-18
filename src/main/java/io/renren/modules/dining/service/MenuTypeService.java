package io.renren.modules.dining.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.dining.entity.MenuTypeEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-18 00:23:28
 */
public interface MenuTypeService extends IService<MenuTypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

