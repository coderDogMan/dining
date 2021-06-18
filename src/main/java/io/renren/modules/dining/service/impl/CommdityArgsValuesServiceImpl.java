package io.renren.modules.dining.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.dining.dao.CommdityArgsValuesDao;
import io.renren.modules.dining.entity.CommdityArgsValuesEntity;
import io.renren.modules.dining.service.CommdityArgsValuesService;


@Service("commdityArgsValuesService")
public class CommdityArgsValuesServiceImpl extends ServiceImpl<CommdityArgsValuesDao, CommdityArgsValuesEntity> implements CommdityArgsValuesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommdityArgsValuesEntity> page = this.page(
                new Query<CommdityArgsValuesEntity>().getPage(params),
                new QueryWrapper<CommdityArgsValuesEntity>()
        );

        return new PageUtils(page);
    }

}