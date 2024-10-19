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
 * 就业统计
 *
 * @author 
 * @email
 */
@TableName("jiuyetongji")
public class JiuyetongjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiuyetongjiEntity() {

	}

	public JiuyetongjiEntity(T t) {
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
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 应聘公司
     */
    @TableField(value = "zhaopin_name")

    private String zhaopinName;


    /**
     * 月薪
     */
    @TableField(value = "zhaopin_yuexin")

    private String zhaopinYuexin;


    /**
     * 就业薪资
     */
    @TableField(value = "zhaopin_xinzi")

    private String zhaopinXinzi;


    /**
     * 是否就业
     */
    @TableField(value = "jiuyetongji_types")

    private Integer jiuyetongjiTypes;


    /**
     * 审核状态
     */
    @TableField(value = "jiuyetongji_yesno_types")

    private Integer jiuyetongjiYesnoTypes;


    /**
     * 审核留言
     */
    @TableField(value = "jiuyetongji_yesno_text")

    private String jiuyetongjiYesnoText;


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
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：应聘公司
	 */
    public String getZhaopinName() {
        return zhaopinName;
    }


    /**
	 * 获取：应聘公司
	 */

    public void setZhaopinName(String zhaopinName) {
        this.zhaopinName = zhaopinName;
    }
    /**
	 * 设置：月薪
	 */
    public String getZhaopinYuexin() {
        return zhaopinYuexin;
    }


    /**
	 * 获取：月薪
	 */

    public void setZhaopinYuexin(String zhaopinYuexin) {
        this.zhaopinYuexin = zhaopinYuexin;
    }
    /**
	 * 设置：就业薪资
	 */
    public String getZhaopinXinzi() {
        return zhaopinXinzi;
    }


    /**
	 * 获取：就业薪资
	 */

    public void setZhaopinXinzi(String zhaopinXinzi) {
        this.zhaopinXinzi = zhaopinXinzi;
    }
    /**
	 * 设置：是否就业
	 */
    public Integer getJiuyetongjiTypes() {
        return jiuyetongjiTypes;
    }


    /**
	 * 获取：是否就业
	 */

    public void setJiuyetongjiTypes(Integer jiuyetongjiTypes) {
        this.jiuyetongjiTypes = jiuyetongjiTypes;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getJiuyetongjiYesnoTypes() {
        return jiuyetongjiYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setJiuyetongjiYesnoTypes(Integer jiuyetongjiYesnoTypes) {
        this.jiuyetongjiYesnoTypes = jiuyetongjiYesnoTypes;
    }
    /**
	 * 设置：审核留言
	 */
    public String getJiuyetongjiYesnoText() {
        return jiuyetongjiYesnoText;
    }


    /**
	 * 获取：审核留言
	 */

    public void setJiuyetongjiYesnoText(String jiuyetongjiYesnoText) {
        this.jiuyetongjiYesnoText = jiuyetongjiYesnoText;
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
        return "Jiuyetongji{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", zhaopinName=" + zhaopinName +
            ", zhaopinYuexin=" + zhaopinYuexin +
            ", zhaopinXinzi=" + zhaopinXinzi +
            ", jiuyetongjiTypes=" + jiuyetongjiTypes +
            ", jiuyetongjiYesnoTypes=" + jiuyetongjiYesnoTypes +
            ", jiuyetongjiYesnoText=" + jiuyetongjiYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
