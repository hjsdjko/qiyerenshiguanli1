package com.entity.model;

import com.entity.FuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 福利
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-28
 */
public class FuliModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 福利名字
     */
    private String fuliName;


    /**
     * 部门
     */
    private Integer bumenTypes;


    /**
     * 福利内容
     */
    private String fuliContent;


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
	 * 获取：福利名字
	 */
    public String getFuliName() {
        return fuliName;
    }


    /**
	 * 设置：福利名字
	 */
    public void setFuliName(String fuliName) {
        this.fuliName = fuliName;
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
	 * 获取：福利内容
	 */
    public String getFuliContent() {
        return fuliContent;
    }


    /**
	 * 设置：福利内容
	 */
    public void setFuliContent(String fuliContent) {
        this.fuliContent = fuliContent;
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
