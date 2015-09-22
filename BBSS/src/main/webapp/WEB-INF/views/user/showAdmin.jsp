<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理页面</title>

<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/Font-Awesome/css/font-awesome.min.css">
	  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/zTreeStyle/zTreeStyle.css" type="text/css">
</head>
<body>
	<div class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
			<a href="##" class="navbar-brand">BookSales</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="##">后台首页</a></li>
			<li class="dropdown"><a href="##" data-toggle="dropdown"
				class="dropdown-toggle">分类管理<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="addClassifyOne">添加一级分类</a></li>
					<li><a href="addClassifyTwo">添加二级分类</a></li>
					<li><a href="addClassifyThree">添加三级分类</a></li>
				</ul></li>
			<li class="dropdown"><a href="##" data-toggle="dropdown"
				class="dropdown-toggle">图书管理<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="addBook">添加图书</a></li>
					<li><a href="##">删除图书</a></li>
				</ul></li>
			<li><a href="##">关于我们</a></li>
		</ul>
		<ul class="nav navbar-nav pull-right">
			<li><a href="##">管理员：${admin.username}</a></li>
		</ul>
	</div>
	<div class="row">
		<div class="col-xs-3 col-md-2">
			<ul class="nav nav-pills nav-stacked" style="max-width: 260px;">
				<li class="active"><a href="#"> <span
						class="badge pull-right">${fn:length(booklist.list)} </span>图书列表
				</a></li>
				<li><a href="#userpanel"> <span class="badge pull-right">${fn:length(userlist)}
					</span>用户列表
				</a></li>
				<li><a href="#"> <span class="badge pull-right">3</span>
						订单列表
				</a></li>
			</ul>
			<br />
		</div>
		<div class="col-xs-15 col-md-10">
			<div class="panel panel-success">
				<div class="panel-heading">图书列表</div>
				<div class="panel-body">
					<table class="table table-bordered">
						<thead>
							<tr>
								<th>图书编号</th>
								<th>图书名称</th>
								<th>图书作者</th>
								<th>图书出版社</th>
								<th>ISBN</th>
								<th>图书仓库地址</th>
								<th>图书价格</th>
								<th>图书库存</th>
								<th>图书销量</th>
								<th>图书分类</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:if test="${booklist!=NULL}">
								<c:forEach var="b" items="${booklist.list}" varStatus="blist">
									<tr>
										<td>${b.bookid}</td>
										<td>${b.bookname}</td>
										<td>${b.author}</td>
										<td>${b.publish}</td>
										<td>${b.isbn}</td>
										<td>${b.repertory}</td>
										<td>${b.price}</td>
										<td>${b.stock}</td>
										<td>${b.sales}</td>
										<td>${b.bookclassid}</td>
										<td><a href="Book/${b.bookid}"
											class="btn btn-warning  btn-sm" role="button">修改</a> <a
											href="deleteBookById/${b.bookid}"
											class="btn btn-danger  btn-sm" role="button">删除</a></td>


									</tr>
								</c:forEach>
							</c:if>

						</tbody>

					</table>
					<div class="row">
						<div class="col-md-4"></div>
						<div class="col-md-4">
							<nav>
								<ul class="pagination pagination-sm">
									<li><a
										href="${pageContext.request.contextPath}/bookPage?pageNum=${booklist.prePage}&pageSize=${booklist.pageSize}"><span>&laquo;</span> </a></li>
									<c:forEach items="${booklist.navigatepageNums}" var="nav">
										<c:if test="${nav == booklist.pageNum}">
											<li><a href="##">${nav}</a></li>
										</c:if>
										<c:if test="${nav != booklist.pageNum}">
											<li><a
												href="${pageContext.request.contextPath}/bookPage?pageNum=${nav}&pageSize=${booklist.pageSize}">${nav}</a></li>
										</c:if>
									</c:forEach>
									<li><a
										href="${pageContext.request.contextPath}/bookPage?pageNum=${booklist.nextPage}&pageSize=${booklist.pageSize}">
											<span aria-hidden="true">&raquo;</span>
									</a></li>
								</ul>
							</nav>
						</div>
					</div>

				</div>
				<div class="panel-footer">
					<a href="listBook" class="btn btn-primary  btn-xs" role="button">查看详情</a>
				</div>
			</div>
			<div class="panel panel-primary" id="userpanel">
				<div class="panel-heading">用户列表</div>
				<div class="panel-body">
					<table class="table table-bordered">
						<thead>
							<tr>
								<th>用户编号</th>
								<th>用户名称</th>
								<th>用户邮箱</th>
								<th>用户密码</th>
								<th>用户积分</th>
								<th>收货地址</th>
								<th>操作</th>

							</tr>
						</thead>
						<tbody>
							<c:if test="${userlist!=NULL}">
								<c:forEach var="u" items="${userlist}">
									<tr>
										<td>${u.userid}</td>
										<td>${u.username}</td>
										<td>${u.email}</td>
										<td>${u.password}</td>
										<td>${u.credit}</td>
										<td>
											<!-- Button trigger modal -->
											<button type="button" class="btn btn-primary btn-sm"
												data-toggle="modal" data-target="#myModal">添加</button> <!-- Modal -->
											<div class="modal fade" id="myModal" tabindex="-1"
												role="dialog" aria-labelledby="myModalLabel">
												<div class="modal-dialog" role="document">
													<div class="modal-content">
														<div class="modal-header">
															<button type="button" class="close" data-dismiss="modal"
																aria-label="Close">
																<span aria-hidden="true">&times;</span>
															</button>
															<h4 class="modal-title" id="myModalLabel">添加收货地址</h4>
														</div>
														<div class="modal-body">
															<form class="form-horizontal" id="addReceiver"
																action="addReceiver" method="post">
																<fieldset>
	
																	<input id="userid" type="text" name="userid" value="${u.userid}">
																	
																	<!-- Text input-->
																	<div class="form-group">
																		<label class="col-md-3 control-label"
																			for="receivername">收货人姓名</label>
																		<div class="col-md-4">
																			 <input
																				id="receivername" name="receivername" type="text"
																				placeholder="收货人姓名" class="form-control input-md">

																		</div>
																	</div>

																	<!-- Text input-->
																	<div class="form-group">
																		<label class="col-md-3 control-label"
																			for="receivertel">收货人电话</label>
																		<div class="col-md-4">
																			<input id="receivetel" name="receivertel" type="text"
																				placeholder="收货人电话" class="form-control input-md">

																		</div>
																	</div>

																	<!-- Select Basic -->
																	<div class="form-group" id="city_china"
																		data-url="<%=request.getContextPath()%>/resources/js/cityData.min.js">
																		<label class="col-md-3 control-label"
																			for="receiveraddress">收货人地址</label>
																		<div class="col-md-3">
																			<select id="province " name="province"
																				class="form-control province cxselect "
																				disabled="disabled">
																				<option>省份</option>
																			</select>
																		</div>
																		<div class="col-md-3">
																			<select id="city " name="city"
																				class="form-control city cxselect "
																				disabled="disabled">
																				<option>省份</option>
																			</select>
																		</div>
																		<div class="col-md-3">
																			<select id="area " name="area"
																				class="form-control area cxselect "
																				disabled="disabled">
																				<option>省份</option>
																			</select>
																		</div>
																	</div>


																	<!-- Textarea -->
																	<div class="form-group">
																		<label class="col-md-3 control-label"
																			for="receiveraddress2">具体地址</label>
																		<div class="col-md-4">
																			<textarea class="form-control" id="receiveraddress2"
																				name="receiveraddress2">具体地址</textarea>
																		</div>
																	</div>

																	<!-- Button -->
																	<div class="form-group">
																		<label class="col-md-3 control-label" for="">添加</label>
																		<div class="col-md-4">
																			<button id="" name="" class="btn btn-primary">添加</button>
																		</div>
																	</div>

																</fieldset>
															</form>
														</div>

													</div>
												</div>
											</div> <a href="listUserReceiver/${u.userid}"
											class="btn btn-info  btn-sm" role="button">查看</a>
										</td>
										<td><a href="modifyBook/${u.userid}"
											class="btn btn-warning  btn-sm" role="button">修改</a> <a
											href="deleteBookById/${u.userid}"
											class="btn btn-danger  btn-sm" role="button">删除</a></td>
									</tr>
								</c:forEach>
							</c:if>
						</tbody>
					</table>
				</div>
				<div class="panel-footer">
					<a href="##" class="btn btn-primary  btn-xs" role="button">查看详情</a>
				</div>
			</div>
			<div class="panel panel-info">
				<div class="panel-heading">分类列表</div>
				<div class="panel-body">
				<div>
					<!-- Select Basic -->
					<!-- 每次都要多次的查询数据库，耗时，先暂时关闭         data-url="classifyJson"    -->
					<div class="form-group" id="receiveraddress" >
						<label class="col-md-3 control-label" for="receiveraddress">图书分类</label>
						<div class="col-md-3">
							<select id="one " name="one" class="form-control one cxselect "
								disabled="disabled">
								<option>省份</option>
							</select>
						</div>
						<div class="col-md-3">
							<select id="two" name="two" class="form-control two cxselect "
								disabled="disabled">
								<option>省份</option>
							</select>
						</div>
						<div class="col-md-3">
							<select id="three " name="three"
								class="form-control three cxselect " disabled="disabled">
								<option>省份</option>
							</select>
						</div>
					</div>
					</div>
					<br>
					<br>
					<div>
					<div class="zTreeDemoBackground left">
						<ul id="treeDemo" class="ztree"></ul>
					</div>
					</div>
				</div>
				<div class="panel-footer">还不完善！还要修改</div>
			</div>
		</div>
	</div>
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery.validate.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery.cxselect.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery.cxselect.min.js"></script>
	 <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.ztree.core-3.5.js"></script>
	    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/json2.js"></script>
	
	<script>
	var setting = {
			data: {
				simpleData: {
					enable: true
				}
			}
		};
        var datajson1=[{"id":1,"pId":0,"name":"童书"},{"id":2,"pId":0,"name":"教育"},{"id":3,"pId":0,"name":"生活"},{"id":4,"pId":0,"name":"人文"},{"id":5,"pId":0,"name":"科普"},{"id":6,"pId":0,"name":"外籍"},{"id":85,"pId":1,"name":"0-2岁"},{"id":86,"pId":1,"name":"3-6岁"},{"id":87,"pId":1,"name":"7-10岁"},{"id":88,"pId":1,"name":"11-14岁"},{"id":89,"pId":1,"name":"精装图画书"},{"id":90,"pId":1,"name":"少儿期刊"},{"id":91,"pId":2,"name":"教材"},{"id":92,"pId":2,"name":"中小学教辅"},{"id":94,"pId":2,"name":"考试"},{"id":95,"pId":91,"name":"研究生/本科"},{"id":96,"pId":91,"name":"高职高专"},{"id":97,"pId":91,"name":"成人教育"},{"id":98,"pId":91,"name":"职业培训"},{"id":99,"pId":94,"name":"学历考试"},{"id":100,"pId":94,"name":"公职"},{"id":102,"pId":94,"name":"考研"},{"id":103,"pId":94,"name":"公务员"},{"id":104,"pId":3,"name":"烹饪/美食"},{"id":105,"pId":3,"name":"旅游/地图"},{"id":106,"pId":3,"name":"亲子/家教"},{"id":107,"pId":3,"name":"手工/DIY"},{"id":108,"pId":3,"name":"运动"},{"id":109,"pId":3,"name":"美妆"},{"id":110,"pId":104,"name":"家常菜谱"},{"id":111,"pId":104,"name":"烘培甜品"},{"id":112,"pId":104,"name":"餐饮文化"},{"id":113,"pId":105,"name":"国内自助游"},{"id":115,"pId":105,"name":"旅游攻略"},{"id":116,"pId":106,"name":"家教方法"},{"id":117,"pId":106,"name":"素质教育"},{"id":118,"pId":106,"name":"亲子关系"},{"id":119,"pId":108,"name":"田径"},{"id":120,"pId":108,"name":"篮球"},{"id":121,"pId":108,"name":"足球"},{"id":122,"pId":108,"name":"羽毛球"},{"id":123,"pId":109,"name":"化妆指导"},{"id":124,"pId":109,"name":"化妆品推荐"},{"id":125,"pId":107,"name":"纸艺"},{"id":126,"pId":107,"name":"布艺"},{"id":127,"pId":107,"name":"黏土"},{"id":128,"pId":4,"name":"历史"},{"id":129,"pId":4,"name":"文化"},{"id":130,"pId":4,"name":"政治/军事"},{"id":131,"pId":4,"name":"法律"},{"id":132,"pId":128,"name":"历史普及读物"},{"id":133,"pId":128,"name":"中国史"},{"id":134,"pId":128,"name":"世界史"},{"id":135,"pId":129,"name":"中国文化"},{"id":136,"pId":129,"name":"各国文化"},{"id":137,"pId":129,"name":"文化评述"},{"id":138,"pId":130,"name":"中国政治"},{"id":139,"pId":130,"name":"世界政治"},{"id":140,"pId":130,"name":"时事政治"},{"id":141,"pId":130,"name":"军事理论"},{"id":142,"pId":130,"name":"军事史"},{"id":143,"pId":131,"name":"民法"},{"id":144,"pId":131,"name":"刑法"},{"id":145,"pId":131,"name":"经济法"},{"id":146,"pId":131,"name":"法律法规"},{"id":149,"pId":5,"name":"百科知识"},{"id":151,"pId":5,"name":"宇宙知识"},{"id":152,"pId":5,"name":"科学世界"},{"id":154,"pId":6,"name":"传记Biograp"},{"id":155,"pId":6,"name":"艺术 Art"},{"id":156,"pId":6,"name":"摄影 Photogr"},{"id":157,"pId":6,"name":"摄影 Photogr"},{"id":158,"pId":2,"name":"计算机"}];
		//alert("datajson1的类型"+typeof(datajson1));
		//alert(datajson);
		
        
        $(document).ready(function(){
			$.fn.zTree.init($("#treeDemo"), setting, datajson1);
		});
	
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