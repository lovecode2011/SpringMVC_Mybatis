<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>树塾书署</title>
<meta charset="utf-8">
<link rel="shortcut icon" href="../images/Book.ico">
<link rel="stylesheet" type="text/css" href="../css/css-self/navbar.css">
<link rel="stylesheet" type="text/css" href="../css/css-self/recomd.css">
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="../css/css-self/container.css">
<link rel="stylesheet" type="text/css"
	href="../css/css-self/ad-state.css">
<link rel="stylesheet" type="text/css" href="../css/book_xy.css">
</head>

<style type="text/css">
.s-container {
	width: 960px;
	margin: 25px auto;
	padding: 0;
	background-color: #ffffff;
	z-index: -1;
}

.carousel-control {
	color: #ccc;
	font-size: 50px;
	top: 40%;
	text-shadow: none;
}

.dropdown-submenu>a:after {
	display: none;
}
</style>

<body style="margin: auto;">
	<ul id="nav">
		<c:if test="${user.username!=null}">
			<li class="nav-left"><a href="#" style="text-align: center;">${user.username}</a></li>
			
			<li class="nav-left"><a href="${pageContext.request.contextPath }/userLogout"
				style="text-align: center;">注销</a></li>
		</c:if>
		<c:if test="${user.username==null}">
			<li class="nav-left"><a href="${pageContext.request.contextPath }/login" style="text-align: center;">登录</a></li>
			<li class="nav-left"><a href="${pageContext.request.contextPath }/register"
				style="text-align: center;">注册</a></li>
		</c:if>
		<li class="nav-right"><a href="#" style="text-align: center;">联系我们</a></li>
		<li class="nav-right"><a href="#" style="text-align: center;">积分商城</a></li>
		<li class="nav-right"><a href="#" style="text-align: center;">我的订单</a></li>
		<li class="nav-right"><a href="${user.userid }/info"
			style="margin-left: 1em;">个人中心</a>
			<ul>
				<li class="nav-self"><a href="#">我的收藏</a></li>
				<li class="nav-self"><a href="#">我的积分</a></li>
				<li class="nav-self"><a href="#">收货地址</a></li>
			</ul></li>
		<li class="nav-right"><a href="#" style="margin-left: 1.5em;">购物车</a>
			<ul>
				<li class="nav-cart"><a href="#">货物1</a></li>
			</ul></li>
	</ul>
	<div class="container">
		<!--页面主体-->
		<div class="row head">
			<div class="col-lg-12 hasMarginV">
			<a href="${pageContext.request.contextPath}/">	<img id="headerLogo" class="col-lg-3" src="../images/logo_xy.png"
					alt="页面logo图片-树塾书署"></a>
			</div>
		</div>
		<ol class="breadcrumb">
			<!--面包屑导航-->
			<li><a href="${ pageContext.request.contextPath}">全部</a></li>
		<c:forEach var="cl" items="${classlist}" varStatus="clist">
			
			<li><a href="${ pageContext.request.contextPath}/classify/${cl.classid }">${cl.classname}</a></li>
			</c:forEach>
			
		</ol>
		<div class="hasMargin">
			<!--图书详细信息头-->
			<table>
				<tr>
					<td><img class="bookPic"
						src="http://localhost:88/${book.picture }"></td>
					<td>
						<div class="bookDetail">
							<ul>
								<li>
									<h2>${book.bookname}</h2>
								</li>
								<li>
									<p>作者:&nbsp;&nbsp;${book.author }</p>
								</li>
								<li>
									<p>${book.publish }</p>
								</li>
								<li>
									<p>${book.publishdate }&nbsp;&nbsp;出版</p>
								</li>
								<li>
									<p>ISBN:&nbsp;&nbsp;${book.isbn}</p>
								</li>
								<li>
									<h3 class="red">¥:${book.price}</h3>
								</li>
								<li>
									<p>库存:&nbsp;&nbsp;${book.stock }&nbsp;&nbsp;本</p>
								</li>
							</ul>

							<div class="buy_box">
								<!--购买/收藏区-->
								<div class="spinner">
									<input type="text" class="buy_num" name="bookNum">
									<input type="hidden" name ="userid" value="${user.userid}"/>
									<input type="hidden" name ="username" value="${user.username}"/>
									<input type="hidden" name ="bookid" value="${book.bookid}"/>
									<input type="hidden" name ="bookname" value="${book.bookname}"/>
								</div>
								<button type="submit" class="btn btn-md btn-success"id="addCart">购买</button>
									<c:if test="${!valiCollect}">
									<button type="submit" class="btn btn-md btn-success" id="addCollect">收藏</button>
									</c:if>
									<c:if test="${valiCollect}">
									<button type="submit" class="btn btn-md btn-success" id="romoveCollect">已收藏</button>
									</c:if>
									
								
							</div>
					</td>
				</tr>
			</table>
		</div>
		<!--图书详细信息尾-->
		<div class="panel panel-success">
			<div class="panel-heading">商品信息</div>
			<div class="panel-body">
				<span>${book.intro}</span>
			</div>
		</div>

		<div class="panel panel-success">
			<div class="panel-heading">用户评论</div>
			<div class="panel-body">
				<table class="table">
				<c:if test="${ empty commentlist}">
				<tr class="comment">
						<td>
							<p class="person">
								用户名
								<time>2015-10-01</time>
							</p>
							<p>暂时没有评论，等待你的评论。</p>
						</td>
					</tr>
				</c:if>
				<c:if test="${!empty commentlist }">
				<c:forEach var="col" items="${commentlist}" varStatus="colist">
				<tr class="comment">
						<td>
							<p class="person">
								${col.username}
								<time>${col.commenttime}</time>
							</p>
							<p>${col.commentcontext }</p>
						</td>
					</tr>
				
				</c:forEach>
				</c:if>
				</table>
			</div>
		</div>
	</div>
	<div class="state">
		<div class="ads-bg">
			<div class="ads">
				<div class="ads-img" style="margin-left: -70px;">
					<img src="../images/ad-img-1.png">
				</div>
				<div class="ads-img">
					<img src="../images/ad-img-2.png">
				</div>
				<div class="ads-img">
					<img src="../images/ad-img-3.png">
				</div>
				<div class="ads-img" style="margin-right: -70px;">
					<img src="../images/ad-img-4.png">
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
	<script src="../js/jquery.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/nav.js"></script>
	<script src="../js/jquery.spinner.js"></script>
	<script type="text/javascript">
		$('.buy_num').spinner({});
	</script>



