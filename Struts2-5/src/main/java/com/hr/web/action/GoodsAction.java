package com.hr.web.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.hr.entity.GoodsInfo;
import com.hr.service.GoodsInfoService;
import com.hr.service.impl.GoodsInfoServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GoodsAction extends ActionSupport implements
		ModelDriven<GoodsInfo>, RequestAware {
	GoodsInfoService service = new GoodsInfoServiceImpl();
	private GoodsInfo goodsinfo;
	private Map<String, Object> request;
	private Integer uid;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String login() throws Exception {
		return "list";
	}

	public String list() throws Exception {
		// 查询所有
		List<GoodsInfo> list = service.findGoodsByLike(null);
		request.put("goods", list);
		return "list";
	}

	public String del() throws Exception {
		service.delGoodsById(uid);
		return "list";
	}

	public String toEdit() throws Exception {
		GoodsInfo g = service.findGoodsById(uid);
		goodsinfo.setProductid(g.getProductid());
		goodsinfo.setProductname(g.getProductname());
		goodsinfo.setProductprice(g.getProductprice());
		goodsinfo.setProductnum(g.getProductnum());
		return "toEdit";
	}

	public String edit() throws Exception {
		service.updateGoods(goodsinfo);
		return "list";
	}

	public String toAdd() throws Exception {
		return "toAdd";
	}

	public String add() throws Exception {
		service.addGoods(goodsinfo);
		return "list";
	}

	@Override
	public GoodsInfo getModel() {
		if (goodsinfo == null) {
			goodsinfo = new GoodsInfo();
		}
		return goodsinfo;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
}
