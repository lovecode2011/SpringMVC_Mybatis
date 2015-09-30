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
										</div>
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
				<a href="#"> <img
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
									<input type="checkbox" name="item-check"  class ="allselect" value="All">
								</div>
								<div class="check-name ">全选</div>
							</div>
							<div class="goods">商品</div>
							<div class="price">单价(元)</div>
							<div class="quantity">数量</div>
							<div class="sum">小计(元)</div>
							<div class="action">操作</div>
						</div>

						<c:forEach var="cwl" items="${cartwapperlist}" varStatus="cwllist">
							<div class="cart-list">
								<!--购物车列表开始-->
								<div class="item-list">
									<!--单品列表开始-->
									<div class="item-item">
										<!--单品开始-->
										<div class="item-checkbox">
											<input type="checkbox" name="item-check" value="item">
										</div>
										<div class="img-name">
											<div class="item-img">
												<a href="#"><img
													src="http://wwhahapic.tunnel.mobi/${cwl.picture}"
													width="54px" height="54px"></a>
											</div>
											<div class="item-name">
												<a href="#">${cwl.bookname }</a>
											</div>
										</div>
										<div class="item-price">¥${cwl.price }</div>
										<div class="spinner-wrap">
											<input type="text" class="buy_num" value="${cwl.booknum }">
										</div>
										<div class="item-sum">¥${cwl.amount }</div>
										<div class="item-action">
											<a href="#">收藏</a></br> <a href="#">删除</a>
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
					<input type="checkbox" name="item-check" class="allselect" value="All">
				</div>
				<div class="check-name settle-check-name">全选</div>
			</div>
			<div class="operation">
				<a href="#" class="remove-batch">删除</a> <a href="#"
					class="follow-batch">收藏</a>
			</div>
			<div class="item-sum-num">
				已选择<span id="num-item">1</span>件商品
			</div>
			<div class="price-sum">
				总价（不包括运费）：
				<div id="num-price"></div>
			</div>
			<div class="points">
				积分：
				<div id="num-points"></div>
			</div>
			<div class="settle">
				<a href="#"><img
					src="${pageContext.request.contextPath }/images/settle-q.png"></a>
				<!--<input type="button" value="结算">-->
			</div>
		</div>
	</div>
	</div>
	</div>
	<!--主要内容-->

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
$(document).ready(function (){
	$(".allselect").click(function(){
		
		$("input[name='item-check']").each(function(){
			$(this).attr("checked",true);
		});
		alert("全部选中");
	})
	
	
	
	
	
});

</script>


</html>