package com.entity.view;

import com.entity.ZhaopinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 职位招聘
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhaopin")
public class ZhaopinView extends ZhaopinEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 招聘岗位的值
		*/
		private String zhaopinValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



		//级联表 gongsi
			/**
			* 公司名称
			*/
			private String gongsiName;
			/**
			* 所在行业
			*/
			private Integer hanyeTypes;
				/**
				* 所在行业的值
				*/
				private String hanyeValue;
			/**
			* 联系方式
			*/
			private String gongsiPhone;
			/**
			* 邮箱
			*/
			private String gongsiEmail;
			/**
			* 营业执照展示
			*/
			private String gongsiPhoto;
			/**
			* 公司简介
			*/
			private String gongsiContent;
			/**
			* 逻辑删除
			*/
			private Integer gongsiDelete;

	public ZhaopinView() {

	}

	public ZhaopinView(ZhaopinEntity zhaopinEntity) {
		try {
			BeanUtils.copyProperties(this, zhaopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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






				//级联表的get和set gongsi
					/**
					* 获取： 公司名称
					*/
					public String getGongsiName() {
						return gongsiName;
					}
					/**
					* 设置： 公司名称
					*/
					public void setGongsiName(String gongsiName) {
						this.gongsiName = gongsiName;
					}
					/**
					* 获取： 所在行业
					*/
					public Integer getHanyeTypes() {
						return hanyeTypes;
					}
					/**
					* 设置： 所在行业
					*/
					public void setHanyeTypes(Integer hanyeTypes) {
						this.hanyeTypes = hanyeTypes;
					}


						/**
						* 获取： 所在行业的值
						*/
						public String getHanyeValue() {
							return hanyeValue;
						}
						/**
						* 设置： 所在行业的值
						*/
						public void setHanyeValue(String hanyeValue) {
							this.hanyeValue = hanyeValue;
						}
					/**
					* 获取： 联系方式
					*/
					public String getGongsiPhone() {
						return gongsiPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setGongsiPhone(String gongsiPhone) {
						this.gongsiPhone = gongsiPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getGongsiEmail() {
						return gongsiEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setGongsiEmail(String gongsiEmail) {
						this.gongsiEmail = gongsiEmail;
					}
					/**
					* 获取： 营业执照展示
					*/
					public String getGongsiPhoto() {
						return gongsiPhoto;
					}
					/**
					* 设置： 营业执照展示
					*/
					public void setGongsiPhoto(String gongsiPhoto) {
						this.gongsiPhoto = gongsiPhoto;
					}
					/**
					* 获取： 公司简介
					*/
					public String getGongsiContent() {
						return gongsiContent;
					}
					/**
					* 设置： 公司简介
					*/
					public void setGongsiContent(String gongsiContent) {
						this.gongsiContent = gongsiContent;
					}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getGongsiDelete() {
						return gongsiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setGongsiDelete(Integer gongsiDelete) {
						this.gongsiDelete = gongsiDelete;
					}
















}
