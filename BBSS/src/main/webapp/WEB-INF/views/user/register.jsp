<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>登录</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="Font-Awesome/css/bootstrap.min.css">
<link rel="stylesheet" href="Font-Awesome/css/font-awesome.min.css">
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
	padding-top: 20px;
	padding-left: 20px;
}

#register .input-group {
	padding-top: 10px;
}

#footer {
	padding-top: 50px;
}

.alert {
	width: 70%;
	margin-left: 160px;
}
</style>
</head>

<body>
	<div class="container-fluid">
		<div class="row" id="mainbox">
			<div class="col-md-4">
				<img alt="Bootstrap Image Preview" src="images/01.jpg"
					class="img-rounded" />
			</div>
			<div class="col-md-8" id="message">
				<c:if test="${register==1 }">
					<div class="alert alert-success" role="alert" id="alert">注册成功！</div>
				</c:if>



				<form class="form-horizontal" id="register1" action="register"
					method="post">
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

							<div class="col-md-4"></div>
							<div class="col-md-4">
								<button name="register" class="btn btn-primary">注册</button>
							</div>
							<div class="col-md-4">
								<a href="login" class="btn btn-success  active pull-right"
									role="button">登陆</a>
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
	<script src="js/jquery.min.js"></script>
	<script src="js/jquery.validate.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script>  
	//前端输入数据校验
	$(document).ready(function() {
		$("#register1").validate({
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
			$("#register").click(function(){
				
			});
			/////动态查看用户名是否已经被使用了
			$("input[name='username']").change(function(){
				var username = $(this).val();
				username = $.trim(username);
				if(username!=""){
					var url="${pageContext.request.contextPath}/Validate/UserName";
					var args={"username":username,"time":new Date()};
					$.post(url,args,function(data){
					//	alert(data);
						if(data){
							$("#validateusername").remove();
						}
						$("#message").prepend(data);					
					})
				}
			});
			///查看用户邮箱是否也是已经被注册了
			$("input[name='email']").change(function(){
				var email = $(this).val();
				email = $.trim(email);
				if(email!=""){
				var url="${pageContext.request.contextPath}/Validate/Email";
				var args={"email":email,"time":new Date()};
				$.post(url,args,function(data){
					//	alert(data);
						if(data){
							$("#validateemail").remove();
						}
						$("#message").prepend(data);					
					})
				}
			});
	</script>
</body>

</html>
