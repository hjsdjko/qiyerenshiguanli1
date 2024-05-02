package com.entity.vo;

import com.entity.FuliEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 福利
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-28
 */
@TableName("fuli")
public class FuliVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
