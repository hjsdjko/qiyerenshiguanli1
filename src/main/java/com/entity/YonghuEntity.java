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
 * 用户
 *
 * @author 
 * @email
 * @date 2021-04-28
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YonghuEntity() {

	}

	public YonghuEntity(T t) {
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
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 员工编号
     */
    @TableField(value = "yonghu_number")

    private String yonghuNumber;


    /**
     * 姓名
     */
    @TableField(value = "yonghu_name")

    private String yonghuName;


    /**
     * 手机号
     */
    @TableField(value = "yonghu_phone")

    private String yonghuPhone;


    /**
     * 身份证号
     */
    @TableField(value = "yonghu_id_number")

    private String yonghuIdNumber;


    /**
     * 照片
     */
    @TableField(value = "yonghu_photo")

    private String yonghuPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 部门
     */
    @TableField(value = "bumen_types")

    private Integer bumenTypes;


    /**
     * 职务
     */
    @TableField(value = "zhiwu_types")

    private Integer zhiwuTypes;


    /**
     * 出生日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "chushengriqi_time",fill = FieldFill.UPDATE)

    private Date chushengriqiTime;


    /**
     * 入职时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "ruzhi_time",fill = FieldFill.UPDATE)

    private Date ruzhiTime;


    /**
     * 详细介绍
     */
    @TableField(value = "yonghu_content")

    private String yonghuContent;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：员工编号
	 */
    public String getYonghuNumber() {
        return yonghuNumber;
    }


    /**
	 * 获取：员工编号
	 */

    public void setYonghuNumber(String yonghuNumber) {
        this.yonghuNumber = yonghuNumber;
    }
    /**
	 * 设置：姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 获取：姓名
	 */

    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 设置：手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 设置：身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 设置：照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 获取：部门
	 */

    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 设置：职务
	 */
    public Integer getZhiwuTypes() {
        return zhiwuTypes;
    }


    /**
	 * 获取：职务
	 */

    public void setZhiwuTypes(Integer zhiwuTypes) {
        this.zhiwuTypes = zhiwuTypes;
    }
    /**
	 * 设置：出生日期
	 */
    public Date getChushengriqiTime() {
        return chushengriqiTime;
    }


    /**
	 * 获取：出生日期
	 */

    public void setChushengriqiTime(Date chushengriqiTime) {
        this.chushengriqiTime = chushengriqiTime;
    }
    /**
	 * 设置：入职时间
	 */
    public Date getRuzhiTime() {
        return ruzhiTime;
    }


    /**
	 * 获取：入职时间
	 */

    public void setRuzhiTime(Date ruzhiTime) {
        this.ruzhiTime = ruzhiTime;
    }
    /**
	 * 设置：详细介绍
	 */
    public String getYonghuContent() {
        return yonghuContent;
    }


    /**
	 * 获取：详细介绍
	 */

    public void setYonghuContent(String yonghuContent) {
        this.yonghuContent = yonghuContent;
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
        return "Yonghu{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yonghuNumber=" + yonghuNumber +
            ", yonghuName=" + yonghuName +
            ", yonghuPhone=" + yonghuPhone +
            ", yonghuIdNumber=" + yonghuIdNumber +
            ", yonghuPhoto=" + yonghuPhoto +
            ", sexTypes=" + sexTypes +
            ", bumenTypes=" + bumenTypes +
            ", zhiwuTypes=" + zhiwuTypes +
            ", chushengriqiTime=" + chushengriqiTime +
            ", ruzhiTime=" + ruzhiTime +
            ", yonghuContent=" + yonghuContent +
            ", createTime=" + createTime +
        "}";
    }
}
