<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/order.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/nav.css">
<link rel="shortcut icon" href="images/Book.ico" type="image/x-icon" />
<title>订单结算-树塾书署</title>
</head>
<body>
	<header class="top">
		<ul id="menu">

			<c:if test="${user.username!=null}">
				<li class="floatLeft"><a href="#">${user.username}</a></li>
				<li class="floatLeft"><a href="/userLogout">注销</a></li>
			</c:if>
			<c:if test="${user.username==null}">
				<li class="floatLeft"><a href="/login">登录</a></li>
				<li class="floatLeft"><a href="/register">注册</a></li>
			</c:if>
			<li class="folatRight"><a href="#">联系我们</a></li>
			<li class="folatRight"><a href="#">我的订单</a></li>
			<li class="folatRight"><a href="#">个人中心</a>
				<ul>
					<li><a href="#">我的收藏</a></li>
					<li><a href="#">我的积分</a></li>
					<li><a href="#">收货地址簿</a></li>
				</ul></li>
			<li class="folatRight"><a href="shoppingCart.html">购物车</a>
				<ul>
					<li><a href="#">货物1</a></li>
					<li><a href="#">货物2</a></li>
					<li><a href="#">货物3</a></li>
				</ul></li>
		</ul>
	</header>
	<div class="container">
		<div class="row head">
			<div class="col-lg-12">
				<img id="headerLogo" class="col-lg-3"
					src="<%=request.getContextPath()%>/images/img/logo.png"
					alt="页面logo图片-树塾书署">
				<button type="button"
					class="btn btn-success col-lg-3 folatRight returnBack">
					<a>返回修改购物车</a>
				</button>
			</div>
		</div>

		<div class="receive panel panel-success">
			<div class="panel-heading">收货相关信息</div>
			<div class="panel-body">
				<ul>
					<li>收货地址
						<button type="button" class="btn btn-success folatRight"
							data-toggle="collapse" data-target="#newReceive">使用新地址</button>
						<div id="newReceive" class="collapse isCenter">
							<%--
							<form class="form-horizontal" id="newAddr" action=" " method="post" data-role="collapsible">
								 --%>

							<div class="control-group">
								<label class="control-label">收&nbsp;&nbsp;货&nbsp;&nbsp;人：</label>


								<input type="hidden" name="userid" id="userid"
									value="${user.userid}" /> <input type="text" tabindex="1"
									id="receivername" name="receivername" required autofocus>
							</div>

							<div class="control-group" id="city_china"
								data-url="<%=request.getContextPath()%>/js/cityData.min.js">
								<label class=" control-label">收货地址&nbsp;&nbsp;:</label> <select
									class="province cxselect placeShow" name="province"
									id="province"></select> <select class="city cxselect placeShow"
									name="city" id="city"></select> <select class="area cxselect"
									disabled="disabled" name="area" id="area"></select>
							</div>
							<div class="control-group">
								<label class="control-label"> 详细地址：</label> <input type="text"
									tabindex="3" id="placeDetail" name="placeDetail" required>
							</div>
							<div class="control-group">
								<label class="control-label"> 邮政编码：</label> <input type="text"
									tabindex="4" id="postalcode" name="postalcode" required>
							</div>
							<div class="control-group">
								<label class="control-label"> 联系方式：</label> <input type="text"
									tabindex="5" id="receivertel" name="receivertel" required>
							</div>
							<div class="control-group">
								<button type="submit" class="btn btn-success configAddr"
									id="addReceiverButton">确认收货地址</button>
								<button type="button" class="btn btn-success cancelAddr"
									data-toggle="collapse" data-target="#newReceive"
									id="closeaddReceiverButton">取消使用新地址</button>
							</div>
						</div>
						<div class="receiver">
							<ul id="addrec">
								<c:forEach var="rl" items="${receiverlist}" varStatus="rlist">
									<li>
										<div>
											<input name="addr" type="radio" value="${rl.receiverid}">
											<span class="receivername">${rl.receivername } </span><span
												class="receiveraddress">${rl.receiveraddress } </span><span
												class="receivertel">${rl.receivertel} </span>
										</div>
									</li>
								</c:forEach>
							</ul>
						</div>
					</li>
					<li>支付方式 <input name="pay" type="radio" value="1"
						checked="checked">在线支付 <input name="pay" type="radio"
						value="0">货到付款
					</li>
				</ul>
			</div>
		</div>

		<div class="shoplist panel panel-success">
			<div class="panel-heading">商品信息</div>
			<div class="panel-body">
				<table class="table">
					<thead>
						<tr>
							<th>商品名称</th>
							<th>所在仓库</th>
							<th>单价</th>
							<th>数量</th>
							<th>小计</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="cl" items="${cartwapperlist}" varStatus="clist">
							<tr>
								<%----------- 
								<input type="hidden"  name="cartid" class="cartid" value="${cl.cartid}"/>
								--%>
								<td>${cl.bookname }</td>
								<td>${cl.repertory }</td>
								<td>${cl.price}</td>
								<td class="booknum">${cl.booknum }</td>
								<td class="amount">${cl.amount }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		
			<div class="wrap">
				<div class="col-lg-9 panel panel-success">
					<div class="panel-body" id="verifyReceiver">
						<h1>确认收货地址</h1>
						<span id="verifyreceivername">收货人1 </span><span
							id="verifyreceiveraddress">收货地址1 </span><span
							id="verifyreceivertel">联系方式1 </span>
					</div>
				</div>
				<div class="col-lg-3 folatRight panel panel-success">
					<div class="panel-body">
						<p>
							商品总计：<span id="orderBookNum"></span>本
						</p>
						<p>运费: 10元</p>
						<p>
							应付总额（含运费）:<span id="orderAmount"></span>
						</p>
						<form action="Addorder" method="post">
						<input type = "hidden" name ="auserid" value =""/>
						<input type = "hidden" name ="areceiverid" value =""/>
						<input type = "hidden" name ="apayway" value =""/>
						<input type = "hidden" name ="aorderAmount" value =""/>
						<input type = "hidden" name ="aorderdate" value =""/>
						
						<button type="submit" class="btn btn-success btn-lg " id="submitOrder">提交订单</button>
						</form>
					</div>
				</div>
			</div>
		
	</div>
	<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/nav.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.cxselect.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/json2.js"></script>


	<script>
		$("#submitOrder").click(function() {
			var receiverid = $.trim($("input[name='addr']:checked").val());
			alert(receiverid);
			var payway = $.trim($("input[name='pay']:checked").val());
			alert("支付方式：" + payway);
			var userid = $("#userid").val();
			alert("用户id:" + userid);
			var orderAmount = $("#orderamount").text();
			alert("总净额：" + orderAmount);
			var cartids = new Array();
			$("input:hidden").filter(".cartid").each(function(element) {
				cartids.push(this.value);
				$("input[name='aorderdate']").after("<input type = 'hidden' name ='cartid' value ='"+this.value+"'/>")
			});
			alert(cartids);
			var orderdate = new Date();
			alert("订单时间毫秒值:" + orderdate.getTime());

			//将收货地址赋值给
			$("input[name='areceiverid']").val(receiverid);
			$("input[name='apayway']").val(payway);
			$("input[name='auserid']").val(userid);
			$("input[name='aorderAmount']").val(orderAmount);
			$("input[name='aorderdate']").val(orderdate);
			alert("点击提交");
			
		
			
			
			var url = "${pageContext.request.contextPath}/Addorder";
			var args = {
				"userid" : userid,
				"receiverid" : receiverid,
				"payway" : payway,
				"ordaertime" : orderdate,
				"sum" : orderAmount,
				"cartids" : cartids,
				"time" : new Date()
			};
			$.post(url, args);
		})
		//将book数量计算并放入订单form中
		var orderBookNum = 0;
		$(".booknum").each(function() {
			orderBookNum += parseFloat($(this).text());
		});
		$("#orderBookNum").append(orderBookNum);

		//将book小计计算并放入订单form中
		var orderAmount = 0;
		$(".amount").each(function() {

			orderAmount += parseFloat($(this).text());
		});
		$("#orderAmount").append(
				orderAmount + "+" + 10 + "=" + "<span id = 'orderamount'>"
						+ (orderAmount + 10) + "</span>");

		///设置第一个地址为默认选中
		$('input:radio:first').attr('checked', 'checked');
		///获取选中的那个radio中的第一个span的文本值：receivername
		var receivername = $
				.trim($("input[name='addr']:checked").next().text());
		///获取选中的那个radio中的第二个span的文本值：receiveraddress

		var receiveraddress = $.trim($("input[name='addr']:checked").next()
				.next().text());
		///获取选中的那个radio中的第三个span的文本值：receivertel
		var receivertel = $.trim($("input[name='addr']:checked").next().next()
				.next().text());

		//将上面获得值分别赋给verifyreceiver中
		$("#verifyreceivername").text(receivername);
		$("#verifyreceiveraddress").text(receiveraddress);
		$("#verifyreceivertel").text(receivertel);

		//当radio的选中变化时
		$('input:radio').click(
				function() {
					//分别获取值
					var receivername = $.trim($("input[name='addr']:checked")
							.next().text());
					var receiveraddress = $
							.trim($("input[name='addr']:checked").next().next()
									.text());
					var receivertel = $.trim($("input[name='addr']:checked")
							.next().next().next().text());
					//分别赋予值
					$("#verifyreceivername").text(receivername);
					$("#verifyreceiveraddress").text(receiveraddress);
					$("#verifyreceivertel").text(receivertel);

				});

		$('#city_china').cxSelect({
			selects : [ 'province', 'city', 'area' ],
		});
		//点击添加收货地址时的异步请求
		$("#addReceiverButton").click(function() {

			var userid = $("#userid").val();
			var receivername = $("#receivername").val();
			var province = $("#province").val();
			var city = $("#city").val();
			var area = $("#area").val();
			var placeDetail = $("#placeDetail").val();
			var postalcode = $("#postalcode").val();
			var receivertel = $("#receivertel").val();

			var url = "${pageContext.request.contextPath}/AddReceiver";
			var args = {
				"userid" : userid,
				"receivername" : receivername,
				"province" : province,
				"province" : province,
				"city" : city,
				"area" : area,
				"placeDetail" : placeDetail,
				"postalcode" : postalcode,
				"receivertel" : receivertel,
				"time" : new Date()
			};
			$.post(url, args, function(data) {
				$("#closeaddReceiverButton").click();
				$("#addrec").append(data);
			})

		});
	</script>
</body>
</html>