package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XieleishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XieleishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XieleishangpinView;


/**
 * 鞋类商品
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:54:47
 */
public interface XieleishangpinService extends IService<XieleishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XieleishangpinVO> selectListVO(Wrapper<XieleishangpinEntity> wrapper);
   	
   	XieleishangpinVO selectVO(@Param("ew") Wrapper<XieleishangpinEntity> wrapper);
   	
   	List<XieleishangpinView> selectListView(Wrapper<XieleishangpinEntity> wrapper);
   	
   	XieleishangpinView selectView(@Param("ew") Wrapper<XieleishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XieleishangpinEntity> wrapper);
   	
}

