<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="/struts-tags" prefix="s" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="admin/Goods_toAdd.action">添加</a>
<table border="1" width="500" height="100">
<thead>
<tr>
<th>商品编号</th>
<th>商品名称</th>
<th>商品价格</th>
<th>商品数量</th>
<th>操作</th>
</tr>
</thead>
<tbody>
<s:iterator value="#request.goods">
<tr>
<td>${productid }</td>
<td>${productname }</td>
<td>${productprice }</td>
<td>${productnum }</td>
<td>
<a href="admin/Goods_toEdit?uid=${productid }">修改</a>
<a href="admin/Goods_del?uid=${productid}">删除</a>
</td>
</tr>
</s:iterator>
</tbody>
</table>
</body>
</html>