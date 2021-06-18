package io.renren.modules.dining.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.dining.dao.WechatUserDao;
import io.renren.modules.dining.entity.WechatUserEntity;
import io.renren.modules.dining.service.WechatUserService;


@Service("wechatUserService")
public class WechatUserServiceImpl extends ServiceImpl<WechatUserDao, WechatUserEntity> implements WechatUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WechatUserEntity> page = this.page(
                new Query<WechatUserEntity>().getPage(params),
                new QueryWrapper<WechatUserEntity>()
        );

        return new PageUtils(page);
    }

}