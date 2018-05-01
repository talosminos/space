<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		<div class="container-fluid">
			<div class="row">
				<button>上传照片 </button><button>创建相册</button>
				    <font color="red"><s:fielderror/></font>
			</div>
			<div>
			<div class="row">
			  <div class="col-sm-2">
			    <div class="thumbnail">
			      <img src="${pageContext.request.contextPath}/images/12.jpg">
			      <div class="caption">
			        <h3>Thumbnail label</h3>
			      </div>
			    </div>
			  </div>
			  <div class="col-sm-2">
			    <div class="thumbnail">
			      <img src="${pageContext.request.contextPath}/images/12.jpg">
			      <div class="caption">
			        <a href="#" class="btn btn-primary" role="button">Button</a>
			      </div>
			    </div>
			  </div>
			  <div class="col-sm-2">
			    <div class="thumbnail">
			      <img src="${pageContext.request.contextPath}/images/12.jpg">
			      <div class="caption">
			        <h3>Thumbnail label</h3>
			        <p>...</p>
			        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
			      </div>
			    </div>
			  </div>
			  <div class="col-sm-2">
			    <div class="thumbnail">
			      <img src="${pageContext.request.contextPath}/images/12.jpg">
			      <div class="caption">
			        <h3>Thumbnail label</h3>
			        <p>...</p>
			        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
			      </div>
			    </div>
			  </div>
			  <div class="col-sm-2">
			    <div class="thumbnail">
			      <img src="${pageContext.request.contextPath}/images/12.jpg">
			      <div class="caption">
			        <h3>Thumbnail label</h3>
			        <p>...</p>
			        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
			      </div>
			    </div>
			  </div>
			  <div class="col-sm-2">
			    <div class="thumbnail">
			      <img src="${pageContext.request.contextPath}/images/12.jpg">
			      <div class="caption">
			        <h3>Thumbnail label</h3>
			        <p>...</p>
			        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
			      </div>
			    </div>
			  </div>
			  <div class="col-sm-2">
			    <div class="thumbnail">
			      <img src="${pageContext.request.contextPath}/images/12.jpg">
			      <div class="caption">
			        <h3>Thumbnail label</h3>
			        <p>...</p>
			        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
			      </div>
			    </div>
			  </div>
			  <div class="col-sm-2">
			    <div class="thumbnail">
			      <img src="${pageContext.request.contextPath}/images/12.jpg">
			      <div class="caption">
			        <h3>Thumbnail label</h3>
			        <p>...</p>
			        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
			      </div>
			    </div>
			  </div>
			  <div class="col-sm-2">
			    <div class="thumbnail">
			      <img src="${pageContext.request.contextPath}/images/12.jpg">
			      <div class="caption">
			        <h3>Thumbnail label</h3>
			        <p>...</p>
			        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
			      </div>
			    </div>
			  </div>
			  <div class="col-sm-2">
			    <div class="thumbnail">
			      <img src="${pageContext.request.contextPath}/images/12.jpg">
			      <div class="caption">
			        <h3>Thumbnail label</h3>
			        <p>...</p>
			        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
			      </div>
			    </div>
			  </div>
			</div>
		</div>
	</body>
</html>
