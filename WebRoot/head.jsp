<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
//String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("path", path);
%>
<html>
  <head>
	<link href="${path}/css/css.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="${path}/js/jquery-1.7.1.min.js"></script>
  </head>
</html>
