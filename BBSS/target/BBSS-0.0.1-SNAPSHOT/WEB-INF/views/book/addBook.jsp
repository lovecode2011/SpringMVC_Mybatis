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
<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>AddBook</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="bookname">图书名</label>  
  <div class="col-md-4">
  <input id="bookname" name="bookname" type="text" placeholder="图书名称" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="author">图书作者</label>  
  <div class="col-md-4">
  <input id="author" name="author" type="text" placeholder="图书作者" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="publish">出版社</label>  
  <div class="col-md-4">
  <input id="publish" name="publish" type="text" placeholder="出版社" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="isbn">ISBN</label>  
  <div class="col-md-4">
  <input id="isbn" name="isbn" type="text" placeholder="ISBN" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="publishdate">出版时间</label>  
  <div class="col-md-4">
  <input id="publishdate" name="publishdate" type="text" placeholder="出版时间" class="form-control input-md">
    
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="repertory">图书仓库</label>
  <div class="col-md-4">
    <select id="repertory" name="repertory" class="form-control">
      <option value="1">武汉</option>
      <option value="2">广州</option>
      <option value="3">北京</option>
    </select>
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="bookclassid">图书分类</label>
  <div class="col-md-4">
    <select id="bookclassid" name="bookclassid" class="form-control">
      <option value="1">计算机</option>
      <option value="2">自然学科</option>
      <option value="3">java</option>
    </select>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="price">图书价格</label>  
  <div class="col-md-4">
  <input id="price" name="price" type="text" placeholder="10.0" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="stock">库存量</label>  
  <div class="col-md-4">
  <input id="stock" name="stock" type="text" placeholder="1" class="form-control input-md">
    
  </div>
</div>

<!-- File Button --> 
<div class="form-group">
  <label class="col-md-4 control-label" for="picture">图书封面</label>
  <div class="col-md-4">
    <input id="picture" name="picture" class="input-file" type="file">
  </div>
</div>

<!-- Multiple Checkboxes -->
<div class="form-group">
  <label class="col-md-4 control-label" for="isrecommend">是否推荐</label>
  <div class="col-md-4">
  <div class="checkbox">
    <label for="isrecommend-0">
      <input type="checkbox" name="isrecommend" id="isrecommend-0" value="1">
      墙裂推荐
    </label>
	</div>
  </div>
</div>

<!-- Textarea -->
<div class="form-group">
  <label class="col-md-4 control-label" for="intro">图书简介</label>
  <div class="col-md-4">                     
    <textarea class="form-control" id="intro" name="intro">这是一本怎么样的书！！</textarea>
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="">提交</label>
  <div class="col-md-4">
    <button id="" name="" class="btn btn-primary">确定</button>
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
