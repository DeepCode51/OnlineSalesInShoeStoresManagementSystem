package com.entity.vo;

import com.entity.XieleishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 鞋类商品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-19 16:54:47
 */
public class XieleishangpinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 鞋子名称
	 */
	
	private String xiezimingcheng;
		
	/**
	 * 鞋子分类
	 */
	
	private String xiezifenlei;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 尺码
	 */
	
	private String chima;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 鞋子介绍
	 */
	
	private String xiezijieshao;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 倒计结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date reversetime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
		
	/**
	 * 单限
	 */
	
	private Integer onelimittimes;
		
	/**
	 * 库存
	 */
	
	private Integer alllimittimes;
				
	
	/**
	 * 设置：鞋子名称
	 */
	 
	public void setXiezimingcheng(String xiezimingcheng) {
		this.xiezimingcheng = xiezimingcheng;
	}
	
	/**
	 * 获取：鞋子名称
	 */
	public String getXiezimingcheng() {
		return xiezimingcheng;
	}
				
	
	/**
	 * 设置：鞋子分类
	 */
	 
	public void setXiezifenlei(String xiezifenlei) {
		this.xiezifenlei = xiezifenlei;
	}
	
	/**
	 * 获取：鞋子分类
	 */
	public String getXiezifenlei() {
		return xiezifenlei;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：尺码
	 */
	 
	public void setChima(String chima) {
		this.chima = chima;
	}
	
	/**
	 * 获取：尺码
	 */
	public String getChima() {
		return chima;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：鞋子介绍
	 */
	 
	public void setXiezijieshao(String xiezijieshao) {
		this.xiezijieshao = xiezijieshao;
	}
	
	/**
	 * 获取：鞋子介绍
	 */
	public String getXiezijieshao() {
		return xiezijieshao;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：倒计结束时间
	 */
	 
	public void setReversetime(Date reversetime) {
		this.reversetime = reversetime;
	}
	
	/**
	 * 获取：倒计结束时间
	 */
	public Date getReversetime() {
		return reversetime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：单限
	 */
	 
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
				
	
	/**
	 * 设置：库存
	 */
	 
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
			
}
