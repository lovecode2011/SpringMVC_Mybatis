<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>我的购物车-树塾书署</title>
<meta charset="utf-8">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/images/Book.ico">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/css-self/navbar.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/css-self/container.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/css-self/ad-state.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/css-self/shoppingcart.css">
</head>
<style type="text/css">
.s-container {
	width: 960px;
	margin: 25px auto;
	padding: 0;
	background-color: #ffffff;
	z-index: -1;
}
</style>


<body style="margin: auto;">
	<ul id="nav">
		<c:if test="${user.username!=null}">
			<li class="nav-left"><a href="#" style="text-align: center;">${user.username}</a></li>
			<li class="nav-left"><a
				href="${pageContext.request.contextPath }/userLogout"
				style="text-align: center;">注销</a></li>
		</c:if>
		<c:if test="${user.username==null}">
			<li class="nav-left"><a
				href="${pageContext.request.contextPath }/login"
				style="text-align: center;">登录</a></li>
			<li class="nav-left"><a
				href="${pageContext.request.contextPath }/register"
				style="text-align: center;">注册</a></li>
		</c:if>
		<li class="nav-right"><a href="#" style="text-align: center;">联系我们</a></li>
		<li class="nav-right"><a href="#" style="text-align: center;">积分商城</a></li>
		<li class="nav-right"><a href="#" style="text-align: center;">我的订单</a></li>
		<li class="nav-right"><a href="#" style="margin-left: 1em;">个人中心</a>
			<ul>
				<li class="nav-self" style="background-color: #6e6e6e;"><a
					href="#">我的收藏</a></li>
				<li class="nav-self" style="background-color: #6e6e6e;"><a
					href="#">我的积分</a></li>
				<li class="nav-self"
					style="border-bottom: none; background-color: #6e6e6e;"><a
					href="#">收货地址</a></li>
			</ul></li>
		<li class="nav-right"><a href="#" style="margin-left: 1.5em;">购物车</a>
			<a href="#" class="nav-cart-logo"><em>${fn:length(cartwapperlist)}</em></a>
			<div class="nav-cart-content">
				<ul style="box-shadow: 1px 1px 10px #6e6e6e;">
					<li class="nav-cart-item">
						<ul id="nav-cart-list">
							<c:if test="${cartwapperlist!=null }">
								<c:forEach var="cwl" items="${cartwapperlist}"
									varStatus="cwllist">
									<li class="nav-cart">
										<div class="nav-cart-img">
											<a href="#"><img
												src="http://wwhahapic.tunnel.mobi/${cwl.picture }"
												width="54px" height="54px"></a>
										</div>
										<div class="nav-cart-name">
											<a href="#" style="color: #6e6e6e;">${cwl.bookname }</a>
										</div> <!--  这个地方的删除，貌似可以去掉。。等以后商量一下再说--->
										<div class="nav-cart-action">
											<span>${cwl.price }</span>×<span>${cwl.booknum }</span> <a
												href="#" style="color: #6e6e6e; text-align: right;">删除</a>
										</div>

									</li>
								</c:forEach>
							</c:if>
							<c:if test="${cartwapperlist==null }">
								<c:forEach var="cwl" items="${cartwapperlist}"
									varStatus="cwllist">
									<li class="nav-cart">
										<div class="nav-cart-img">
											<a href="#"><img
												src="http://wwhahapic.tunnel.mobi/${cwl.picture }"
												width="54px" height="54px"></a>
										</div>
										<div class="nav-cart-name">
											<a href="#" style="color: #6e6e6e;">购物车为空！</a>
										</div>
										<div class="nav-cart-action">
											<span>${cwl.price }</span>×<span>${cwl.booknum }</span> <a
												href="#" style="color: #6e6e6e; text-align: right;">删除</a>
										</div>
									</li>
								</c:forEach>
							</c:if>
						</ul>
					</li>
					<li class="nav-cart nav-cart-welcome" style=""><span
						id="nav-cart-title">欢迎使用购物车</span><a href="#" id="nav-cart-turn"
						style="color: #6e6e6e;">去购物车</a></li>
				</ul>
			</div></li>
	</ul>
	<!--导航条-->

	<div class="container s-container">
		<div class="c-head">
			<div class="logo">
				<a href="${pageContext.request.contextPath }"> <img
					src="${pageContext.request.contextPath }/images/logo长.png">
				</a>
			</div>
			<div class="search" style="">
				<form class="navbar-form navbar-left" role="search">
					<div class="form-group" style="width: 174px; height: 100%;">
						<input type="text" class="form-control" placeholder="Search"
							style="display: block; width: 174px; height: 100%;">
					</div>
					<button type="submit" class="btn btn-default m-btn"
						style="width: 54px; height: 100%; float: right; margin-left: 7px;">搜索</button>
				</form>
			</div>
		</div>
	</div>
	<form action="addorderToOrder" id="form" method="POST">
		<!--内容头部-->
		<div class="cart">
			<div class="cart-filter-bar">
				<p>全部商品</p>
			</div>

			<c:if test="${cartwapperlist!=null }">
				<div class="cart-wrap">
					<!--购物车外框（box）-->
					<div class="my-cart">
						<!--购物车开始-->
						<div class="cart-main">
							<!--购物框开始-->
							<div class="cart-head">
								<!--购物框头部-->
								<div class="all-checkbox">
									<div class="checkbox">
										<input type="checkbox" name="item-allcheck" class="allselect"
											value="All">
									</div>
									<div class="check-name ">全选</div>
								</div>
								<div class="goods">商品</div>
								<div class="price">单价(元)</div>
								<div class="quantity">数量</div>
								<div class="sum">小计(元)</div>
								<div class="action">操作</div>
							</div>

							<c:forEach var="cwl" items="${cartwapperlist}"
								varStatus="cwllist">
								<div class="cart-list">
									<!--购物车列表开始-->
									<div class="item-list">
										<!--单品列表开始-->
										<div class="item-item">
											<!--单品开始-->
											<div class="item-checkbox">
												<input type="checkbox" name="Cart_Id" class="itemcheck" value="${cwl.cartid }"> 
												<input type="hidden" id="userid" value="${userid}"> 
												<input type="hidden" class="bookid" value="${cwl.bookid}">
											</div>
											<div class="img-name">
												<div class="item-img">
													<a href="${pageContext.request.contextPath}/book/${cwl.bookid}">
													  <img src="http://wwhahapic.tunnel.mobi/${cwl.picture}" width="54px" height="54px">
													</a>
												</div>
												<div class="item-name">
													<a href="${pageContext.request.contextPath}/book/${cwl.bookid}">${cwl.bookname }</a>
												</div>
											</div>
											<div class="item-price">¥${cwl.price }</div>
											<div class="spinner-wrap">
												<input type="text" class="buy_num" id="buynum" value="${cwl.booknum}">

											</div>
											<div class="item-sum">
												<span>¥</span><span class="amount">${cwl.amount }</span>
											</div>
											<div class="item-action">
												<a href="#" class="addCollect" value="${cwl.cartid }">收藏</a></br>
												<a href="#" class="removeCart">删除</a>
											</div>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</c:if>
		</div>
		<div class="cart-float-bar-wrap" id="fixed">
			<div class="cart-float-bar">
				<!--总计结算开始-->
				<div class="select-all">
					<div class="checkbox settle-checkbox">
						<input type="checkbox" name="item-allcheck" class="allselect"
							value="All">
					</div>
					<div class="check-name settle-check-name">全选</div>
				</div>
				<div class="operation">
					<a href="#" class="remove-batch">删除</a> <a href="#"
						class="follow-batch">收藏</a>
				</div>
				<div class="item-sum-num">
					已选择<span id="num-item">0</span>件商品
				</div>
				<div class="price-sum">
					总价（不包括运费）： <span id="num-price"></span>
				</div>
				<div class="points">
					积分： <span id="num-points"></span>
				</div>
				<div class="settle">
				
				
					<a href="#"  role="button"><img
						src="${pageContext.request.contextPath }/images/settle-q.png" id="doform" ></a>
					
					<!--<input type="button" value="结算">-->
				</div>
			</div>
		</div>
		</div>
		</div>
		<!--主要内容-->
	</form>
	<div class="state">
		<div class="ads-bg">
			<div class="ads">
				<div class="ads-img" style="margin-left: -70px;">
					<img src="${pageContext.request.contextPath }/images/ad-img-1.png">
				</div>
				<div class="ads-img">
					<img src="${pageContext.request.contextPath }/images/ad-img-2.png">
				</div>
				<div class="ads-img">
					<img src="${pageContext.request.contextPath }/images/ad-img-3.png">
				</div>
				<div class="ads-img" style="margin-right: -70px;">
					<img src="${pageContext.request.contextPath }/images/ad-img-4.png">
				</div>
			</div>
		</div>
		<div class="copyright-bg">
			<div class="copyright">
				<span>Copyright &copy 2015 树塾书署 All Rights Reserved.
					备案号：湘ICP备1201314号-9</span>
			</div>
		</div>
	</div>

	<div class="go-top dn" id="go-top">
		<div class="dn"></div>
		<a href="javascript:;" class="go"></a>
	</div>
