package io.renren.modules.dining.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.dining.dao.RefundDao;
import io.renren.modules.dining.entity.RefundEntity;
import io.renren.modules.dining.service.RefundService;


@Service("refundService")
public class RefundServiceImpl extends ServiceImpl<RefundDao, RefundEntity> implements RefundService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RefundEntity> page = this.page(
                new Query<RefundEntity>().getPage(params),
                new QueryWrapper<RefundEntity>()
        );

        return new PageUtils(page);
    }

}