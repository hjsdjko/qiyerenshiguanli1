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
 * 应聘
 *
 * @author 
 * @email
 * @date 2021-04-28
 */
@TableName("yingpin")
public class YingpinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YingpinEntity() {

	}

	public YingpinEntity(T t) {
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
     * 姓名
     */
    @TableField(value = "yingpin_name")

    private String yingpinName;


    /**
     * 手机号
     */
    @TableField(value = "yingpin_phone")

    private String yingpinPhone;


    /**
     * 身份证号
     */
    @TableField(value = "yingpin_id_number")

    private String yingpinIdNumber;


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
     * 应聘职位
     */
    @TableField(value = "yingpin_zhiwei")

    private String yingpinZhiwei;


    /**
     * 详情
     */
    @TableField(value = "yonghu_content")

    private String yonghuContent;


    /**
     * 是否录用
     */
    @TableField(value = "luyong_types")

    private Integer luyongTypes;


    /**
     * 应聘时间
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
	 * 设置：姓名
	 */
    public String getYingpinName() {
        return yingpinName;
    }


    /**
	 * 获取：姓名
	 */

    public void setYingpinName(String yingpinName) {
        this.yingpinName = yingpinName;
    }
    /**
	 * 设置：手机号
	 */
    public String getYingpinPhone() {
        return yingpinPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setYingpinPhone(String yingpinPhone) {
        this.yingpinPhone = yingpinPhone;
    }
    /**
	 * 设置：身份证号
	 */
    public String getYingpinIdNumber() {
        return yingpinIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setYingpinIdNumber(String yingpinIdNumber) {
        this.yingpinIdNumber = yingpinIdNumber;
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
	 * 设置：应聘职位
	 */
    public String getYingpinZhiwei() {
        return yingpinZhiwei;
    }


    /**
	 * 获取：应聘职位
	 */

    public void setYingpinZhiwei(String yingpinZhiwei) {
        this.yingpinZhiwei = yingpinZhiwei;
    }
    /**
	 * 设置：详情
	 */
    public String getYonghuContent() {
        return yonghuContent;
    }


    /**
	 * 获取：详情
	 */

    public void setYonghuContent(String yonghuContent) {
        this.yonghuContent = yonghuContent;
    }
    /**
	 * 设置：是否录用
	 */
    public Integer getLuyongTypes() {
        return luyongTypes;
    }


    /**
	 * 获取：是否录用
	 */

    public void setLuyongTypes(Integer luyongTypes) {
        this.luyongTypes = luyongTypes;
    }
    /**
	 * 设置：应聘时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：应聘时间
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
        return "Yingpin{" +
            "id=" + id +
            ", yingpinName=" + yingpinName +
            ", yingpinPhone=" + yingpinPhone +
            ", yingpinIdNumber=" + yingpinIdNumber +
            ", yonghuPhoto=" + yonghuPhoto +
            ", sexTypes=" + sexTypes +
            ", yingpinZhiwei=" + yingpinZhiwei +
            ", yonghuContent=" + yonghuContent +
            ", luyongTypes=" + luyongTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
