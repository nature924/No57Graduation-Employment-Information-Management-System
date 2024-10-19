package com.entity.view;

import com.entity.GongsiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 公司
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongsi")
public class GongsiView extends GongsiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 所在行业的值
		*/
		private String hanyeValue;



	public GongsiView() {

	}

	public GongsiView(GongsiEntity gongsiEntity) {
		try {
			BeanUtils.copyProperties(this, gongsiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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












}
