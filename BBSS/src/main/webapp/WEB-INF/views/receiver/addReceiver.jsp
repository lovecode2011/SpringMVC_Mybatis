
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
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/Font-Awesome/css/font-awesome.min.css">
</head>

<body>
	<!-- Bootstrap -->
	<form class="form-horizontal">
		<fieldset>

			<!-- Form Name -->
			<legend>AddReceiver</legend>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="userid">用户id</label>
				<div class="col-md-4">
					<input id="userid" name="userid" type="text" placeholder="用户id"
						class="form-control input-md">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="receivername">收货人姓名</label>
				<div class="col-md-4">
					<input id="receivername" name="receivername" type="text"
						placeholder="收货人姓名" class="form-control input-md">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="receivetel">收货人电话</label>
				<div class="col-md-4">
					<input id="receivetel" name="receivetel" type="text"
						placeholder="收货人电话" class="form-control input-md">

				</div>
			</div>

			<!-- Select Basic -->
			<div class="form-group" id="receiveraddress" data-url="classifyJson">
				<label class="col-md-4 control-label" for="receiveraddress">收货人地址</label>
				<div class="col-md-3">
					<select class="one cxselect" disabled="disabled" name="one"
						class="form-control"></select>
				</div>
				<div class="col-md-3">
					<select class="two cxselect" disabled="disabled" name="two"
						class="form-control"></select>
				</div>
				<div class="col-md-2">
					<select class="three cxselect" disabled="disabled" name="three"
						class="form-control"></select>
				</div>
			</div>


			<!-- Textarea -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="receiveraddress2">具体地址</label>
				<div class="col-md-4">
					<textarea class="form-control" id="receiveraddress2"
						name="receiveraddress2">具体地址</textarea>
				</div>
			</div>

			<!-- Button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="">添加</label>
				<div class="col-md-4">
					<button id="" name="" class="btn btn-primary">添加</button>
				</div>
			</div>

		</fieldset>
	</form>

	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery.validate.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery.cxselect.min.js"></script>

	<script>
		$('#receiveraddress').cxSelect({

			selects : [ 'one', 'two', 'three' ],
			nodata : 'none'
		});
	</script>
</body>

</html>
