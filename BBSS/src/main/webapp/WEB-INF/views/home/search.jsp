<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
	<title>树塾书署</title>
	<meta charset="utf-8">
	<link rel="shortcut icon" href="images/Book.ico">
	<link rel="stylesheet" type="text/css" href="css/nav.css">
	<link rel="stylesheet" type="text/css" href="css/css-self/navbar.css">
	<link rel="stylesheet" type="text/css" href="css/css-self/recomd.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/css-self/container.css">
	<link rel="stylesheet" type="text/css" href="css/css-self/ad-state.css">
	<link rel="stylesheet" type="text/css" href="css/bookClass.css">
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

	.dropdown-submenu > a:after {
		display: none;
	}
	</style>

<body style="margin: auto;">
	<ul id="nav">
		<c:if test="${user.username!=null}">
		<li class="nav-left"><a href="#" style="text-align:center;">${user.username}</a></li>
		<li class="nav-left"><a href="userLogout" style="text-align:center;">注销</a></li>
		</c:if>
		<c:if test="${user.username==null}">
		<li class="nav-left"><a href="login" style="text-align:center;">登录</a></li>
		<li class="nav-left"><a href="register" style="text-align:center;">注册</a></li>
		</c:if>
		<li class="nav-right"><a href="#" style="text-align:center;">联系我们</a></li>
		<li class="nav-right"><a href="#" style="text-align:center;">积分商城</a></li>
		<li class="nav-right"><a href="${user.userid}/personOrder" style="text-align:center;">我的订单</a></li>
		<li class="nav-right"><a href="${user.userid}/info" style="margin-left:1em;">个人中心</a>
			<ul>
				<li class="nav-self" style="background-color:#6e6e6e;"><a href="#">我的收藏</a></li>
				<li class="nav-self" style="background-color:#6e6e6e;"><a href="#">我的积分</a></li>
				<li class="nav-self" style="border-bottom:none;background-color:#6e6e6e;"><a href="#">收货地址</a></li>
			</ul>
		</li>
		<li class="nav-right">
			<a href="#" style="margin-left:1.5em;">购物车</a>
			<a href="#" class="nav-cart-logo"><em>${fn:length(cartwapperlist)}</em></a>
			<div class="nav-cart-content">
				<ul style="box-shadow: 1px 1px 10px #6e6e6e;">
					<li class="nav-cart-item">
						<ul id="nav-cart-list">
						
						<c:if test="${cartwapperlist!=null }">
						<c:forEach var="cwl" items="${cartwapperlist}" varStatus="cwllist">
						<li class="nav-cart">
								<div class="nav-cart-img"><a href="#"><img src="http://wwhahapic.tunnel.mobi/${cwl.picture }" width="54px" height="54px"></a></div>
								<div class="nav-cart-name"><a href="#" style="color:#6e6e6e;">${cwl.bookname }</a></div>
								<div class="nav-cart-action">
									<span>${cwl.price }</span>×<span>${cwl.booknum }</span>
									<a href="#"  style="color:#6e6e6e;text-align:right;">删除</a>
								</div>
							</li>
						</c:forEach>
						</c:if>
						<c:if test="${cartwapperlist==null }">
								<div class="nav-cart-name"><a href="#" style="color:#6e6e6e;">购物车为空！</a></div>
						</c:if>
						</ul>
					</li>
					<li class="nav-cart nav-cart-welcome" style=""><span id="nav-cart-title">欢迎使用购物车</span><a href="${user.userid }/shoppingCart" id="nav-cart-turn" style="color:#6e6e6e;">去购物车</a></li>
				</ul>
			</div>
		</li>
	</ul>
	<!--导航条-->

	<!--页面主体开始 -->
		<div class="container"><!--除顶部以外整个容器-->
 		<div class="row head">
            <div class="col-lg-12">
              <a href="${pageContext.request.contextPath }"><img id="headerLogo" class="col-lg-3"src="images/logo长.png" alt="页面logo图片-树塾书署"></a>
				<div class="col-lg-3">
                </div>
            </div>
        </div>
       
       
       	<c:forEach var="bl" items="${bookList }">
		<div class="row bookshow">
            <div class="col-lg-12">
				<img class="col-lg-2" src="http://wwhahapic.tunnel.mobi/${bl.picture}" alt="图书分类查看结果图书图片">
				<div class="col-lg-7">
					<a href="${pageContext.request.contextPath}/book/${bl.bookid}">${bl.bookname }</a>
				<!--	
					暂时没有评论。暂时不显示
				<p><a href="#">123</a>条评论</p>  
				-->
					<p>作者:<span>${bl.author }</span></p>
					<p>出版社:<span>${bl.publish }</span></p>
					<p>价格:<span>${bl.price }</span></p>				
				</div>
				<div class="col-lg-3">
					<div class="center bookclassButton">
						<input type="hidden" name ="bookid" value="${bl.bookid }"> 
						<input type="hidden" name ="userid" value="${user.userid }">
						<a href="#"><button type="button" class="btn btn-lg btn-success collectbook" >收藏</button></a><!--alert("收藏成功")-->
					</div>
					<div class="center bookclassButton">
						<a href="${pageContext.request.contextPath }/book/${bl.bookid}"><button type="button" class="btn btn-lg btn-success">购买</button></a><!--应转入该图书图书详情页面-->
					</div>						
				</div>
			</div>
		</div>
		</c:forEach>
	<!-- 页面主体结束-->

	<div class="state">
		<div class="ads-bg">
			<div class="ads">
				<div class="ads-img" style="margin-left:-70px;"><img src="images/ad-img-1.png"></div>
				<div class="ads-img"><img src="images/ad-img-2.png"></div>
				<div class="ads-img"><img src="images/ad-img-3.png"></div>
				<div class="ads-img" style="margin-right:-70px;"><img src="images/ad-img-4.png"></div>
			</div>
		</div>
		<div class="copyright-bg">
			<div class="copyright">
				<span>Copyright &copy 2015 树塾书署 All Rights Reserved. 备案号：湘ICP备1201314号-9</span>
			</div>
		</div>
	</div>

	<div class="go-top dn" id="go-top">
		<div class="dn"></div>
    	<a href="javascript:;" class="go"></a>
	</div>

