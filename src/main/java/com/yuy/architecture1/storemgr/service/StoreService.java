package com.yuy.architecture1.storemgr.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yuy.architecture1.common.service.BaseService;

import com.yuy.architecture1.storemgr.dao.StoreDAO;
import com.yuy.architecture1.storemgr.vo.StoreModel;
import com.yuy.architecture1.storemgr.vo.StoreQueryModel;

@Service
@Transactional
public class StoreService extends BaseService<StoreModel,StoreQueryModel> implements IStoreService{
	private StoreDAO dao = null;
	@Autowired
	private void setDao(StoreDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	@Override
	public StoreModel getByGoodsUuid(int goodsUuid) {
		return dao.getByGoodsUuid(goodsUuid);
	}
	
}