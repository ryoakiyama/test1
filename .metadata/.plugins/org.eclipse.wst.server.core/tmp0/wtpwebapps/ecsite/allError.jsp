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
		<title>俺が一生懸命作ったエラーページ</title>
		<link rel="stylesheet" type="text/css" href="./css/style.css" />
	</head>
	<body>

		<div id="header">

			<div id="pr">
			</div>

		</div>
		<div id="main">

			<div id="top">
			<p>Login</p>

		</div>
		<div>

<p>
<font size="7">
できてないよ！ざんねん！
</font>
</p>

<s:if test="errorMassage != ''">
<s:property value="errorMassage" />
</s:if>

<p>
<img src="gatarou.jpg">
</p>



		</div>

		</div>
		<div id="footer">

		<div id="pr">
		</div>

		</div>

	</body>
</html>