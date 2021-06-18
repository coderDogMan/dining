package io.renren.modules.dining.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.dining.dao.CommdityKindDao;
import io.renren.modules.dining.entity.CommdityKindEntity;
import io.renren.modules.dining.service.CommdityKindService;


@Service("commdityKindService")
public class CommdityKindServiceImpl extends ServiceImpl<CommdityKindDao, CommdityKindEntity> implements CommdityKindService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommdityKindEntity> page = this.page(
                new Query<CommdityKindEntity>().getPage(params),
                new QueryWrapper<CommdityKindEntity>()
        );

        return new PageUtils(page);
    }

}