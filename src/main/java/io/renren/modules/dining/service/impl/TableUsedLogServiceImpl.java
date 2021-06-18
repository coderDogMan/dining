package io.renren.modules.dining.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.dining.dao.TableUsedLogDao;
import io.renren.modules.dining.entity.TableUsedLogEntity;
import io.renren.modules.dining.service.TableUsedLogService;


@Service("tableUsedLogService")
public class TableUsedLogServiceImpl extends ServiceImpl<TableUsedLogDao, TableUsedLogEntity> implements TableUsedLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TableUsedLogEntity> page = this.page(
                new Query<TableUsedLogEntity>().getPage(params),
                new QueryWrapper<TableUsedLogEntity>()
        );

        return new PageUtils(page);
    }

}