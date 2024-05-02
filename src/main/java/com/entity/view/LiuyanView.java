package com.entity.view;

import com.entity.LiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-28
 */
@TableName("liuyan")
public class LiuyanView extends LiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 留言类型的值
		*/
		private String liuyanValue;



		//级联表 yonghu
			/**
			* 员工编号
			*/
			private String yonghuNumber;
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 部门
			*/
			private Integer bumenTypes;
				/**
				* 部门的值
				*/
				private String bumenValue;
			/**
			* 职务
			*/
			private Integer zhiwuTypes;
				/**
				* 职务的值
				*/
				private String zhiwuValue;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 出生日期
			*/
			private Date chushengriqiTime;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 入职时间
			*/
			private Date ruzhiTime;
			/**
			* 详细介绍
			*/
			private String yonghuContent;

	public LiuyanView() {

	}

	public LiuyanView(LiuyanEntity liuyanEntity) {
		try {
			BeanUtils.copyProperties(this, liuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 留言类型的值
			*/
			public String getLiuyanValue() {
				return liuyanValue;
			}
			/**
			* 设置： 留言类型的值
			*/
			public void setLiuyanValue(String liuyanValue) {
				this.liuyanValue = liuyanValue;
			}




















				//级联表的get和set yonghu
					/**
					* 获取： 员工编号
					*/
					public String getYonghuNumber() {
						return yonghuNumber;
					}
					/**
					* 设置： 员工编号
					*/
					public void setYonghuNumber(String yonghuNumber) {
						this.yonghuNumber = yonghuNumber;
					}
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
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
					* 获取： 部门
					*/
					public Integer getBumenTypes() {
						return bumenTypes;
					}
					/**
					* 设置： 部门
					*/
					public void setBumenTypes(Integer bumenTypes) {
						this.bumenTypes = bumenTypes;
					}


						/**
						* 获取： 部门的值
						*/
						public String getBumenValue() {
							return bumenValue;
						}
						/**
						* 设置： 部门的值
						*/
						public void setBumenValue(String bumenValue) {
							this.bumenValue = bumenValue;
						}
					/**
					* 获取： 职务
					*/
					public Integer getZhiwuTypes() {
						return zhiwuTypes;
					}
					/**
					* 设置： 职务
					*/
					public void setZhiwuTypes(Integer zhiwuTypes) {
						this.zhiwuTypes = zhiwuTypes;
					}


						/**
						* 获取： 职务的值
						*/
						public String getZhiwuValue() {
							return zhiwuValue;
						}
						/**
						* 设置： 职务的值
						*/
						public void setZhiwuValue(String zhiwuValue) {
							this.zhiwuValue = zhiwuValue;
						}
					/**
					* 获取： 出生日期
					*/
					public Date getChushengriqiTime() {
						return chushengriqiTime;
					}
					/**
					* 设置： 出生日期
					*/
					public void setChushengriqiTime(Date chushengriqiTime) {
						this.chushengriqiTime = chushengriqiTime;
					}
					/**
					* 获取： 入职时间
					*/
					public Date getRuzhiTime() {
						return ruzhiTime;
					}
					/**
					* 设置： 入职时间
					*/
					public void setRuzhiTime(Date ruzhiTime) {
						this.ruzhiTime = ruzhiTime;
					}
					/**
					* 获取： 详细介绍
					*/
					public String getYonghuContent() {
						return yonghuContent;
					}
					/**
					* 设置： 详细介绍
					*/
					public void setYonghuContent(String yonghuContent) {
						this.yonghuContent = yonghuContent;
					}




}
