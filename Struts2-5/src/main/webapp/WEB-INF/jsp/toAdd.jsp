<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="admin/Goods_add.action"method="post">
<table border="1" width="500" height="100">
<tr><td>商品名称</td><td><input type="text" name="productname" /></td></tr>
<tr><td>商品价格</td><td><input type="text" name="productprice"/></td></tr>
<tr><td>商品数量</td><td><input type="text" name="productnum"/></td></tr>
<tr><td><input type="submit" value="提交"></td><td></td></tr>
</table>
</form>
</body>
</html>