<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<!--
        	作者：htc.minos@gmail.com
        	时间：2018-04-26
        	描述：全局布局容器
        -->	
		<div class="container-fluid">
			<!--
            	作者：htc.minos@gmail.com
            	时间：2018-04-26
            	描述:欢迎信息
            -->
			<div class="row">
				<!--
                	作者：htc.minos@gmail.com
                	时间：2018-04-26
                	描述：导航条
                -->
				<ul class="nav nav-tabs">
				  <li role="presentation" class="active"><a href="#">主页</a></li>
				  <li role="presentation"><a href="${pageContext.request.contextPath}/album_show.action">相册</a></li>
				  <li role="presentation"><a href="#">博客</a></li>
				</ul>
			</div>
			<div class="row">
								
			</div>
			<div class="row">
				派行公司 版权所有
			</div>
		</div>
	</body>
</html>
