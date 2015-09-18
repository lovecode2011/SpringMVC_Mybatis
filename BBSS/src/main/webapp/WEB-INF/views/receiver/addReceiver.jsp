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
				
					<p>
						所在地区： <select class="country cxselect" data-first-title="选择国家"
							disabled="disabled"></select> <select class="state cxselect"
							disabled="disabled"></select> <select class="city cxselect"
							disabled="disabled"></select> <select class="region cxselect"
							disabled="disabled"></select>
					</p>
				</fieldset>
			</div>
		</div>
	</div>

	<script src="<%=request.getContextPath()%>/resources/js/jjj.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery.cxselect.min.js"></script>

	<script>
	$.cxSelect.defaults.url = 'js/cityData.min.json';
	$('#global_location').cxSelect({
		selects : [ 'country', 'state', 'city', 'region' ],
		nodata : 'none'
	});
	/**
	$(document).ready(function(){
		var url = "GetDateJson";
		$.ajax( {
			type : "GET",
			url : url,
			data : {},
			dataType : "JSON",
			success : function(data) {
				$('#global_location').cxSelect({
					selects : [ 'country', 'state', 'city', 'region' ],
					nodata : 'none'
				});
			}
		})
		
	})
	**/
		
	</script>
</body>

</html>
