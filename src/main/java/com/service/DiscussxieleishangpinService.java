package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxieleishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxieleishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxieleishangpinView;


/**
 * 鞋类商品评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:54:48
 */
public interface DiscussxieleishangpinService extends IService<DiscussxieleishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxieleishangpinVO> selectListVO(Wrapper<DiscussxieleishangpinEntity> wrapper);
   	
   	DiscussxieleishangpinVO selectVO(@Param("ew") Wrapper<DiscussxieleishangpinEntity> wrapper);
   	
   	List<DiscussxieleishangpinView> selectListView(Wrapper<DiscussxieleishangpinEntity> wrapper);
   	
   	DiscussxieleishangpinView selectView(@Param("ew") Wrapper<DiscussxieleishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxieleishangpinEntity> wrapper);
   	
}

