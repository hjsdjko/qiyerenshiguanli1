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
 * 留言
 *
 * @author 
 * @email
 * @date 2021-04-28
 */
@TableName("liuyan")
public class LiuyanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LiuyanEntity() {

	}

	public LiuyanEntity(T t) {
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
     * 留言名称
     */
    @TableField(value = "liuyan_name")

    private String liuyanName;


    /**
     * 留言类型
     */
    @TableField(value = "liuyan_types")

    private Integer liuyanTypes;


    /**
     * 留言时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 留言详情
     */
    @TableField(value = "liuyan_content")

    private String liuyanContent;


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
	 * 设置：留言名称
	 */
    public String getLiuyanName() {
        return liuyanName;
    }


    /**
	 * 获取：留言名称
	 */

    public void setLiuyanName(String liuyanName) {
        this.liuyanName = liuyanName;
    }
    /**
	 * 设置：留言类型
	 */
    public Integer getLiuyanTypes() {
        return liuyanTypes;
    }


    /**
	 * 获取：留言类型
	 */

    public void setLiuyanTypes(Integer liuyanTypes) {
        this.liuyanTypes = liuyanTypes;
    }
    /**
	 * 设置：留言时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：留言时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：留言详情
	 */
    public String getLiuyanContent() {
        return liuyanContent;
    }


    /**
	 * 获取：留言详情
	 */

    public void setLiuyanContent(String liuyanContent) {
        this.liuyanContent = liuyanContent;
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
        return "Liuyan{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", liuyanName=" + liuyanName +
            ", liuyanTypes=" + liuyanTypes +
            ", insertTime=" + insertTime +
            ", liuyanContent=" + liuyanContent +
            ", createTime=" + createTime +
        "}";
    }
}
