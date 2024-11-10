package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XieleishangpinDao;
import com.entity.XieleishangpinEntity;
import com.service.XieleishangpinService;
import com.entity.vo.XieleishangpinVO;
import com.entity.view.XieleishangpinView;

@Service("xieleishangpinService")
public class XieleishangpinServiceImpl extends ServiceImpl<XieleishangpinDao, XieleishangpinEntity> implements XieleishangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XieleishangpinEntity> page = this.selectPage(
                new Query<XieleishangpinEntity>(params).getPage(),
                new EntityWrapper<XieleishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XieleishangpinEntity> wrapper) {
		  Page<XieleishangpinView> page =new Query<XieleishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XieleishangpinVO> selectListVO(Wrapper<XieleishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XieleishangpinVO selectVO(Wrapper<XieleishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XieleishangpinView> selectListView(Wrapper<XieleishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XieleishangpinView selectView(Wrapper<XieleishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
