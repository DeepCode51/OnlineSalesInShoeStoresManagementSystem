package com.entity.view;

import com.entity.XiezifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 鞋子分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 16:54:47
 */
@TableName("xiezifenlei")
public class XiezifenleiView  extends XiezifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiezifenleiView(){
	}
 
 	public XiezifenleiView(XiezifenleiEntity xiezifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, xiezifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
