<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<meta charset="UTF-8">
		<!--
        	作者：htc.minos@gmail.com
        	时间：2018-04-26
        	描述：适当的绘制和触屏缩放，移动设备优先
        -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>主页</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	</head>
<body>
		<s:debug></s:debug>
		<a href="${pageContext.request.contextPath}/album_show.action">返回相册</a>
		<label><h1>上传照片</h1></label>
		<font color="red"><s:fielderror /></font>
		<s:form action="photo_add"  method="post" enctype="multipart/form-data">
			<s:hidden name="currentAlbumId"></s:hidden>
			<s:file name="listFile" label="照片"></s:file>
			<s:submit label="上传" />
		</s:form>
		<!-- 当前用户相册列表 -->
		<table border="1">
		<s:iterator value="listPhoto" status="statu" >
			<tr>
				<th>编号</th>
				<td>照片</td>
			</tr>
			<tr>
				<td><s:property value="photoId" /></td>
				<td>
						<img src="<s:property value="ImagePath"/><s:property value="photoName" />" width="384px" height="256px">
				</td>
			<tr>
		</s:iterator>
		</table>	
</html>