package com.entity.view;

import com.entity.YingpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 应聘
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-28
 */
@TableName("yingpin")
public class YingpinView extends YingpinEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 是否录用的值
		*/
		private String luyongValue;



	public YingpinView() {

	}

	public YingpinView(YingpinEntity yingpinEntity) {
		try {
			BeanUtils.copyProperties(this, yingpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
			/**
			* 获取： 是否录用的值
			*/
			public String getLuyongValue() {
				return luyongValue;
			}
			/**
			* 设置： 是否录用的值
			*/
			public void setLuyongValue(String luyongValue) {
				this.luyongValue = luyongValue;
			}













}
