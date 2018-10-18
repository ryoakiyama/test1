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
<p>Oden Web</p>

</div>
<div id="text-center">

<table>
<s:form action="OCCAction">
<tr>

<td>

<label>おでんID:</label>

</td>
<td>
<input type="text" name="odenId" value="" />
</td>

</tr>
<tr>

<td>

<label>おでんの値段</label>

</td>
<td>
<input type="text" name="odenPrice" value="" />
</td>

</tr>
<tr>

<td>

<label>商品名</label>

</td>
<td>

<input type="text" name="odenName" value="" />

</td>

</tr>
<s:submit value="登録"/>

</s:form>
</table>



<div id="footer">
<div id="pr">
</div>
</div>

</div>
</div>


</body>
</html>