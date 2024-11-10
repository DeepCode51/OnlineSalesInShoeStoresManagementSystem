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


import com.dao.DiscussxieleishangpinDao;
import com.entity.DiscussxieleishangpinEntity;
import com.service.DiscussxieleishangpinService;
import com.entity.vo.DiscussxieleishangpinVO;
import com.entity.view.DiscussxieleishangpinView;

@Service("discussxieleishangpinService")
public class DiscussxieleishangpinServiceImpl extends ServiceImpl<DiscussxieleishangpinDao, DiscussxieleishangpinEntity> implements DiscussxieleishangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxieleishangpinEntity> page = this.selectPage(
                new Query<DiscussxieleishangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussxieleishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxieleishangpinEntity> wrapper) {
		  Page<DiscussxieleishangpinView> page =new Query<DiscussxieleishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxieleishangpinVO> selectListVO(Wrapper<DiscussxieleishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxieleishangpinVO selectVO(Wrapper<DiscussxieleishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxieleishangpinView> selectListView(Wrapper<DiscussxieleishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxieleishangpinView selectView(Wrapper<DiscussxieleishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
