<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<style type="text/css">

    td {
        text-align: center;
    }

    .a {
        text-align: right;
        width: 820px;
    }
</style>
<#--<script>
    var isPayment = ["未支付", "已支付"];
</script>-->
<body>
<div class="a">
    <a href="/add.html">新增订单</a>
</div>
<div>
    <table width="60%" border="1" cellpadding="0" cellspacing="0" align="center">
        <thead>
        <tr>
            <td colspan="7"><font size="6">订单管理</font></td>
        </tr>
        <th>商品名称</th>
        <th>商品描述</th>
        <th>商品单位</th>
        <th>总数量</th>
        <th>总金额</th>
        <th>是否付款</th>
        </thead>
        <tbody>
        <#list ord as o>
            <tr>
            <td>${o.productName}</td>
            <td>${o.productDesc}</td>
            <td>${o.productUnit}</td>
            <td>${o.productCount}</td>
            <td>${o.totalPrice}</td>
            <td>${(o.isPayment==1)?string('未支付',(o.isPayment==2)?string('已支付',''))}</td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>
