package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 用户
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-28
 */
public class YonghuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


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
     * 部门
     */
    private Integer bumenTypes;


    /**
     * 职务
     */
    private Integer zhiwuTypes;


    /**
     * 出生日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date chushengriqiTime;


    /**
     * 入职时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date ruzhiTime;


    /**
     * 详细介绍
     */
    private String yonghuContent;


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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：员工编号
	 */
    public String getYonghuNumber() {
        return yonghuNumber;
    }


    /**
	 * 设置：员工编号
	 */
    public void setYonghuNumber(String yonghuNumber) {
        this.yonghuNumber = yonghuNumber;
    }
    /**
	 * 获取：姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 设置：姓名
	 */
    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 获取：手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 获取：身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 获取：照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 设置：部门
	 */
    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 获取：职务
	 */
    public Integer getZhiwuTypes() {
        return zhiwuTypes;
    }


    /**
	 * 设置：职务
	 */
    public void setZhiwuTypes(Integer zhiwuTypes) {
        this.zhiwuTypes = zhiwuTypes;
    }
    /**
	 * 获取：出生日期
	 */
    public Date getChushengriqiTime() {
        return chushengriqiTime;
    }


    /**
	 * 设置：出生日期
	 */
    public void setChushengriqiTime(Date chushengriqiTime) {
        this.chushengriqiTime = chushengriqiTime;
    }
    /**
	 * 获取：入职时间
	 */
    public Date getRuzhiTime() {
        return ruzhiTime;
    }


    /**
	 * 设置：入职时间
	 */
    public void setRuzhiTime(Date ruzhiTime) {
        this.ruzhiTime = ruzhiTime;
    }
    /**
	 * 获取：详细介绍
	 */
    public String getYonghuContent() {
        return yonghuContent;
    }


    /**
	 * 设置：详细介绍
	 */
    public void setYonghuContent(String yonghuContent) {
        this.yonghuContent = yonghuContent;
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
