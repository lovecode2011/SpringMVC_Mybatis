
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
	<form class="form-horizontal"  id="addReceiver" action="Receiver" method="post">
		<fieldset>

			<!-- Form Name -->
			<legend>AddReceiver</legend>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="userid">用户id</label>
				<div class="col-md-4">
					<input id="userid" name="userid" type="text" placeholder="用户id" value ="${userid }"
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
				<label class="col-md-4 control-label" for="receivertel">收货人电话</label>
				<div class="col-md-4">
					<input id="receivetel" name="receivertel" type="text"
						placeholder="收货人电话" class="form-control input-md">

				</div>
			</div>

			<!-- Select Basic -->
			<div class="form-group" id="city_china" data-url="<%=request.getContextPath()%>/resources/js/cityData.min.js" >
				<label class="col-md-4 control-label" for="receiveraddress">收货人地址</label>
				<div class="col-md-3"  >
          <p>省份：<select class="province cxselect" disabled="disabled" name="province"></select></p>
          <p>城市：<select class="city cxselect" disabled="disabled" name="city"></select></p>
          <p>地区：<select class="area cxselect" disabled="disabled" name="area"></select></p>
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
	$('#global_location').cxSelect({
		  selects: ['country', 'state', 'city', 'region'],
		  nodata: 'none'
		});
	
	$('#city_china').cxSelect({
		  selects: ['province', 'city', 'area'],
		  nodata: 'none'
		});
		$('#receiveraddress').cxSelect({

			selects : [ 'one', 'two', 'three' ],
			nodata : 'none'
		});
	</script>
</body>

</html>
