package com.hr.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hr.dao.GoodsInfoDao;
import com.hr.entity.GoodsInfo;
import com.hr.utils.DBUtils;

public class GoodsInfoDaoImpl extends DBUtils implements GoodsInfoDao {

	@Override
	public int addGoods(GoodsInfo g) throws Exception {
		super.getconConnection();
		int productid = 0;
		String sql = "select MAX(productid) from goods";
		ResultSet rs = super.query(sql);
		if (rs.next()) {
			if (rs.getString(1) != null) {
				productid = Integer.parseInt(rs.getString(1)) + 1;
			} else {
				productid = 1001;
			}
		}
		String sql1 = "insert into goods values(?,?,?,?)";
		int i = super.update(sql1, productid, g.getProductname(),
				g.getProductprice(), g.getProductnum());
		// 关
		super.closeAll(conn, pstat, rs);
		return i;
	}

	@Override
	public GoodsInfo findGoodsById(Integer productid) throws Exception {
		// 1.连
		super.getconConnection();
		// 2.查或更
		String sql = "select productid,productname,productprice,productnum from goods where productid = ?";
		ResultSet rs = super.query(sql, productid);
		if (rs != null) {
			while (rs.next()) {
				GoodsInfo g = new GoodsInfo(rs.getInt("productid"),
						rs.getString("productname"),
						rs.getDouble("productprice"), rs.getInt("productnum"));
				return g;
			}
		}
		// 3.关闭
		super.closeAll(conn, pstat, rs);
		return null;
	}

	@Override
	public int updateGoods(GoodsInfo g) throws Exception {
		super.getconConnection();
		String sql = "update goods set productname=?,productprice=?,productnum=? where productid = ?";
		int i = super.update(sql, g.getProductname(), g.getProductprice(),
				g.getProductnum(), g.getProductid());
		super.closeAll(conn, pstat, rs);
		System.out.println(i);
		return i;
	}

	@Override
	public int delGoodsById(Integer productid) throws Exception {
		super.getconConnection();
		String sql = "delete from goods where productid = ?";
		int i = super.update(sql, productid);
		super.closeAll(conn, pstat, rs);
		return i;
	}

	@Override
	public List<GoodsInfo> findGoodsByLike(GoodsInfo g) throws Exception {
		List<GoodsInfo> list = null;
		// 1.连
		super.getconConnection();
		// 2.查或更
		StringBuffer sb = new StringBuffer(
				"select productid,productname,productprice,productnum from goods where 1=1 ");
		if (g != null) {
			if (g.getProductname() != null && "".equals(g.getProductname())) {
				// 拼接
				sb.append("and productname like '%" + g.getProductname() + "%'");
			}
			if (g.getProductnum() != null && "".equals(g.getProductnum())) {
				// 拼接
				sb.append("and productnum like '%" + g.getProductnum() + "%'");
			}
		}
		ResultSet rs = super.query(sb.toString());
		if (rs != null) {
			list = new ArrayList<GoodsInfo>();
			while (rs.next()) {
				int productid = rs.getInt(1);
				String productname = rs.getString(2);
				double productprice = rs.getDouble(3);
				int productnum = rs.getInt(4);
				GoodsInfo goodsinfo = new GoodsInfo(productid, productname,
						productprice, productnum);
				list.add(goodsinfo);
			}
		}
		// 3.关
		super.closeAll(conn, pstat, rs);
		return list;
	}
}
