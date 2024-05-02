package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwuEntity;
import java.util.Map;

/**
 * 任务 服务类
 * @author 
 * @since 2021-04-28
 */
public interface RenwuService extends IService<RenwuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}