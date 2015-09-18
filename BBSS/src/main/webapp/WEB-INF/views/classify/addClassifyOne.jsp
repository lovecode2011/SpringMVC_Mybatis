<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>添加图书</title>
<!-- Bootstrap -->
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/Font-Awesome/css/font-awesome.min.css">
</head>

<body>
	<form class="form-horizontal" id="addClassifyOne" action="addClassifyOne"
		method="post">
		<fieldset>

			<!-- Form Name -->
			<legend>addClassifyOne</legend>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="classname">一级图书目录</label>
				<div class="col-md-4">
					<input id="classname" name="classname" type="text"
						placeholder="图书分类" class="form-control input-md">
				</div>
			</div>
			<!-- Button -->
			<div class="form-group">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<button class="btn btn-primary">添加</button>
				</div>
			</div>
		</fieldset>
	</form>
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery.validate.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script>
		$(document).ready(function() {
			$("#addClassifyOne").validate({
				rules : {
					classname : {
						required : true,
						minlength : 2,
						maxlength : 5
					},
				},
				messages : {
					classname : {
						required : "请输入分类名称",
						minlength : "名称最短长度为2位",
						maxlength : "名称最长长度为5位"
					},
				}
			});
		});
	</script>
</body>

</html>
