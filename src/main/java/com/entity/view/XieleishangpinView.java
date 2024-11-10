package com.entity.view;

import com.entity.XieleishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 鞋类商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 16:54:47
 */
@TableName("xieleishangpin")
public class XieleishangpinView  extends XieleishangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XieleishangpinView(){
	}
 
 	public XieleishangpinView(XieleishangpinEntity xieleishangpinEntity){
 	try {
			BeanUtils.copyProperties(this, xieleishangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
