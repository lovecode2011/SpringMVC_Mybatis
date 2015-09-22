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
<style>
#box{
width:80%;
padding-top: 100px;
}

</style>
<body>
<div class="center-block" id="box" >
	<form class="form-horizontal" id="addClassifyThree" action="addClassifyThree" method="post">
		<fieldset>

			<!-- Form Name -->
			<legend>AddSubClassify</legend>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="classname">图书分类</label>
				<div class="col-md-4">
					<input id="classname" name="classname" type="text"
						placeholder="图书分类" class="form-control input-md">
				</div>
			</div>

			<!-- Select Basic -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="classfatherid">图书父类</label>
				<div class="col-md-4">
					<select id="classfatherid" name="classfatherid"  
						class="form-control " onchange="getSubClassify()">
						<c:if test="${classList!=NULL}">
							<c:forEach var="c" items="${classList}" varStatus="clist">
								<option value="${c.classid}">${c.classname}</option>
							</c:forEach>
						</c:if>
					</select>
				</div>
				<div class="col-md-4">
					<select id="classSubid" name="classSubid"
						class="form-control" >
						<!-- 
						<c:if test="${classSubList!=NULL}">
							<c:forEach var="c" items="${classSubList}" varStatus="clist">
								<option value="${c.classid}">${c.classname}</option>
							</c:forEach>
						</c:if>
						 -->
					</select>
				</div>
			</div>

			<!-- Button -->
						<div class="form-group">
					
							<div class="col-md-4">
							</div>
							<div class="col-md-4">
								<button   class="btn btn-primary">添加</button>
							</div>
						</div>
		</fieldset>
	</form>

</div>

	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery.validate.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script>
	
	function getSubClassify() {
		$("#classSubid").empty();//清空
		var fatherid = document.getElementById("classfatherid").value;
		var url = "selectByFatherId?fatherid=" + fatherid;
		$.ajax( {
			type : "POST",
			url : url,
			data : {},
			dataType : "JSON",
			success : function(data) {
				//data为后台返回的Json信息
				for(var n=0;n<data.length;n++){
				//	alert(data.length);
		 		  	var ids=data[n].classid;
		 		  //	alert(ids);
					var names=data[n].classname;
				//	alert(names);
					$("#classSubid").append("<option  value='"+ids+"'>"+names+"</option>");
		     		}
			}
		})
	};
	$(document).ready(function(){
		
		var url = "selectByFatherId?fatherid=" + 1;
		$.ajax( {
			type : "POST",
			url : url,
			data : {},
			dataType : "JSON",
			success : function(data) {
				alert(data);
				//data为后台返回的Json信息
				for(var n=0;n<data.length;n++){
				//	alert(data.length);
		 		  	var ids=data[n].classid;
		 		  	alert(ids);
					var names=data[n].classname;
					alert(names);
					$("#classSubid").append("<option  value='"+ids+"'>"+names+"</option>");
		     		}
			}
		})
		
	})
	
		$(document).ready(function() {
			$("#addSubClassify").validate({
				rules : {
					classSubid : {
						required : true,
					},
					classname : {
						required : true,
						minlength : 1,
						maxlength : 12
					},
					"repassword" : {
						equalTo : "#password"
					}
				},
				messages : {
					classSubid : {
						required : '该根目录下没有二级目录，请重新选择',
					},
					classname : {
						required : "请输入分类名称",
						minlength : "分类最短长度为1位",
						maxlength : "分类最长长度为12位"
					},
				}
			});
		});
	</script>
</body>

</html>
