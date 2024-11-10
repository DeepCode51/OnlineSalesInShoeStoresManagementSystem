package com.entity.view;

import com.entity.DiscussxieleishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 鞋类商品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 16:54:48
 */
@TableName("discussxieleishangpin")
public class DiscussxieleishangpinView  extends DiscussxieleishangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxieleishangpinView(){
	}
 
 	public DiscussxieleishangpinView(DiscussxieleishangpinEntity discussxieleishangpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussxieleishangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
