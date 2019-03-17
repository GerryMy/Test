package com.hr.service.impl;

import java.util.List;

import com.hr.dao.GoodsInfoDao;
import com.hr.dao.impl.GoodsInfoDaoImpl;
import com.hr.entity.GoodsInfo;
import com.hr.service.GoodsInfoService;

public class GoodsInfoServiceImpl implements GoodsInfoService {
	GoodsInfoDao dao = new GoodsInfoDaoImpl();

	@Override
	public boolean addGoods(GoodsInfo g) throws Exception {
		// 1.查找有没有被注册
		if (dao.findGoodsById(g.getProductid()) == null) {
			return dao.addGoods(g) > 0 ? true : false;
		} else {
			return false;
		}
	}

	@Override
	public GoodsInfo findGoodsById(Integer productid) throws Exception {
		return dao.findGoodsById(productid);
	}

	@Override
	public boolean updateGoods(GoodsInfo g) throws Exception {
		return dao.updateGoods(g) > 0 ? true : false;
	}

	@Override
	public boolean delGoodsById(Integer productid) throws Exception {
		return dao.delGoodsById(productid) > 0 ? true : false;
	}

	@Override
	public List<GoodsInfo> findGoodsByLike(GoodsInfo g) throws Exception {
		return dao.findGoodsByLike(g);
	}

}
