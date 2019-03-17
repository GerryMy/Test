<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>现在开始修改商品编号为：${productid }的商品信息</h1>
<form action="admin/Goods_edit.action" method="post">
<input type="hidden" name="productid" value="${productid }" />
<table border="1" width="500" height="100">
<tr><td>商品名称</td><td><input type="text" name="productname"  value="${productname }"/></td></tr>
<tr><td>商品价格</td><td><input type="text" name="productprice" value="${productprice }"  /></td></tr>
<tr><td>商品数量</td><td><input type="text" name="productnum" value="${productnum }" /></td></tr>
<tr><td><input type="submit" value="提交修改"></td><td></td></tr>
</table>
</form>
</body>
</html>