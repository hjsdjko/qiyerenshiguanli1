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
 * 招聘
 *
 * @author 
 * @email
 * @date 2021-04-28
 */
@TableName("zhaopin")
public class ZhaopinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhaopinEntity() {

	}

	public ZhaopinEntity(T t) {
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
     * 招聘名字
     */
    @TableField(value = "zhaopin_name")

    private String zhaopinName;


    /**
     * 招聘类型
     */
    @TableField(value = "zhaopin_types")

    private Integer zhaopinTypes;


    /**
     * 招聘时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "zhaopin_time",fill = FieldFill.UPDATE)

    private Date zhaopinTime;


    /**
     * 招聘人数
     */
    @TableField(value = "zhaopin_number")

    private Integer zhaopinNumber;


    /**
     * 招聘详情
     */
    @TableField(value = "zhaopin_content")

    private String zhaopinContent;


    /**
     * 添加时间
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
	 * 设置：招聘名字
	 */
    public String getZhaopinName() {
        return zhaopinName;
    }


    /**
	 * 获取：招聘名字
	 */

    public void setZhaopinName(String zhaopinName) {
        this.zhaopinName = zhaopinName;
    }
    /**
	 * 设置：招聘类型
	 */
    public Integer getZhaopinTypes() {
        return zhaopinTypes;
    }


    /**
	 * 获取：招聘类型
	 */

    public void setZhaopinTypes(Integer zhaopinTypes) {
        this.zhaopinTypes = zhaopinTypes;
    }
    /**
	 * 设置：招聘时间
	 */
    public Date getZhaopinTime() {
        return zhaopinTime;
    }


    /**
	 * 获取：招聘时间
	 */

    public void setZhaopinTime(Date zhaopinTime) {
        this.zhaopinTime = zhaopinTime;
    }
    /**
	 * 设置：招聘人数
	 */
    public Integer getZhaopinNumber() {
        return zhaopinNumber;
    }


    /**
	 * 获取：招聘人数
	 */

    public void setZhaopinNumber(Integer zhaopinNumber) {
        this.zhaopinNumber = zhaopinNumber;
    }
    /**
	 * 设置：招聘详情
	 */
    public String getZhaopinContent() {
        return zhaopinContent;
    }


    /**
	 * 获取：招聘详情
	 */

    public void setZhaopinContent(String zhaopinContent) {
        this.zhaopinContent = zhaopinContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
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
        return "Zhaopin{" +
            "id=" + id +
            ", zhaopinName=" + zhaopinName +
            ", zhaopinTypes=" + zhaopinTypes +
            ", zhaopinTime=" + zhaopinTime +
            ", zhaopinNumber=" + zhaopinNumber +
            ", zhaopinContent=" + zhaopinContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
