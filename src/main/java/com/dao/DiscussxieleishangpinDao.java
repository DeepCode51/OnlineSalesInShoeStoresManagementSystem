package com.dao;

import com.entity.DiscussxieleishangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxieleishangpinVO;
import com.entity.view.DiscussxieleishangpinView;


/**
 * 鞋类商品评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:54:48
 */
public interface DiscussxieleishangpinDao extends BaseMapper<DiscussxieleishangpinEntity> {
	
	List<DiscussxieleishangpinVO> selectListVO(@Param("ew") Wrapper<DiscussxieleishangpinEntity> wrapper);
	
	DiscussxieleishangpinVO selectVO(@Param("ew") Wrapper<DiscussxieleishangpinEntity> wrapper);
	
	List<DiscussxieleishangpinView> selectListView(@Param("ew") Wrapper<DiscussxieleishangpinEntity> wrapper);

	List<DiscussxieleishangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxieleishangpinEntity> wrapper);
	
	DiscussxieleishangpinView selectView(@Param("ew") Wrapper<DiscussxieleishangpinEntity> wrapper);
	
}
