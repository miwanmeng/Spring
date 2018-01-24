package cn.sxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sxt.bean.Titem;
import cn.sxt.dao.TitemMapper;
import cn.sxt.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private TitemMapper titemMapper;

	@Override
	public Titem getItemById(Long itemId) {
		// TODO Auto-generated method stub
		return titemMapper.selectByPrimaryKey(itemId);
	}
}
