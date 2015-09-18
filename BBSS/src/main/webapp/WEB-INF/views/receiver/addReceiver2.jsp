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
	href="<%=request.getContextPath()%>/resources/css/demo.css"
	rel="stylesheet">
</head>
<body>
	<div class="main">
		<div class="inwrap">
			<h1>jQuery cxSelect 多级联动下拉菜单</h1>
			<h2>全球主要国家城市联动</h2>
			<div class="example">
        <fieldset id="global_location" data-url="<%=request.getContextPath()%>/resources/js/globalData.min.js">
          <p>所在地区：
            <select class="country cxselect" data-first-title="选择国家" disabled="disabled"></select>
            <select class="state cxselect" disabled="disabled"></select>
            <select class="city cxselect" disabled="disabled"></select>
            <select class="region cxselect" disabled="disabled"></select>
          </p>
        </fieldset>
        
         <fieldset id="city_china" data-url="<%=request.getContextPath()%>/resources/js/cityData.min.js">
          <legend>默认</legend>
          <p>省份：<select class="province cxselect" disabled="disabled" name="province"></select></p>
          <p>城市：<select class="city cxselect" disabled="disabled" name="city"></select></p>
          <p>地区：<select class="area cxselect" disabled="disabled" name="area"></select></p>
        </fieldset>
        
         <fieldset id="classify" data-url="classifyJson">
          <legend>默认</legend>
          <p>省份：<select class="one cxselect" disabled="disabled" name="one"></select></p>
          <p>城市：<select class="two cxselect" disabled="disabled" name="two"></select></p>
          <p>地区：<select class="three cxselect" disabled="disabled" name="three"></select></p>
        </fieldset>
      </div>
		</div>
	</div>
	
	
	
	 <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>   
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
	$('#classify').cxSelect({
		  selects: ['one', 'two', 'three'],
		  nodata: 'none'
		});
	</script>
</body>

</html>
