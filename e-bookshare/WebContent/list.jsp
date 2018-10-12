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
<title>商品一覧</title>
<link rel="stylesheet" type="text/css" href="./css/style.css" />


</head>
<body>


<div id=”text-center”>

<p>あとはここに商品一覧さえ表示されれば俺の勝ち</p>

<!-- 商品を表示する(ECサイト中級のmyPage.jspを参考にしてみてください) -->



<table border="1">
<tr>
	<th>本の名前</th>
	<th>値段</th>
</tr>


<%-- <s:iterator value="bookDTOList"> --%>
<!-- <tr> -->
<%-- 	<th><s:property value="bookname"/></th> --%>
<%-- 	<th><s:property value="bookprice"/></th> --%>
<!-- </tr> -->
<%-- </s:iterator> --%>



<!-- ここに最終的な商品リストを入れる。商品リストをDAOやACTIONDTOなど全て使ってがんばって作ってみよう -->


<s:iterator value="bookDTOList">
<tr>
<td><s:property value="bookname" /></td>
<td><s:property value="bookprice" /><span>円</span></td>
</tr>
</s:iterator>

</table>


<s:form action="GoHomeAction">
<s:submit value="ホームに戻る"/>
</s:form>



</div>

</body>
</html>