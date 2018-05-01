<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<s:debug></s:debug>
		<!-- 当前相册照片列表 -->
		<table border="1">
		<s:iterator value="listAlbum" status="statu" >
			<tr>
				<th>编号</th>
				<td>相册名称</td>
				<td>相册描述</td>
			</tr>
			<tr>
				<td><s:property value="albumId" /></td>
				<td><a href="photo_show.action?currentAlbumId=<s:property value="albumId" />"><s:property value="albumName" /></a></td>
				<td><s:property value="albumDescribe" /></td>
			<tr>
		</s:iterator>
		</table>
		<!-- 创建相册 -->
		<form action="album_add">
				<table border="1">
				<tr ><th colspan="2">创建相册</th></tr>
				<tr>
					<td>相册名称</td>
					<td><input type="text" name="albumName"></td>
				</tr>
				<tr>
					<td>相册描述</td>
					<td><input type="text" name="albumDescribe"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="创建相册"/></td>
					<td><input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</body>
</html>