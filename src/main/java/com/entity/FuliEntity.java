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
 * 福利
 *
 * @author 
 * @email
 * @date 2021-04-28
 */
@TableName("fuli")
public class FuliEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FuliEntity() {

	}

	public FuliEntity(T t) {
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
     * 福利名字
     */
    @TableField(value = "fuli_name")

    private String fuliName;


    /**
     * 部门
     */
    @TableField(value = "bumen_types")

    private Integer bumenTypes;


    /**
     * 福利内容
     */
    @TableField(value = "fuli_content")

    private String fuliContent;


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
	 * 设置：福利名字
	 */
    public String getFuliName() {
        return fuliName;
    }


    /**
	 * 获取：福利名字
	 */

    public void setFuliName(String fuliName) {
        this.fuliName = fuliName;
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
	 * 设置：福利内容
	 */
    public String getFuliContent() {
        return fuliContent;
    }


    /**
	 * 获取：福利内容
	 */

    public void setFuliContent(String fuliContent) {
        this.fuliContent = fuliContent;
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
        return "Fuli{" +
            "id=" + id +
            ", fuliName=" + fuliName +
            ", bumenTypes=" + bumenTypes +
            ", fuliContent=" + fuliContent +
            ", createTime=" + createTime +
        "}";
    }
}
