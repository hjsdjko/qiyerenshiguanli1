package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.YingpinEntity;

import com.service.YingpinService;
import com.entity.view.YingpinView;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 应聘
 * 后端接口
 * @author
 * @email
 * @date 2021-04-28
*/
@RestController
@Controller
@RequestMapping("/yingpin")
public class YingpinController {
    private static final Logger logger = LoggerFactory.getLogger(YingpinController.class);

    @Autowired
    private YingpinService yingpinService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = yingpinService.queryPage(params);

        //字典表数据转换
        List<YingpinView> list =(List<YingpinView>)page.getList();
        for(YingpinView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YingpinEntity yingpin = yingpinService.selectById(id);
        if(yingpin !=null){
            //entity转view
            YingpinView view = new YingpinView();
            BeanUtils.copyProperties( yingpin , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody YingpinEntity yingpin, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,yingpin:{}",this.getClass().getName(),yingpin.toString());
        Wrapper<YingpinEntity> queryWrapper = new EntityWrapper<YingpinEntity>()
            .eq("yingpin_name", yingpin.getYingpinName())
            .eq("yingpin_phone", yingpin.getYingpinPhone())
            .eq("yingpin_id_number", yingpin.getYingpinIdNumber())
            .eq("sex_types", yingpin.getSexTypes())
            .eq("yingpin_zhiwei", yingpin.getYingpinZhiwei())
            .eq("luyong_types", yingpin.getLuyongTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YingpinEntity yingpinEntity = yingpinService.selectOne(queryWrapper);
        if(yingpinEntity==null){
            yingpin.setInsertTime(new Date());
            yingpin.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      yingpin.set
        //  }
            yingpinService.insert(yingpin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YingpinEntity yingpin, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,yingpin:{}",this.getClass().getName(),yingpin.toString());
        //根据字段查询是否有相同数据
        Wrapper<YingpinEntity> queryWrapper = new EntityWrapper<YingpinEntity>()
            .notIn("id",yingpin.getId())
            .andNew()
            .eq("yingpin_name", yingpin.getYingpinName())
            .eq("yingpin_phone", yingpin.getYingpinPhone())
            .eq("yingpin_id_number", yingpin.getYingpinIdNumber())
            .eq("sex_types", yingpin.getSexTypes())
            .eq("yingpin_zhiwei", yingpin.getYingpinZhiwei())
            .eq("luyong_types", yingpin.getLuyongTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YingpinEntity yingpinEntity = yingpinService.selectOne(queryWrapper);
        if("".equals(yingpin.getYonghuPhoto()) || "null".equals(yingpin.getYonghuPhoto())){
                yingpin.setYonghuPhoto(null);
        }
        if(yingpinEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      yingpin.set
            //  }
            yingpinService.updateById(yingpin);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        yingpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }






}

