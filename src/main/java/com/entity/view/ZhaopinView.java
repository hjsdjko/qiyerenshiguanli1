package com.entity.view;

import com.entity.ZhaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 招聘
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-28
 */
@TableName("zhaopin")
public class ZhaopinView extends ZhaopinEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 招聘类型的值
		*/
		private String zhaopinValue;



	public ZhaopinView() {

	}

	public ZhaopinView(ZhaopinEntity zhaopinEntity) {
		try {
			BeanUtils.copyProperties(this, zhaopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 招聘类型的值
			*/
			public String getZhaopinValue() {
				return zhaopinValue;
			}
			/**
			* 设置： 招聘类型的值
			*/
			public void setZhaopinValue(String zhaopinValue) {
				this.zhaopinValue = zhaopinValue;
			}













}
