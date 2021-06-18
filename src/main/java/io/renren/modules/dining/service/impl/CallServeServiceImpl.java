package io.renren.modules.dining.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.dining.dao.CallServeDao;
import io.renren.modules.dining.entity.CallServeEntity;
import io.renren.modules.dining.service.CallServeService;


@Service("callServeService")
public class CallServeServiceImpl extends ServiceImpl<CallServeDao, CallServeEntity> implements CallServeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CallServeEntity> page = this.page(
                new Query<CallServeEntity>().getPage(params),
                new QueryWrapper<CallServeEntity>()
        );

        return new PageUtils(page);
    }

}