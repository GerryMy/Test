package com.example.demo.entity;

import java.io.Serializable;

/**
 * 实体类
 *
 * @author Steve on 2019/3/11
 */
public class Orders implements Serializable {
  /** 编号 */
  private int billid;
  /** 商品名称 */
  private String productName;
  /** 商品描述 */
  private String productDesc;
  /** 商品单位 */
  private String productUnit;
  /** 商品数量 */
  private int productCount;
  /** 商品金额 */
  private int totalPrice;
  /** 是否支付 */
  private int isPayment;

  public Orders() {}

  public Orders(
      int billid,
      String productName,
      String productDesc,
      String productUnit,
      int productCount,
      int totalPrice,
      int isPayment) {
    this.billid = billid;
    this.productName = productName;
    this.productDesc = productDesc;
    this.productUnit = productUnit;
    this.productCount = productCount;
    this.totalPrice = totalPrice;
    this.isPayment = isPayment;
  }

  public int getBillid() {
    return billid;
  }

  public void setBillid(int billid) {
    this.billid = billid;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductDesc() {
    return productDesc;
  }

  public void setProductDesc(String productDesc) {
    this.productDesc = productDesc;
  }

  public String getProductUnit() {
    return productUnit;
  }

  public void setProductUnit(String productUnit) {
    this.productUnit = productUnit;
  }

  public int getProductCount() {
    return productCount;
  }

  public void setProductCount(int productCount) {
    this.productCount = productCount;
  }

  public int getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(int totalPrice) {
    this.totalPrice = totalPrice;
  }

  public int getIsPayment() {
    return isPayment;
  }

  public void setIsPayment(int isPayment) {
    this.isPayment = isPayment;
  }

  @Override
  public String toString() {
    return "Orders{"
        + "billid="
        + billid
        + ", productName='"
        + productName
        + '\''
        + ", productDesc='"
        + productDesc
        + '\''
        + ", productUnit='"
        + productUnit
        + '\''
        + ", productCount="
        + productCount
        + ", totalPrice="
        + totalPrice
        + ", isPayment="
        + isPayment
        + '}';
  }
}
