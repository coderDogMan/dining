package io.renren.modules.dining.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.dining.dao.RefundDetailDao;
import io.renren.modules.dining.entity.RefundDetailEntity;
import io.renren.modules.dining.service.RefundDetailService;


@Service("refundDetailService")
public class RefundDetailServiceImpl extends ServiceImpl<RefundDetailDao, RefundDetailEntity> implements RefundDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RefundDetailEntity> page = this.page(
                new Query<RefundDetailEntity>().getPage(params),
                new QueryWrapper<RefundDetailEntity>()
        );

        return new PageUtils(page);
    }

}