package com.example.demo.service;

import com.example.demo.entity.Orders;

import java.util.List;

public interface OrdersService {
  /**
   * 查询所有
   *
   * @return
   */
  public List<Orders> findAll();

  /**
   * 添加
   *
   * @param orders
   */
  public void add(Orders orders);
}