</body>

<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath }/js/js-self/jquery.spinner.js"></script>
<script
	src="${pageContext.request.contextPath }/js/js-self/go-top-else.js"></script>
<script src="${pageContext.request.contextPath }/js/js-self/scroll.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		//链接的检验：检验用户是否登陆
	    $("#nav-cart-turn").click(function(){
	    	var userid=$("input[name='userid']").val();
	   	 	if(userid ==""){
	   	 		alert("请先登录");
	   	 	}else{
	   	 	$(this).attr("href"," ${pageContext.request.contextPath}/${user.userid }/shoppingCart");
	   	 	}
	    });
	    $("#myOrder").click(function(){
	    	var userid=$("input[name='userid']").val();
	   	 	if(userid ==""){
	   	 		alert("请先登录");
	   	 	}else{
	   	 	$(this).attr("href","${pageContext.request.contextPath}/${user.userid}/personOrder");
	   	 	}
	    });
	    $("#myInfo").click(function(){
	    	var userid=$("input[name='userid']").val();
	   	 	if(userid ==""){
	   	 		alert("请先登录");
	   	 	}else{
	   	 	$(this).attr("href","${pageContext.request.contextPath}/${user.userid}/info");
	   	 	}
	    	
	    });
		
		$("#doform").click(function(){
		//	alert("点击结算");
			var booknum =parseInt($("#num-item").text());
			if(booknum>0){
				$("#form").submit();
			}
			else{
				alert("请选择其中的一本书");
			}
			
			
		});
		$(".allselect").click(function() {
			//alert("什么鬼");
			//	alert($(this).attr("checked"));
			if ($(this).attr("checked")) {
				$(".allselect").attr("checked", false);
				$("input[name='Cart_Id']").each(function() {
					$(this).attr("checked", false);
				});
				//	alert("全部不选中");
				GetCount();
			} else if (!$(this).attr("checked")) {
				$(".allselect").attr("checked", true);
				$("input[name='Cart_Id']").each(function() {
					$(this).attr("checked", true);
				});
				//	alert("全部选中");
				GetCount();
			}
		});
		$("input[name='Cart_Id']").click(function() {
			if ($(this).attr("checked")) {
				$(this).attr("checked", false);
				//	alert("不选中");
				GetCount();
			} else if (!$(this).attr("checked")) {
				$(this).attr("checked", true);
				//	alert("选中");
				GetCount();
			}
		});

		$(".addCollect").click(function() {
			//alert("点击了收藏");
			//获取当前购物车项的cartid
			var userid = $(this).parent().parent().find("#userid").val();
			var bookid = $(this).parent().parent().find(".bookid").val();

			if (userid == "") {
				alert("请先登录");
			} else {
				//alert(userid);
				//alert(bookid);

				var url = "${pageContext.request.contextPath}/addCollect";
				var args = {
					"bookid" : bookid,
					"userid" : userid
				};
				$.post(url, args, function(data) {
					alert(data);
				})
			}

		});
	});

	$(".removeCart").click(function() {
		//alert("点击了删除")
		var cartid = $(this).parent().parent().find(".itemcheck").val();
		var userid = $(this).parent().parent().find("#userid").val();
		var bookid = $(this).parent().parent().find(".bookid").val();

		if (userid == "") {
			alert("请先登录");
		} else {
			//alert(cartid);
			//alert(userid);
			//alert(bookid);
			var url = "${pageContext.request.contextPath}/removeCart";
			var args = {
				"cartid" : cartid
			};
			$.post(url, args, function(data) {
				alert(data);
				window.location.href = './shoppingCart';

			})
		}

	});
	//计算总价和总数量
	function GetCount() {
		var conts = 0;
		var numitem = 0;
		$(".item-list input[name='Cart_Id']").each(
				function() {
					if ($(this).attr("checked")) {
						for (var i = 0; i < $(this).length; i++) {
							conts += parseFloat($(this).parents(".item-item")
									.find(".amount").text());
							numitem += 1;
						}
					}
				});
		//alert(numitem);
		//alert(conts.toFixed(2));
		$("#num-item").html(numitem);
		$("#num-price").text((conts).toFixed(2));
		$("#num-points").text((conts) * 10);
		$("#num-price").css("color", "red");
		$("#num-points").css("color", "red");
	}
</script>
</html>