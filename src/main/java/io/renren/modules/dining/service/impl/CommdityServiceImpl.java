package io.renren.modules.dining.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.dining.dao.CommdityDao;
import io.renren.modules.dining.entity.CommdityEntity;
import io.renren.modules.dining.service.CommdityService;


@Service("commdityService")
public class CommdityServiceImpl extends ServiceImpl<CommdityDao, CommdityEntity> implements CommdityService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommdityEntity> page = this.page(
                new Query<CommdityEntity>().getPage(params),
                new QueryWrapper<CommdityEntity>()
        );

        return new PageUtils(page);
    }

}