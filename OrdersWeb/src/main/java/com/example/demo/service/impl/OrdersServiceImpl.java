package com.example.demo.service.impl;

import com.example.demo.entity.Orders;
import com.example.demo.mapper.OrdersMapper;
import com.example.demo.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * service实现类
 *
 * @author Steve on 2019/2/21
 */
@Service
public class OrdersServiceImpl implements OrdersService {
  // 注入Mapper接口
  @Resource private OrdersMapper ordersMapper;

  @Override
  public List<Orders> findAll() {
    return ordersMapper.findAll();
  }

  @Override
  public void add(Orders orders) {
    ordersMapper.add(orders);
  }
}
