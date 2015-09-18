<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>添加图书</title>
<!-- Bootstrap -->
<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/Font-Awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/jquery.cxcalendar.css">

</head>

<body>
	<form class="form-horizontal" id="addBook" action="addBook" method="post"
		enctype="multipart/form-data">
		<fieldset>
			<!-- Form Name -->
			<legend>ModifyBook</legend>
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="bookname">图书名</label>
				<div class="col-md-4">
					<input id="bookname" name="bookname" type="text" placeholder="图书名称"
						class="form-control input-md" value="${book.bookname }">
				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="author">图书作者</label>
				<div class="col-md-4">
					<input id="author" name="author" type="text" placeholder="图书作者"
						class="form-control input-md" value="${book.author}">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="publish">出版社</label>
				<div class="col-md-4">
					<input id="publish" name="publish" type="text" placeholder="出版社"
						class="form-control input-md" value="${book.publish}">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="isbn">ISBN</label>
				<div class="col-md-4">
					<input id="isbn" name="isbn" type="text" placeholder="ISBN"
						class="form-control input-md" value="${book.isbn}">

				</div>
			</div>

			<!-- Text input-->
			  <div class="form-group">
				<label class="col-md-4 control-label" for="publishdate" >出版时间</label>
				<div class="col-md-4">
					<input id="publishdate" name="publishdate" type="text"
						placeholder="出版时间" class="form-control input-md" data-position="right" readonly value="${book.publishdate}">
				</div>
			</div> 

			<!-- Select Basic -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="repertory">图书仓库</label>
				<div class="col-md-4">
					<select id="repertory" name="repertory" class="form-control" value="${book.repertory }">
						<option value="武汉">武汉</option>
						<option value="广州">广州</option>
						<option value="北京">北京</option>
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
					<input id="price" name="price" type="text" placeholder="price"
						class="form-control input-md" value="${book.price}">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="stock">库存量</label>
				<div class="col-md-4">
					<input id="stock" name="stock" type="text" placeholder="1"
						class="form-control input-md" value="${book.stock }">

				</div>
			</div>

			<!-- File Button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="picture">图书封面</label>
				<c:if test="${book.picture!=NULL}">
					<div class="col-md-3">
					<img alt="图书封面" src="http://wwhahapic.tunnel.mobi/${book.picture }" width="200px" height="150px">
				</div>
				<div class="col-md-3">
					<input id="picture" name="picture" class="input-file" type="file">
				</div>
				</c:if>
				<c:if test="book.picture==NULL">
				<div class="col-md-4">
					<input id="picture" name="picture" class="input-file" type="file">
				</div>
				</c:if>
				
			</div>

			<!-- Multiple Checkboxes -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="isrecommend">是否推荐</label>
				<c:if test="${book.isrecommend==0}">
				<div class="col-md-4">
					<div class="checkbox">
						<label for="isrecommend"> <input type="checkbox"
							name="isrecommend" id="isrecommend" value="1"> 墙裂推荐
						</label>
					</div>
				</div>
				</c:if>
				<c:if test="${book.isrecommend==1}">
				<div class="col-md-4">
					<div class="checkbox">
						<label for="isrecommend"> <input type="checkbox"
							name="isrecommend" id="isrecommend" value="1" checked="checked"> 墙裂推荐
						</label>
					</div>
				</div>
				</c:if>
			</div>

			<!-- Textarea -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="intro">图书简介</label>
				<div class="col-md-4">
					<textarea class="form-control" id="intro" name="intro"> ${book.intro } </textarea>
				</div>
			</div>

			<!-- Button -->
			<div class="form-group">

				<div class="col-md-4"></div>
				<div class="col-md-4">
					<button class="btn btn-primary">修改</button>
				</div>
			</div>

		</fieldset>
	</form>

	 <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>   
	
	 <script src="<%=request.getContextPath()%>/resources/js/jquery.cxcalendar.min.js"></script>
	 <script src="<%=request.getContextPath()%>/resources/js/jquery.cxcalendar.languages.js">
	 
	 
	 </script>

	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	 <script src="<%=request.getContextPath()%>/resources/js/jquery.validate.min.js"></script>
	<script> 
	$('#publishdate').cxCalendar({language: 'zh-cn',});
		$(document).ready(function() {
			$("#addBook").validate({
				rules : {
					bookname : {
						required : true,
						minlength : 2,
						maxlength : 10
					},
					author : {
						required : true,
						minlength : 2,
						maxlength : 10
					},
					publish : {
						required : true,
						minlength : 2,
						maxlength : 20
					},
					isbn: {
						required : true,
						minlength : 6,
						maxlength : 15
					},
					publishDate: {
						required : true,
					},
					intro:{
						required : true,
						minlength : 12,
						maxlength : 1000
					},
					price:{
						required:true,
					},staock:{
						required:true,
					}
				},
				messages : {
					bookname : {
						required : "请输入图书名称",
						minlength : "图书名称最短为两个字",
						maxlength : "图书名称最长为10个字"
					},
					author : {
						required : "请输入作者",
						minlength : "作者名称最短为两个字",
						maxlength : "作者名称最长为10个字"
					},
					publish : {
						required : "请输入出版社",
						minlength : "出版社名称最短为两个字",
						maxlength : "出版社名称最长为20个字"
					},
					isbn: {
						required : "请输入ISBN",
						minlength : "ISBN最短为6",
						maxlength : "ISBN最长为15"
					},
					publishDate: {
						required : "请选择出版时间",
					},
					intro:{
						required : "请输入简介",
						minlength : "简介最短为12个字",
						maxlength : "简介最长为1000个字"
					},
					price:{
						required:"请输入价格",
					},staock:{
						required:"请输入库存",
					}
				}
			});
		});
	</script>
</body>

</html>
