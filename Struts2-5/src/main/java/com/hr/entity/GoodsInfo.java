package com.hr.entity;

import java.io.Serializable;

public class GoodsInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8950338708046475425L;
	private Integer productid;// 商品编号
	private String productname;// 商品姓名
	private double productprice;// 商品价格
	private Integer productnum;// 商品数量

	public GoodsInfo() {
	}

	public GoodsInfo(String productname, double productprice, Integer productnum) {
		super();
		this.productname = productname;
		this.productprice = productprice;
		this.productnum = productnum;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	public Integer getProductnum() {
		return productnum;
	}

	public void setProductnum(Integer productnum) {
		this.productnum = productnum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public GoodsInfo(Integer productid, String productname,
			double productprice, Integer productnum) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productnum = productnum;
	}

}
