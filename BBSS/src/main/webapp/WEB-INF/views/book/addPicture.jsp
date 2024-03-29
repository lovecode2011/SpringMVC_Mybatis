<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	href="<%=request.getContextPath()%>/resources/Font-Awesome/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/Font-Awesome/css/font-awesome.min.css">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<form class="form-horizontal"  id="addPicture" action="addPicture" method="post"
		enctype="multipart/form-data">
		<fieldset>

			<!-- Form Name -->
			<legend>AddPicture</legend>

			<!-- File Button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="picture">图书封面</label>
				<div class="col-md-4">
					<input id="picture" name="picture" class="input-file" type="file">
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
			$("#register").validate({
				rules : {
					email : {
						required : true,
						email : true
					},
					password : {
						required : true,
						minlength : 2,
						maxlength : 10
					},
					username : {
						required : true,
						minlength : 1,
						maxlength : 12
					},
					"repassword" : {
						equalTo : "#password"
					}
				},
				messages : {
					email : {
						required : '请输入电子邮件',
						email : '请检查电子邮件的格式'
					},
					password : {
						required : '请输入密码',
						minlength : "密码最短为2位",
						maxlength : "密码最长为10位"
					},
					username : {
						required : "请输入昵称",
						minlength : "昵称最短长度为1位",
						maxlength : "昵称最长长度为12位"
					},
					"repassword" : {
						equalTo : "两次输入的密码不一致"
					}

				}
			});
		});
	</script>
</body>

</html>
