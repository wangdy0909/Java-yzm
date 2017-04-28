<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Java验证码</title>
</head>

<body>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td width="100">&nbsp;</td>
			<td width="100">验证码：</td>
			<td width="150">
				<input id="veryCode" name="veryCode" type="text" class="yzm" value="" onmouseout="isRightCode()" /></td>
			<td width="135"><img id="imgObj" alt="" src="DrawImage"
				onclick="changeImg()" /></td>
			<td><a href="#" onclick="changeImg()">换一张</a></td>
			<td></td>
		</tr>
		<tr>
			<td style="line-height: 38px; color: #FF0000; text-align: center;" colspan="4" id="info">&nbsp;</td>
			<td></td>
		</tr>
	</table>
	<script type="text/javascript" src="js/jQuery.js"></script>
	<script type="text/javascript" src="js/verifyCode.js"></script>
</body>
</html>
