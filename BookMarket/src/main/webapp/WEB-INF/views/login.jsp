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

#loginForm {
	padding-top: 80px;
	padding-left: 20px;
}

#loginForm .input-group {
	padding-top: 20px;
}

#loginForm img {
	width: 80px;
	height: 35px;
}

#footer {
	padding-top: 50px;
}
</style>
</head>

<body>
	<div class="container-fluid">
		<div class="row" id="mainbox">
			<div class="col-md-6">
				<img alt="Bootstrap Image Preview"
					src="<%=request.getContextPath()%>/resources/images/01.jpg"
					class="img-rounded" />
			</div>
			<div class="col-md-6">
				<form id="loginForm" action="login" method="post"
					class="form-horizontal">
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">邮箱</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" placeholder="Email"
								name="email" value="${cookie.email.value}">
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">密码</label>
						<div class="col-sm-10">
							<input type="password" class="form-control"
								placeholder="Password" name="password"
								value="${cookie.password.value}">
						</div>
					</div>
					<!-- /input-group -->
					<div class="form-group" id="imgview">

						<div class="col-md-8">
							<input type="text" class="form-control pull-left "
								placeholder="验证码" name="checkcode">
						</div>

						<!-- <img  align="middle" title="看不清，请点我"  /> -->
						<div class="col-md-4">

							<img alt="验证图片"
								src="<%=request.getContextPath()%>/VerifyCodeServlet"
								class="img-rounded  " onclick="javascript:refresh(this);"
								onmouseover="mouseover(this)" />
						</div>

					</div>
					<div class="checkbox">
						<label> <input type="checkbox" name="checkbox">
							记住密码
						</label> <label class="pull-right"> <a href="register"
							class="btn btn-link btn-xs " role="button">立即注册</a>
						</label>
						<!--
                         <label class="pull-right">
                            <a href="#" class="btn btn-link btn-xs " role="button">忘记密码</a>
                        </label>
                        -->
					</div>
					<button type="submit" class="btn btn-primary btn-block btn-lg">登录</button>
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
    function refresh(obj){  
         obj.src = "<%=request.getContextPath()%>/VerifyCodeServlet?"+ Math.random();
	}

	function mouseover(obj) {
		obj.style.cursor = "pointer";
	}

	$(document).ready(function() {
		$("#loginForm").validate({
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
				checkcode:{
					required : true,
					minlength : 4,
					maxlength : 4
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
				checkcode:{
					required : "请输入验证码",
					minlength : "验证码的的长度为4",
					maxlength : "验证码的的长度为4"
				}
				
			}
		});
	});
	</script>
</body>

</html>
