package io.renren.modules.dining.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.dining.dao.CommditySellStatisticsDao;
import io.renren.modules.dining.entity.CommditySellStatisticsEntity;
import io.renren.modules.dining.service.CommditySellStatisticsService;


@Service("commditySellStatisticsService")
public class CommditySellStatisticsServiceImpl extends ServiceImpl<CommditySellStatisticsDao, CommditySellStatisticsEntity> implements CommditySellStatisticsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommditySellStatisticsEntity> page = this.page(
                new Query<CommditySellStatisticsEntity>().getPage(params),
                new QueryWrapper<CommditySellStatisticsEntity>()
        );

        return new PageUtils(page);
    }

}