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


import com.dao.XiezifenleiDao;
import com.entity.XiezifenleiEntity;
import com.service.XiezifenleiService;
import com.entity.vo.XiezifenleiVO;
import com.entity.view.XiezifenleiView;

@Service("xiezifenleiService")
public class XiezifenleiServiceImpl extends ServiceImpl<XiezifenleiDao, XiezifenleiEntity> implements XiezifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiezifenleiEntity> page = this.selectPage(
                new Query<XiezifenleiEntity>(params).getPage(),
                new EntityWrapper<XiezifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiezifenleiEntity> wrapper) {
		  Page<XiezifenleiView> page =new Query<XiezifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiezifenleiVO> selectListVO(Wrapper<XiezifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiezifenleiVO selectVO(Wrapper<XiezifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiezifenleiView> selectListView(Wrapper<XiezifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiezifenleiView selectView(Wrapper<XiezifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
