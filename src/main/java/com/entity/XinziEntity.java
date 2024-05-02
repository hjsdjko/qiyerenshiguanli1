package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 薪资
 *
 * @author 
 * @email
 * @date 2021-04-28
 */
@TableName("xinzi")
public class XinziEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinziEntity() {

	}

	public XinziEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 月份
     */
    @TableField(value = "month")

    private String month;


    /**
     * 基本工资
     */
    @TableField(value = "jiben_money")

    private Double jibenMoney;


    /**
     * 加班费
     */
    @TableField(value = "jiaban_money")

    private Double jiabanMoney;


    /**
     * 奖金
     */
    @TableField(value = "jiangjin_money")

    private Double jiangjinMoney;


    /**
     * 住房补贴
     */
    @TableField(value = "zhufang_money")

    private Double zhufangMoney;


    /**
     * 吃饭补贴
     */
    @TableField(value = "chifan_money")

    private Double chifanMoney;


    /**
     * 工龄费
     */
    @TableField(value = "gongling_money")

    private Double gonglingMoney;


    /**
     * 考勤费
     */
    @TableField(value = "kaoqin_money")

    private Double kaoqinMoney;


    /**
     * 保险费
     */
    @TableField(value = "baoxianfei_money")

    private Double baoxianfeiMoney;


    /**
     * 五险一金缴纳金额
     */
    @TableField(value = "wuxianyijin_money")

    private Double wuxianyijinMoney;


    /**
     * 罚款
     */
    @TableField(value = "fakuan_money")

    private Double fakuanMoney;


    /**
     * 实发金额
     */
    @TableField(value = "shifa_money")

    private Double shifaMoney;


    /**
     * 备注
     */
    @TableField(value = "xinzi_content")

    private String xinziContent;


    /**
     * 发放时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：月份
	 */
    public String getMonth() {
        return month;
    }


    /**
	 * 获取：月份
	 */

    public void setMonth(String month) {
        this.month = month;
    }
    /**
	 * 设置：基本工资
	 */
    public Double getJibenMoney() {
        return jibenMoney;
    }


    /**
	 * 获取：基本工资
	 */

    public void setJibenMoney(Double jibenMoney) {
        this.jibenMoney = jibenMoney;
    }
    /**
	 * 设置：加班费
	 */
    public Double getJiabanMoney() {
        return jiabanMoney;
    }


    /**
	 * 获取：加班费
	 */

    public void setJiabanMoney(Double jiabanMoney) {
        this.jiabanMoney = jiabanMoney;
    }
    /**
	 * 设置：奖金
	 */
    public Double getJiangjinMoney() {
        return jiangjinMoney;
    }


    /**
	 * 获取：奖金
	 */

    public void setJiangjinMoney(Double jiangjinMoney) {
        this.jiangjinMoney = jiangjinMoney;
    }
    /**
	 * 设置：住房补贴
	 */
    public Double getZhufangMoney() {
        return zhufangMoney;
    }


    /**
	 * 获取：住房补贴
	 */

    public void setZhufangMoney(Double zhufangMoney) {
        this.zhufangMoney = zhufangMoney;
    }
    /**
	 * 设置：吃饭补贴
	 */
    public Double getChifanMoney() {
        return chifanMoney;
    }


    /**
	 * 获取：吃饭补贴
	 */

    public void setChifanMoney(Double chifanMoney) {
        this.chifanMoney = chifanMoney;
    }
    /**
	 * 设置：工龄费
	 */
    public Double getGonglingMoney() {
        return gonglingMoney;
    }


    /**
	 * 获取：工龄费
	 */

    public void setGonglingMoney(Double gonglingMoney) {
        this.gonglingMoney = gonglingMoney;
    }
    /**
	 * 设置：考勤费
	 */
    public Double getKaoqinMoney() {
        return kaoqinMoney;
    }


    /**
	 * 获取：考勤费
	 */

    public void setKaoqinMoney(Double kaoqinMoney) {
        this.kaoqinMoney = kaoqinMoney;
    }
    /**
	 * 设置：保险费
	 */
    public Double getBaoxianfeiMoney() {
        return baoxianfeiMoney;
    }


    /**
	 * 获取：保险费
	 */

    public void setBaoxianfeiMoney(Double baoxianfeiMoney) {
        this.baoxianfeiMoney = baoxianfeiMoney;
    }
    /**
	 * 设置：五险一金缴纳金额
	 */
    public Double getWuxianyijinMoney() {
        return wuxianyijinMoney;
    }


    /**
	 * 获取：五险一金缴纳金额
	 */

    public void setWuxianyijinMoney(Double wuxianyijinMoney) {
        this.wuxianyijinMoney = wuxianyijinMoney;
    }
    /**
	 * 设置：罚款
	 */
    public Double getFakuanMoney() {
        return fakuanMoney;
    }


    /**
	 * 获取：罚款
	 */

    public void setFakuanMoney(Double fakuanMoney) {
        this.fakuanMoney = fakuanMoney;
    }
    /**
	 * 设置：实发金额
	 */
    public Double getShifaMoney() {
        return shifaMoney;
    }


    /**
	 * 获取：实发金额
	 */

    public void setShifaMoney(Double shifaMoney) {
        this.shifaMoney = shifaMoney;
    }
    /**
	 * 设置：备注
	 */
    public String getXinziContent() {
        return xinziContent;
    }


    /**
	 * 获取：备注
	 */

    public void setXinziContent(String xinziContent) {
        this.xinziContent = xinziContent;
    }
    /**
	 * 设置：发放时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发放时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xinzi{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", month=" + month +
            ", jibenMoney=" + jibenMoney +
            ", jiabanMoney=" + jiabanMoney +
            ", jiangjinMoney=" + jiangjinMoney +
            ", zhufangMoney=" + zhufangMoney +
            ", chifanMoney=" + chifanMoney +
            ", gonglingMoney=" + gonglingMoney +
            ", kaoqinMoney=" + kaoqinMoney +
            ", baoxianfeiMoney=" + baoxianfeiMoney +
            ", wuxianyijinMoney=" + wuxianyijinMoney +
            ", fakuanMoney=" + fakuanMoney +
            ", shifaMoney=" + shifaMoney +
            ", xinziContent=" + xinziContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
