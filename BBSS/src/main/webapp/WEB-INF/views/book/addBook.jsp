<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>添加图书</title>
<!-- Bootstrap -->
<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/jquery.cxcalendar.css">

</head>
<style>
#box{
width:80%;
padding-top: 20px;
}

</style>
<body>
<div class="center-block" id="box" >
	<form class="form-horizontal" id="addBook" action="addBook" method="post"
		enctype="multipart/form-data">
		<fieldset>

			<!-- Form Name -->
			<legend>AddBook</legend>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="bookname">图书名</label>
				<div class="col-md-4">
					<input id="bookname" name="bookname" type="text" placeholder="图书名称"
						class="form-control input-md">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="author">图书作者</label>
				<div class="col-md-4">
					<input id="author" name="author" type="text" placeholder="图书作者"
						class="form-control input-md">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="publish">出版社</label>
				<div class="col-md-4">
					<input id="publish" name="publish" type="text" placeholder="出版社"
						class="form-control input-md">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="isbn">ISBN</label>
				<div class="col-md-4">
					<input id="isbn" name="isbn" type="text" placeholder="ISBN"
						class="form-control input-md">

				</div>
			</div>

			<!-- Text input-->
			  <div class="form-group">
				<label class="col-md-4 control-label" for="publishdate" >出版时间</label>
				<div class="col-md-4">
					<input id="publishdate" name="publishdate" type="text"
						placeholder="出版时间" class="form-control input-md" data-position="right" readonly>
						

				</div>
			</div> 

			<!-- Select Basic -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="repertory">图书仓库</label>
				<div class="col-md-4">
					<select id="repertory" name="repertory" class="form-control">
						<option value="武汉">武汉</option>
						<option value="广州">广州</option>
						<option value="北京">北京</option>
					</select>
				</div>
			</div>
			<!-- Select Basic -->
			<!--   比较耗时
			<div class="form-group" id="classifyjson"
				data-url="classifyJson">
				<label class="col-md-3 control-label"
					for="receiveraddress">图书分类</label>
					<div class="col-md-3">
							<select id="one " name="one"  
							class="form-control one cxselect " disabled="disabled">
									<option >省份</option>
						</select>
					</div>
					<div class="col-md-3">
							<select id="two" name="two"  
							class="form-control two cxselect " disabled="disabled">
									<option >省份</option>
						</select>
					</div>
					<div class="col-md-3">
							<select id="three " name="three"  
							class="form-control three cxselect " disabled="disabled">
									<option >省份</option>
						</select>
					</div>
			</div>
			-->
			<!-- Select Basic -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="bookclassid">图书分类</label>
				<div class="col-md-2">
					<select id="bookOneclassid" name="bookOneclassid" class="form-control" onchange="getTwoClassify()" >
						  <option value="-1">一级分类</option>
					</select>
				</div>
				<div class="col-md-2">
					<select id="bookTwoclassid" name="bookTwoclassid"  
						class="form-control " onchange="getThreeClassify()">
						  <option value="-1">二级分类</option>
					</select>
				</div>
				<div class="col-md-2">
					<select id="bookThreeclassid" name="bookThreeclassid"  
						class="form-control ">
						  <option value="-1">三级分类</option>
					</select>
				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="price">图书价格</label>
				<div class="col-md-4">
					<input id="price" name="price" type="text" placeholder="10.0"
						class="form-control input-md">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="stock">库存量</label>
				<div class="col-md-4">
					<input id="stock" name="stock" type="text" placeholder="1"
						class="form-control input-md">

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
						<label for="isrecommend"> <input type="checkbox"
							name="isrecommend" id="isrecommend" value="1"> 墙裂推荐
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

				<div class="col-md-4"></div>
				<div class="col-md-4">
					<button class="btn btn-primary">添加</button>
				</div>
			</div>

		</fieldset>
	</form>
</div>
	 <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>   
	
	 <script src="<%=request.getContextPath()%>/resources/js/jquery.cxcalendar.min.js"></script>
	 <script src="<%=request.getContextPath()%>/resources/js/jquery.cxcalendar.languages.js">
	 </script>
	 <script type="text/javascript">
	 $('#publishdate').cxCalendar({language: 'zh-cn',});
	 </script>

	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	 <script src="<%=request.getContextPath()%>/resources/js/jquery.validate.min.js"></script>
		<script
		src="<%=request.getContextPath()%>/resources/js/jquery.cxselect.min.js"></script>
	<script>
	
		$('#classifyjson').cxSelect({

			selects : [ 'one', 'two', 'three' ],
			nodata : 'none'
		});
	</script>
	
	<script> 
	$(document).ready(function(){
		var url = "selectClassOne";
		$.ajax( {
			type : "GET",
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
					$("#bookOneclassid").append("<option  value='"+ids+"'>"+names+"</option>");
		     		}
			}
		})
		
	});
	
	function getTwoClassify() {
		$("#bookTwoclassid").empty();//清空
		var id = document.getElementById("bookOneclassid").value;
		var url = "selectClassTwo/"+id;
		$.ajax( {
			type : "GET",
			url : url,
			data : {},
			dataType : "JSON",
			success : function(data) {
				$("#bookTwoclassid").append(" <option value='-1' >二级分类</option>");
				//data为后台返回的Json信息
				for(var n=0;n<data.length;n++){
				//	alert(data.length);
		 		  	var ids=data[n].classid;
		 		  //	alert(ids);
					var names=data[n].classname;
				//	alert(names);
					$("#bookTwoclassid").append("<option  value='"+ids+"'>"+names+"</option>");
		     		}
			}
		})
	};
	function getThreeClassify() {
		$("#bookThreeclassid").empty();//清空
		var id = document.getElementById("bookTwoclassid").value;
		var url = "selectClassThree/"+id;
		$.ajax( {
			type : "GET",
			url : url,
			data : {},
			dataType : "JSON",
			success : function(data) {
				$("#bookThreeclassid").append(" <option value='-1' >三级分类</option>");
				//data为后台返回的Json信息
				for(var n=0;n<data.length;n++){
				//	alert(data.length);
		 		  	var ids=data[n].classid;
		 		  //	alert(ids);
					var names=data[n].classname;
				//	alert(names);
					$("#bookThreeclassid").append("<option  value='"+ids+"'>"+names+"</option>");
		     		}
			}
		})
	};
		$(document).ready(function() {
			$("#addBook").validate({
				rules : {
					bookname : {
						required : true,
						minlength : 2,
						maxlength : 100
					},
					author : {
						required : true,
						minlength : 2,
						maxlength : 50
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
						number:true,
						min:10                       
					},staock:{
						digits:true,
						min:10                       
					},
					bookOneclassid:{
						required:true,
					},
					bookTwoclassid:{
						required:true,
					},
					bookThreeclassid:{
						required:true,
					}
				},
				messages : {
					bookname : {
						required : "请输入图书名称",
						minlength : "图书名称最短为两个字",
						maxlength : "图书名称最长为100个字"
					},
					author : {
						required : "请输入作者",
						minlength : "作者名称最短为两个字",
						maxlength : "作者名称最长为50个字"
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
						number:"请输入价格",
						min:"价格最少为10元"                       
					},staock:{
						digits:"请输入整数",
						min:"库存最少为10件"                     
					},
					bookOneclassid:{
						required:"请重新选择分类"
					},
					
					
					
					bookTwoclassid:{
						required:"请重新选择分类"
					},
					bookThreeclassid:{
						required:"请重新选择分类"
					}
				}
			});
		});
	</script>
</body>

</html>
