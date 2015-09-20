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


																	<!-- Text input-->
																	<div class="form-group">
																		<label class="col-md-3 control-label"
																			for="receivername">收货人姓名</label>
																		<div class="col-md-4">
																			<input id="userid" type="hidden" name="userid"
																				value="${u.userid }"> <input
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
										<td><a href="modifyBook/${b.bookid}"
											class="btn btn-warning  btn-sm" role="button">修改</a> <a
											href="deleteBookById/${b.bookid}"
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
					<!-- Select Basic -->
					<div class="form-group" id="receiveraddress"
						data-url="classifyJson">
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