</body>

<script type="text/javascript">
	
	$("#romoveCollect").click(function(){
		alert("已收藏，取消收藏");
		var userid=$("input[name='userid']").val();
		if(userid!=""){
			var bookid=$("input[name='bookid']").val();
			
			var url = "${pageContext.request.contextPath}/romoveCollect";
			
			var args={"userid":userid,
					  "bookid":bookid,
			};
			$.post(url,args,function(data){
				alert(data);
				$("#addCart").next().remove();
				$("#addCart").after("<button type='submit' class='btn btn-md btn-success' id='addCollect'>收藏</button>");
			});
		}
		if(userid==""){
			alert("请先登录");
		}
		
		
	})
	$("#addCart").click(function(){
		alert("点击了购买");
		var userid=$("input[name='userid']").val();
		if(userid!=""){
			var username=$("input[name='username']").val();
			var bookid=$("input[name='bookid']").val();
			var bookname=$("input[name='bookname']").val();
			var bookNum=$("input[name='bookNum']").val();
			
			var url = "${pageContext.request.contextPath}/addCart";
			
			var args={"userid":userid,
					  "username":username,
					  "bookid":bookid,
					  "bookname":bookname,
					  "bookNum":bookNum
			};
			$.post(url,args,function(data){
				alert(data);
				
			});
			
		}if(userid==""){
			alert("请先登录");
		}
		
		
		
	});
	$("#addCollect").click(function(){
		alert("点击了收藏");
		var userid=$("input[name='userid']").val();
		if(userid!=""){
			var bookid=$("input[name='bookid']").val();
			
			var url = "${pageContext.request.contextPath}/addCollect";
			var args={"userid":userid,
					  "bookid":bookid,
			};
			$.post(url,args,function(data){
				alert(data);
				$("#addCart").next().remove();
				$("#addCart").after("<button type='submit' class='btn btn-md btn-success' id='romoveCollect'>已收藏</button>");
			});
		}
		if(userid ==""){
			alert("请先登录");
		}
		
		
	});

	$('.dropdown').mouseover(function() {
		$(this).addClass('open');
	}).mouseout(function() {
		$(this).removeClass('open');
	});

	$("a,button").focus(function() {
		this.blur()
	});
	$(function() {
		$(window).on('scroll',function() {
							var st = $(document).scrollTop();
							if (st > 0) {
								if ($('#main-container').length != 0) {
									var w = $(window).width(), mw = $(
											'#main-container').width();
									if ((w - mw) / 2 > 70)
										$('#go-top').css({
											'left' : (w - mw) / 2 + mw + 20
										});
									else {
										$('#go-top').css({
											'left' : 'auto'
										});
									}
								}
								$('#go-top').fadeIn(function() {
									$(this).removeClass('dn');
								});
							} else {
								$('#go-top').fadeOut(function() {
									$(this).addClass('dn');
								});
							}
						});
		$('#go-top .go').on('click', function() {
			$('html,body').animate({
				'scrollTop' : 0
			}, 500);
		});

		$('#go-top .uc-2vm').hover(function() {
			$('#go-top .uc-2vm-pop').removeClass('dn');
		}, function() {
			$('#go-top .uc-2vm-pop').addClass('dn');
		});
	});
</script>
</html>