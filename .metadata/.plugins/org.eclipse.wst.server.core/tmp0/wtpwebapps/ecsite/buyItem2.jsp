
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>Home画面</title>
<link rel="stylesheet" type="text/css" href="./css/style.css" />


</head>
<body>
<div id="header">
<div id="pr">
</div>
</div>
<div id="main">
<div id="top">
<p>BuyItem</p>
</div>
<div>
<h3>ご購入情報は以下になります。</h3>



<table>
<tbody>
<tr>

<th>名前</th>
<th>値段</th>

</tr>

<s:iterator value="myPageList">

<tr>
<td><s:property value="itemName" /></td>
<td><s:property value="itemPrice" /><span>円</span></td>



</tr>

</s:iterator>
</tbody>
</table>










<s:form action="BuyItemAction">
<table>
<tr>
<td>
<span>商品名</span>
</td>
<td>
<%-- <s:property value="session.buyItem_name" /><br> --%>

<!-- </td> -->
<!-- </tr> -->
<!-- <tr> -->
<!-- <td> -->
<%-- <span>値段</span> --%>
<!-- </td> -->
<!-- <td> -->
<%-- <s:property value="session.buyItem_price" /><span>円</span> --%>
</td>
</tr>
<tr>
<td>
<span>購入個数</span>
</td>
<td>



</td>
</tr>
<tr>
<td>
<span>支払い方法</span>
</td>
<td>
<input type="radio" name="pay" value="1" checked="checked">現金払い
<input type="radio" name="pay" value="2">クレジットカード
</td>
</tr>
<tr>
<td>
<s:submit value="購入"/>
</td>
</tr>
</table>
</s:form>
<div>
<p>前画面に戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
<p>マイぺージは<a href='<s:url action="MyPageAction" />'>こちら
</a></p>
</div>
</div>
</div>


<div id="footer">
<div id="pr">
</div>
</div>



</body>
</html>