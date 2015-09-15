<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>登录</title>
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
<style type="text/css">
body {
	background-color: #F6F9FB;
}

#mainbox {
	background-color: #FFF;
	margin-top: 120px;
	margin-left: 200px;
	width: 840px;
	height: 430px;
	padding: 15px 15px;
	border: 1px solid #eef2f4;
	box-shadow: 0px 1px 2px #eee;
}

#mainbox img {
	width: 400px;
	height: 400px;
}

#register {
	padding-top: 40px;
	padding-left: 20px;
}

#register .input-group {
	padding-top: 10px;
}


#footer {
	padding-top: 50px;
}
</style>
</head>

<body>
	<div class="container-fluid">
		<div class="row" id="mainbox">
			<div class="col-md-4">
				<img alt="Bootstrap Image Preview"
					src="<%=request.getContextPath()%>/resources/images/01.jpg"
					class="img-rounded" />
			</div>
			<div class="col-md-8">
				<form class="form-horizontal" id="register" action="register" method="post">
					<fieldset>
						<!-- Prepended text-->
						<div class="form-group">
							<label class="col-md-4 control-label" for="username"></label>
							<div class="col-md-8">
								<div class="input-group">
									<span class="input-group-addon">昵称</span> <input id="username"
										name="username" class="form-control" placeholder="请输入昵称"
										type="text">
								</div>

							</div>
						</div>

						<!-- Prepended text-->
						<div class="form-group">
							<label class="col-md-4 control-label" for="email"></label>
							<div class="col-md-8">
								<div class="input-group">
									<span class="input-group-addon">邮箱</span> <input id="email"
										name="email" class="form-control" placeholder="请输入邮箱"
										type="text">
								</div>

							</div>
						</div>

						<!-- Prepended text-->
						<div class="form-group">
							<label class="col-md-4 control-label" for="password"></label>
							<div class="col-md-8">
								<div class="input-group">
									<span class="input-group-addon">密码</span> <input id="password"
										name="password" class="form-control" placeholder="请输入密码"
										type="password">
								</div>

							</div>
						</div>

						<!-- Prepended text-->
						<div class="form-group">
							<label class="col-md-4 control-label" for="repassword"></label>
							<div class="col-md-8">
								<div class="input-group">
									<span class="input-group-addon">密码</span> <input
										id="repassword" name="repassword" class="form-control"
										placeholder="请输入重复密码" type="password">
								</div>

							</div>
						</div>

						<!-- Button -->
						<div class="form-group">
					
							<div class="col-md-4">
							</div>
							<div class="col-md-4">
								<button  name="register" class="btn btn-primary">注册</button>
							</div>
							<div class="col-md-4">
								<button  name="login" class="btn btn-primary pull-right">登陆</button>
							</div>
						</div>

					</fieldset>
				</form>
			</div>
		</div>
	</div>

	<div class="text-center" id="footer">
		<span>Copyright (C) BookSales 2004-2012, All Rights Reserved</span><span>
			| </span><span>BY<a href="#" class="btn btn-link btn-xs "
			role="button">软件实训小组</a></span>
	</div>


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
					"repassword":{
						equalTo:"#password"
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
					},username : {
						required : "请输入昵称",
						minlength : "昵称最短长度为1位",
						maxlength : "昵称最长长度为12位"
					},
					"repassword":{
						equalTo:"两次输入的密码不一致"
					}

				}
			});
		});
	</script>
</body>

</html>
