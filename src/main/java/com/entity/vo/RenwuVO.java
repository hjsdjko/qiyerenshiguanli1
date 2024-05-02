package com.entity.vo;

import com.entity.RenwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 任务
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-28
 */
@TableName("renwu")
public class RenwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 任务名称
     */

    @TableField(value = "renwu_name")
    private String renwuName;


    /**
     * 任务类型
     */

    @TableField(value = "renwu_types")
    private Integer renwuTypes;


    /**
     * 任务时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "renwu_time")
    private Date renwuTime;


    /**
     * 任务详情
     */

    @TableField(value = "renwu_content")
    private String renwuContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：任务名称
	 */
    public String getRenwuName() {
        return renwuName;
    }


    /**
	 * 获取：任务名称
	 */

    public void setRenwuName(String renwuName) {
        this.renwuName = renwuName;
    }
    /**
	 * 设置：任务类型
	 */
    public Integer getRenwuTypes() {
        return renwuTypes;
    }


    /**
	 * 获取：任务类型
	 */

    public void setRenwuTypes(Integer renwuTypes) {
        this.renwuTypes = renwuTypes;
    }
    /**
	 * 设置：任务时间
	 */
    public Date getRenwuTime() {
        return renwuTime;
    }


    /**
	 * 获取：任务时间
	 */

    public void setRenwuTime(Date renwuTime) {
        this.renwuTime = renwuTime;
    }
    /**
	 * 设置：任务详情
	 */
    public String getRenwuContent() {
        return renwuContent;
    }


    /**
	 * 获取：任务详情
	 */

    public void setRenwuContent(String renwuContent) {
        this.renwuContent = renwuContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
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

}