</body>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
     <script src="js/nav.js"></script>
    <script type="text/javascript">
    
    $(".collectbook").click(function(){
    	
    	alert("点击了收藏");
    	var bookid=$(this).parent().prev().prev().val();
    	var userid=$(this).parent().prev().val();
    	if(userid==""){
    		alert("请先登录");
    	}else{
    		var url = "${pageContext.request.contextPath}/addCollect";
    		var args={"bookid":bookid,"userid":userid};
    		$.post(url, args, function(data) {
				alert(data);
			})
    	}
    	
    });
    	$('.dropdown').mouseover(function() {
    		$(this).addClass('open');
    	}).mouseout(function() {        
    		$(this).removeClass('open');    
    	});

    	$("a,button").focus(function(){this.blur()});
		$(function() {
			$(window).on('scroll',function() {
				var st = $(document).scrollTop();
				if(st>0){
					if($('#main-container').length!=0) {
						var w = $(window).width(),mw = $('#main-container').width();
						if((w-mw)/2>70)
							$('#go-top').css({'left':(w-mw)/2+mw+20});
						else {
							$('#go-top').css({'left':'auto'});
						}
					}
					$('#go-top').fadeIn(function() {
						$(this).removeClass('dn');
					});
				}
				else{
					$('#go-top').fadeOut(function() {
						$(this).addClass('dn');
					});
				}	
			});
			$('#go-top .go').on('click',function() {
				$('html,body').animate({'scrollTop':0},500);
			});

			$('#go-top .uc-2vm').hover(function() {
				$('#go-top .uc-2vm-pop').removeClass('dn');
			},function() {
				$('#go-top .uc-2vm-pop').addClass('dn');
			});
		});
    </script>
</html>