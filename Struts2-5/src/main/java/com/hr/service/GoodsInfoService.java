package com.hr.service;

import java.util.List;

import com.hr.entity.GoodsInfo;

public interface GoodsInfoService {
	public boolean addGoods(GoodsInfo g) throws Exception;

	public GoodsInfo findGoodsById(Integer productid) throws Exception;

	public boolean updateGoods(GoodsInfo g) throws Exception;

	public boolean delGoodsById(Integer productid) throws Exception;

	public List<GoodsInfo> findGoodsByLike(GoodsInfo g) throws Exception;
}
