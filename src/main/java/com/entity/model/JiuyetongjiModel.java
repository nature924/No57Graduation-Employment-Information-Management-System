package com.entity.model;

import com.entity.JiuyetongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 就业统计
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiuyetongjiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 应聘公司
     */
    private String zhaopinName;


    /**
     * 月薪
     */
    private String zhaopinYuexin;


    /**
     * 就业薪资
     */
    private String zhaopinXinzi;


    /**
     * 是否就业
     */
    private Integer jiuyetongjiTypes;


    /**
     * 审核状态
     */
    private Integer jiuyetongjiYesnoTypes;


    /**
     * 审核留言
     */
    private String jiuyetongjiYesnoText;


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
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：应聘公司
	 */
    public String getZhaopinName() {
        return zhaopinName;
    }


    /**
	 * 设置：应聘公司
	 */
    public void setZhaopinName(String zhaopinName) {
        this.zhaopinName = zhaopinName;
    }
    /**
	 * 获取：月薪
	 */
    public String getZhaopinYuexin() {
        return zhaopinYuexin;
    }


    /**
	 * 设置：月薪
	 */
    public void setZhaopinYuexin(String zhaopinYuexin) {
        this.zhaopinYuexin = zhaopinYuexin;
    }
    /**
	 * 获取：就业薪资
	 */
    public String getZhaopinXinzi() {
        return zhaopinXinzi;
    }


    /**
	 * 设置：就业薪资
	 */
    public void setZhaopinXinzi(String zhaopinXinzi) {
        this.zhaopinXinzi = zhaopinXinzi;
    }
    /**
	 * 获取：是否就业
	 */
    public Integer getJiuyetongjiTypes() {
        return jiuyetongjiTypes;
    }


    /**
	 * 设置：是否就业
	 */
    public void setJiuyetongjiTypes(Integer jiuyetongjiTypes) {
        this.jiuyetongjiTypes = jiuyetongjiTypes;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getJiuyetongjiYesnoTypes() {
        return jiuyetongjiYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setJiuyetongjiYesnoTypes(Integer jiuyetongjiYesnoTypes) {
        this.jiuyetongjiYesnoTypes = jiuyetongjiYesnoTypes;
    }
    /**
	 * 获取：审核留言
	 */
    public String getJiuyetongjiYesnoText() {
        return jiuyetongjiYesnoText;
    }


    /**
	 * 设置：审核留言
	 */
    public void setJiuyetongjiYesnoText(String jiuyetongjiYesnoText) {
        this.jiuyetongjiYesnoText = jiuyetongjiYesnoText;
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
