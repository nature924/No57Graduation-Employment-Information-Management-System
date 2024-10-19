package com.entity.view;

import com.entity.ZhaopinLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 职位留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhaopin_liuyan")
public class ZhaopinLiuyanView extends ZhaopinLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 学生手机号
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

		//级联表 zhaopin
			/**
			* 职位招聘 的 公司
			*/
			private Integer zhaopinGongsiId;
			/**
			* 招聘信息名称
			*/
			private String zhaopinName;
			/**
			* 招聘信息照片
			*/
			private String zhaopinPhoto;
			/**
			* 薪资待遇
			*/
			private String zhaopinDaiyu;
			/**
			* 社保信息
			*/
			private String zhaopinShebao;
			/**
			* 工作地点
			*/
			private String zhaopinAddress;
			/**
			* 联系人
			*/
			private String lianxirenName;
			/**
			* 招聘电话
			*/
			private String zhaopinPhone;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 招聘岗位
			*/
			private Integer zhaopinTypes;
				/**
				* 招聘岗位的值
				*/
				private String zhaopinValue;
			/**
			* 招聘人数
			*/
			private Integer zhaopinRenshuNumber;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 招聘信息详情
			*/
			private String zhaopinContent;

	public ZhaopinLiuyanView() {

	}

	public ZhaopinLiuyanView(ZhaopinLiuyanEntity zhaopinLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, zhaopinLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


























				//级联表的get和set yonghu
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 学生手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}


				//级联表的get和set zhaopin
					/**
					* 获取：职位招聘 的 公司
					*/
					public Integer getZhaopinGongsiId() {
						return zhaopinGongsiId;
					}
					/**
					* 设置：职位招聘 的 公司
					*/
					public void setZhaopinGongsiId(Integer zhaopinGongsiId) {
						this.zhaopinGongsiId = zhaopinGongsiId;
					}

					/**
					* 获取： 招聘信息名称
					*/
					public String getZhaopinName() {
						return zhaopinName;
					}
					/**
					* 设置： 招聘信息名称
					*/
					public void setZhaopinName(String zhaopinName) {
						this.zhaopinName = zhaopinName;
					}
					/**
					* 获取： 招聘信息照片
					*/
					public String getZhaopinPhoto() {
						return zhaopinPhoto;
					}
					/**
					* 设置： 招聘信息照片
					*/
					public void setZhaopinPhoto(String zhaopinPhoto) {
						this.zhaopinPhoto = zhaopinPhoto;
					}
					/**
					* 获取： 薪资待遇
					*/
					public String getZhaopinDaiyu() {
						return zhaopinDaiyu;
					}
					/**
					* 设置： 薪资待遇
					*/
					public void setZhaopinDaiyu(String zhaopinDaiyu) {
						this.zhaopinDaiyu = zhaopinDaiyu;
					}
					/**
					* 获取： 社保信息
					*/
					public String getZhaopinShebao() {
						return zhaopinShebao;
					}
					/**
					* 设置： 社保信息
					*/
					public void setZhaopinShebao(String zhaopinShebao) {
						this.zhaopinShebao = zhaopinShebao;
					}
					/**
					* 获取： 工作地点
					*/
					public String getZhaopinAddress() {
						return zhaopinAddress;
					}
					/**
					* 设置： 工作地点
					*/
					public void setZhaopinAddress(String zhaopinAddress) {
						this.zhaopinAddress = zhaopinAddress;
					}
					/**
					* 获取： 联系人
					*/
					public String getLianxirenName() {
						return lianxirenName;
					}
					/**
					* 设置： 联系人
					*/
					public void setLianxirenName(String lianxirenName) {
						this.lianxirenName = lianxirenName;
					}
					/**
					* 获取： 招聘电话
					*/
					public String getZhaopinPhone() {
						return zhaopinPhone;
					}
					/**
					* 设置： 招聘电话
					*/
					public void setZhaopinPhone(String zhaopinPhone) {
						this.zhaopinPhone = zhaopinPhone;
					}
					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}
					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}
					/**
					* 获取： 招聘岗位
					*/
					public Integer getZhaopinTypes() {
						return zhaopinTypes;
					}
					/**
					* 设置： 招聘岗位
					*/
					public void setZhaopinTypes(Integer zhaopinTypes) {
						this.zhaopinTypes = zhaopinTypes;
					}


						/**
						* 获取： 招聘岗位的值
						*/
						public String getZhaopinValue() {
							return zhaopinValue;
						}
						/**
						* 设置： 招聘岗位的值
						*/
						public void setZhaopinValue(String zhaopinValue) {
							this.zhaopinValue = zhaopinValue;
						}
					/**
					* 获取： 招聘人数
					*/
					public Integer getZhaopinRenshuNumber() {
						return zhaopinRenshuNumber;
					}
					/**
					* 设置： 招聘人数
					*/
					public void setZhaopinRenshuNumber(Integer zhaopinRenshuNumber) {
						this.zhaopinRenshuNumber = zhaopinRenshuNumber;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 招聘信息详情
					*/
					public String getZhaopinContent() {
						return zhaopinContent;
					}
					/**
					* 设置： 招聘信息详情
					*/
					public void setZhaopinContent(String zhaopinContent) {
						this.zhaopinContent = zhaopinContent;
					}







}
