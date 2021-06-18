package io.renren.modules.dining.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.dining.dao.DiningTableDao;
import io.renren.modules.dining.entity.DiningTableEntity;
import io.renren.modules.dining.service.DiningTableService;


@Service("diningTableService")
public class DiningTableServiceImpl extends ServiceImpl<DiningTableDao, DiningTableEntity> implements DiningTableService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DiningTableEntity> page = this.page(
                new Query<DiningTableEntity>().getPage(params),
                new QueryWrapper<DiningTableEntity>()
        );

        return new PageUtils(page);
    }

}