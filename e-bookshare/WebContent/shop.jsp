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
<title>商品購入画面</title>
<link rel="stylesheet" type="text/css" href="./css/style.css" />


</head>
<body>


<div id=”text-center”>



<p>おめでとうございます。表示されました</p>

<!-- ここに商品追加コマンドを入れる -->
<s:form action="BuyAction">
<table>
<tr>
<td>
<span>商品名</span>
</td>
<td>
<input type="text" name="bookname" value="" />
</td>
</tr>
<tr>
<td>
<span>値段</span>
</td>
<td>
<input type="text" name="bookprice" value="" />
</td>
</tr>

<s:submit value="商品を追加する"/>
</table>


</s:form>




<s:form action="Buy">
<s:submit value="商品を買う"/>
</s:form>
</div>




</body>
</html>