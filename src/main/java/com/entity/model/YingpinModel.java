package com.entity.model;

import com.entity.YingpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 应聘
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-28
 */
public class YingpinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 姓名
     */
    private String yingpinName;


    /**
     * 手机号
     */
    private String yingpinPhone;


    /**
     * 身份证号
     */
    private String yingpinIdNumber;


    /**
     * 照片
     */
    private String yonghuPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 应聘职位
     */
    private String yingpinZhiwei;


    /**
     * 详情
     */
    private String yonghuContent;


    /**
     * 是否录用
     */
    private Integer luyongTypes;


    /**
     * 应聘时间
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
	 * 获取：姓名
	 */
    public String getYingpinName() {
        return yingpinName;
    }


    /**
	 * 设置：姓名
	 */
    public void setYingpinName(String yingpinName) {
        this.yingpinName = yingpinName;
    }
    /**
	 * 获取：手机号
	 */
    public String getYingpinPhone() {
        return yingpinPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setYingpinPhone(String yingpinPhone) {
        this.yingpinPhone = yingpinPhone;
    }
    /**
	 * 获取：身份证号
	 */
    public String getYingpinIdNumber() {
        return yingpinIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setYingpinIdNumber(String yingpinIdNumber) {
        this.yingpinIdNumber = yingpinIdNumber;
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
	 * 获取：应聘职位
	 */
    public String getYingpinZhiwei() {
        return yingpinZhiwei;
    }


    /**
	 * 设置：应聘职位
	 */
    public void setYingpinZhiwei(String yingpinZhiwei) {
        this.yingpinZhiwei = yingpinZhiwei;
    }
    /**
	 * 获取：详情
	 */
    public String getYonghuContent() {
        return yonghuContent;
    }


    /**
	 * 设置：详情
	 */
    public void setYonghuContent(String yonghuContent) {
        this.yonghuContent = yonghuContent;
    }
    /**
	 * 获取：是否录用
	 */
    public Integer getLuyongTypes() {
        return luyongTypes;
    }


    /**
	 * 设置：是否录用
	 */
    public void setLuyongTypes(Integer luyongTypes) {
        this.luyongTypes = luyongTypes;
    }
    /**
	 * 获取：应聘时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：应聘时间
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
