package com.hr.dao;

import java.util.List;

import com.hr.entity.GoodsInfo;

public interface GoodsInfoDao {
	// 登陆
	// public GoodsInfo login(String username, String password) throws
	// Exception;
	/**
	 * 添加
	 * 
	 * @param g
	 * @return
	 * @throws Exception
	 */
	public int addGoods(GoodsInfo g) throws Exception;

	/**
	 * 根据id返回一个对象
	 * 
	 * @param productid
	 * @return
	 * @throws Exception
	 */
	public GoodsInfo findGoodsById(Integer productid) throws Exception;

	/**
	 * 修改
	 * 
	 * @param g
	 * @return
	 * @throws Exception
	 */
	public int updateGoods(GoodsInfo g) throws Exception;

	/**
	 * 删除
	 * 
	 * @param productid
	 * @return
	 * @throws Exception
	 */
	public int delGoodsById(Integer productid) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @param g
	 * @return
	 * @throws Exception
	 */
	public List<GoodsInfo> findGoodsByLike(GoodsInfo g) throws Exception;
}
