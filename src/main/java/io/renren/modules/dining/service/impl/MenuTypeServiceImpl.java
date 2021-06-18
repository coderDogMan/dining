package io.renren.modules.dining.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.dining.dao.MenuTypeDao;
import io.renren.modules.dining.entity.MenuTypeEntity;
import io.renren.modules.dining.service.MenuTypeService;


@Service("menuTypeService")
public class MenuTypeServiceImpl extends ServiceImpl<MenuTypeDao, MenuTypeEntity> implements MenuTypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MenuTypeEntity> page = this.page(
                new Query<MenuTypeEntity>().getPage(params),
                new QueryWrapper<MenuTypeEntity>()
        );

        return new PageUtils(page);
    }

}