package com.dao;

import com.entity.XieleishangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XieleishangpinVO;
import com.entity.view.XieleishangpinView;


/**
 * 鞋类商品
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:54:47
 */
public interface XieleishangpinDao extends BaseMapper<XieleishangpinEntity> {
	
	List<XieleishangpinVO> selectListVO(@Param("ew") Wrapper<XieleishangpinEntity> wrapper);
	
	XieleishangpinVO selectVO(@Param("ew") Wrapper<XieleishangpinEntity> wrapper);
	
	List<XieleishangpinView> selectListView(@Param("ew") Wrapper<XieleishangpinEntity> wrapper);

	List<XieleishangpinView> selectListView(Pagination page,@Param("ew") Wrapper<XieleishangpinEntity> wrapper);
	
	XieleishangpinView selectView(@Param("ew") Wrapper<XieleishangpinEntity> wrapper);
	
}
