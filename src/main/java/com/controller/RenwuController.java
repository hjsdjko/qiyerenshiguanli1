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

import com.entity.RenwuEntity;

import com.service.RenwuService;
import com.entity.view.RenwuView;
import com.service.YonghuService;
import com.entity.YonghuEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 任务
 * 后端接口
 * @author
 * @email
 * @date 2021-04-28
*/
@RestController
@Controller
@RequestMapping("/renwu")
public class RenwuController {
    private static final Logger logger = LoggerFactory.getLogger(RenwuController.class);

    @Autowired
    private RenwuService renwuService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private YonghuService yonghuService;


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
        PageUtils page = renwuService.queryPage(params);

        //字典表数据转换
        List<RenwuView> list =(List<RenwuView>)page.getList();
        for(RenwuView c:list){
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
        RenwuEntity renwu = renwuService.selectById(id);
        if(renwu !=null){
            //entity转view
            RenwuView view = new RenwuView();
            BeanUtils.copyProperties( renwu , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(renwu.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
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
    public R save(@RequestBody RenwuEntity renwu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,renwu:{}",this.getClass().getName(),renwu.toString());
        Wrapper<RenwuEntity> queryWrapper = new EntityWrapper<RenwuEntity>()
            .eq("yonghu_id", renwu.getYonghuId())
            .eq("renwu_name", renwu.getRenwuName())
            .eq("renwu_types", renwu.getRenwuTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        RenwuEntity renwuEntity = renwuService.selectOne(queryWrapper);
        if(renwuEntity==null){
            renwu.setInsertTime(new Date());
            renwu.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      renwu.set
        //  }
            renwuService.insert(renwu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody RenwuEntity renwu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,renwu:{}",this.getClass().getName(),renwu.toString());
        //根据字段查询是否有相同数据
        Wrapper<RenwuEntity> queryWrapper = new EntityWrapper<RenwuEntity>()
            .notIn("id",renwu.getId())
            .andNew()
            .eq("yonghu_id", renwu.getYonghuId())
            .eq("renwu_name", renwu.getRenwuName())
            .eq("renwu_types", renwu.getRenwuTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        RenwuEntity renwuEntity = renwuService.selectOne(queryWrapper);
        if(renwuEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      renwu.set
            //  }
            renwuService.updateById(renwu);//根据id更新
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
        renwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }






}

