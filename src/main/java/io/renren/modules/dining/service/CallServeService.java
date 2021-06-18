package io.renren.modules.dining.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.dining.entity.CallServeEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-18 00:23:27
 */
public interface CallServeService extends IService<CallServeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

