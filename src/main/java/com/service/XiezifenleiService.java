package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiezifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiezifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiezifenleiView;


/**
 * 鞋子分类
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:54:47
 */
public interface XiezifenleiService extends IService<XiezifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiezifenleiVO> selectListVO(Wrapper<XiezifenleiEntity> wrapper);
   	
   	XiezifenleiVO selectVO(@Param("ew") Wrapper<XiezifenleiEntity> wrapper);
   	
   	List<XiezifenleiView> selectListView(Wrapper<XiezifenleiEntity> wrapper);
   	
   	XiezifenleiView selectView(@Param("ew") Wrapper<XiezifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiezifenleiEntity> wrapper);
   	
}

