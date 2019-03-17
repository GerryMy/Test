package com.example.demo.mapper;

import com.example.demo.entity.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrdersMapper {
  /**
   * 查询所有
   *
   * @return
   */
  @Select("select * from orders")
  public List<Orders> findAll();

  /**
   * 添加
   *
   * @param orders
   */
  @Insert(
      "insert into orders(productName,productDesc,productUnit,productCount,totalPrice,isPayment)values(#{productName},#{productDesc},#{productUnit},#{productCount},#{totalPrice},#{isPayment})")
  public void add(Orders orders);
}
