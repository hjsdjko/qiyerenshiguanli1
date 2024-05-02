package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaopinEntity;
import java.util.Map;

/**
 * 招聘 服务类
 * @author 
 * @since 2021-04-28
 */
public interface ZhaopinService extends IService<ZhaopinEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}