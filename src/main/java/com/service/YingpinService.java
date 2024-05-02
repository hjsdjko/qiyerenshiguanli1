package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingpinEntity;
import java.util.Map;

/**
 * 应聘 服务类
 * @author 
 * @since 2021-04-28
 */
public interface YingpinService extends IService<YingpinEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}