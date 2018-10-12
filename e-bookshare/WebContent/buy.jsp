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
<title>追加完了</title>
<link rel="stylesheet" type="text/css" href="./css/style.css" />


</head>
<body>


<div id=”text-center”>



<p>商品が追加されました。では商品を買いにいきましょう</p>

<s:form action="ListAction">
<s:submit value="商品を買いにいく"/>
</s:form>



</div>




</body>
</html>