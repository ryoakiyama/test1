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

<h1>おでん一覧</h1>
<br>
<table>
<tbody>
<tr>
<th>おでんID</th>
<th>おでんNAME</th>
<th>おでん値段</th>
</tr>
<s:iterator value="odenDTOList">
<tr>
<td><s:property value="odenId"/></td>
<td><s:property value="odenName"/></td>
<td><s:property value="odenPrice"/></td>
</tr>
</s:iterator>
</tbody>
</table>




</body>
</html>