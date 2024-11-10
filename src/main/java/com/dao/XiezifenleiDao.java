package com.dao;

import com.entity.XiezifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiezifenleiVO;
import com.entity.view.XiezifenleiView;


/**
 * 鞋子分类
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:54:47
 */
public interface XiezifenleiDao extends BaseMapper<XiezifenleiEntity> {
	
	List<XiezifenleiVO> selectListVO(@Param("ew") Wrapper<XiezifenleiEntity> wrapper);
	
	XiezifenleiVO selectVO(@Param("ew") Wrapper<XiezifenleiEntity> wrapper);
	
	List<XiezifenleiView> selectListView(@Param("ew") Wrapper<XiezifenleiEntity> wrapper);

	List<XiezifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<XiezifenleiEntity> wrapper);
	
	XiezifenleiView selectView(@Param("ew") Wrapper<XiezifenleiEntity> wrapper);
	
}
