package com.entity.model;

import com.entity.XinziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 薪资
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-28
 */
public class XinziModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 月份
     */
    private String month;


    /**
     * 基本工资
     */
    private Double jibenMoney;


    /**
     * 加班费
     */
    private Double jiabanMoney;


    /**
     * 奖金
     */
    private Double jiangjinMoney;


    /**
     * 住房补贴
     */
    private Double zhufangMoney;


    /**
     * 吃饭补贴
     */
    private Double chifanMoney;


    /**
     * 工龄费
     */
    private Double gonglingMoney;


    /**
     * 考勤费
     */
    private Double kaoqinMoney;


    /**
     * 保险费
     */
    private Double baoxianfeiMoney;


    /**
     * 五险一金缴纳金额
     */
    private Double wuxianyijinMoney;


    /**
     * 罚款
     */
    private Double fakuanMoney;


    /**
     * 实发金额
     */
    private Double shifaMoney;


    /**
     * 备注
     */
    private String xinziContent;


    /**
     * 发放时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：月份
	 */
    public String getMonth() {
        return month;
    }


    /**
	 * 设置：月份
	 */
    public void setMonth(String month) {
        this.month = month;
    }
    /**
	 * 获取：基本工资
	 */
    public Double getJibenMoney() {
        return jibenMoney;
    }


    /**
	 * 设置：基本工资
	 */
    public void setJibenMoney(Double jibenMoney) {
        this.jibenMoney = jibenMoney;
    }
    /**
	 * 获取：加班费
	 */
    public Double getJiabanMoney() {
        return jiabanMoney;
    }


    /**
	 * 设置：加班费
	 */
    public void setJiabanMoney(Double jiabanMoney) {
        this.jiabanMoney = jiabanMoney;
    }
    /**
	 * 获取：奖金
	 */
    public Double getJiangjinMoney() {
        return jiangjinMoney;
    }


    /**
	 * 设置：奖金
	 */
    public void setJiangjinMoney(Double jiangjinMoney) {
        this.jiangjinMoney = jiangjinMoney;
    }
    /**
	 * 获取：住房补贴
	 */
    public Double getZhufangMoney() {
        return zhufangMoney;
    }


    /**
	 * 设置：住房补贴
	 */
    public void setZhufangMoney(Double zhufangMoney) {
        this.zhufangMoney = zhufangMoney;
    }
    /**
	 * 获取：吃饭补贴
	 */
    public Double getChifanMoney() {
        return chifanMoney;
    }


    /**
	 * 设置：吃饭补贴
	 */
    public void setChifanMoney(Double chifanMoney) {
        this.chifanMoney = chifanMoney;
    }
    /**
	 * 获取：工龄费
	 */
    public Double getGonglingMoney() {
        return gonglingMoney;
    }


    /**
	 * 设置：工龄费
	 */
    public void setGonglingMoney(Double gonglingMoney) {
        this.gonglingMoney = gonglingMoney;
    }
    /**
	 * 获取：考勤费
	 */
    public Double getKaoqinMoney() {
        return kaoqinMoney;
    }


    /**
	 * 设置：考勤费
	 */
    public void setKaoqinMoney(Double kaoqinMoney) {
        this.kaoqinMoney = kaoqinMoney;
    }
    /**
	 * 获取：保险费
	 */
    public Double getBaoxianfeiMoney() {
        return baoxianfeiMoney;
    }


    /**
	 * 设置：保险费
	 */
    public void setBaoxianfeiMoney(Double baoxianfeiMoney) {
        this.baoxianfeiMoney = baoxianfeiMoney;
    }
    /**
	 * 获取：五险一金缴纳金额
	 */
    public Double getWuxianyijinMoney() {
        return wuxianyijinMoney;
    }


    /**
	 * 设置：五险一金缴纳金额
	 */
    public void setWuxianyijinMoney(Double wuxianyijinMoney) {
        this.wuxianyijinMoney = wuxianyijinMoney;
    }
    /**
	 * 获取：罚款
	 */
    public Double getFakuanMoney() {
        return fakuanMoney;
    }


    /**
	 * 设置：罚款
	 */
    public void setFakuanMoney(Double fakuanMoney) {
        this.fakuanMoney = fakuanMoney;
    }
    /**
	 * 获取：实发金额
	 */
    public Double getShifaMoney() {
        return shifaMoney;
    }


    /**
	 * 设置：实发金额
	 */
    public void setShifaMoney(Double shifaMoney) {
        this.shifaMoney = shifaMoney;
    }
    /**
	 * 获取：备注
	 */
    public String getXinziContent() {
        return xinziContent;
    }


    /**
	 * 设置：备注
	 */
    public void setXinziContent(String xinziContent) {
        this.xinziContent = xinziContent;
    }
    /**
	 * 获取：发放时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发放时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
