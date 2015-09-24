<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title>树塾书署</title>
	<meta charset="utf-8">
	<link rel="shortcut icon" href="<%=request.getContextPath()%>/resources/<%=request.getContextPath()%>/resources/images/Book.ico">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/css-self/navbar.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/css-self/recomd.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/css-self/container.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/css-self/ad-state.css">
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
	</style>

<body style="margin: auto;">
	<ul id="nav">
	
		
		<c:if test="${user.username!=null}">
		<li class="nav-left"><a href="#" style="text-align:center;">${user.username}</a></li>
		</c:if>
		<c:if test="${user.username==null}">
		<li class="nav-left"><a href="login" style="text-align:center;">登录</a></li>
		<li class="nav-left"><a href="register" style="text-align:center;">注册</a></li>
		</c:if>
		<li class="nav-right"><a href="#" style="text-align:center;">联系我们</a></li>
		<li class="nav-right"><a href="#" style="text-align:center;">积分商城</a></li>
		<li class="nav-right"><a href="#" style="text-align:center;">我的订单</a></li>
		<li class="nav-right"><a href="#" style="margin-left:1em;">个人中心</a>
			<ul>
				<li class="nav-self"><a href="#">我的收藏</a></li>
				<li class="nav-self"><a href="#">我的积分</a></li>
				<li class="nav-self"><a href="#">收货地址</a></li>
			</ul>
		</li>
		<li class="nav-right"><a href="#" style="margin-left:1.5em;">购物车</a>
			<ul>
				<li class="nav-cart"><a href="#">货物1</a></li>
			</ul>
		</li>
	</ul>
	<!--导航条-->

	<div class="container s-container">
		<div class="c-head">
			<div class="logo">
				<a href="#">
					<img src="<%=request.getContextPath()%>/resources/images/logo长.png">
				</a>
			</div>
			<div class="search" style="line-height:63px">
				<form class="navbar-form navbar-left" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search" style="display:block;">
					</div>
					<button type="submit" class="btn btn-default m-btn">搜索</button>
				</form>
			</div>
			<div class="mainav" style="line-height:50px">
				<div class="row">
		            
		            <!--目录6-->
		            <div class="dropdown" style="margin-right:30px;">
		                <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-primary ul-1" data-target="#" href="javascript:;" style="outline:none;">童书<span class="caret"></span></a>
		                <ul id="arrow-ul" class="dropdown-menu multi-level ul-2" role="menu" aria-labelledby="dropdownMenu">
		                	<li class="arrow-li"><b class="arrow"></b></li>
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">0-2岁</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">3-6岁</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">7-10岁</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>
		                    
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">11-14岁</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>
		                    
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">少儿期刊</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>
		                    
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">精装图画书</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>
		                </ul>
		            </div>
		            
		            <!--目录5-->
		            <div class="dropdown">
		                <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-primary ul-1" data-target="#" href="javascript:;">科普<span class="caret"></span></a>
		                <ul id="arrow-ul" class="dropdown-menu multi-level ul-2" role="menu" aria-labelledby="dropdownMenu">
		                	<li class="arrow-li"><b class="arrow"></b></li>
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">百科知识</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">宇宙知识</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">科学世界</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>
		                </ul>
		            </div>
		            
		            <!--目录4-->
		            <div class="dropdown">
		                <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-primary ul-1" data-target="#" href="javascript:;">外籍<span class="caret"></span></a>
		                <ul id="arrow-ul" class="dropdown-menu multi-level ul-2" role="menu" aria-labelledby="dropdownMenu">
		                	<li class="arrow-li"><b class="arrow"></b></li>
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">传记Biography</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">艺术Art</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">摄影Photograph</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>
		                </ul>
		            </div>
		            
		            <!--目录3-->
		            <div class="dropdown">
		                <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-primary ul-1" data-target="#" href="javascript:;">生活<span class="caret"></span></a>
		                <ul id="arrow-ul" class="dropdown-menu multi-level ul-2" role="menu" aria-labelledby="dropdownMenu">
		                	<li class="arrow-li"><b class="arrow"></b></li>
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">运动</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">田径</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">篮球</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">足球</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">羽毛球</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">美妆</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">化妆指导</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">化妆品推荐</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">烹饪/美食</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">家常菜谱</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">烘焙甜品</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">餐饮文化</a></li>
		                        </ul>
		                    </li>
		                    
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">旅游/地图</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">国内自助游</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">旅游攻略</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">亲子/家教</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">家教方法</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">素质教育</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">亲子关系</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">手工/DIY</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">纸艺</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">布艺</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">黏土</a></li>
		                        </ul>
		                    </li>
		                </ul>
		            </div>

		            <!--目录2-->
		            <div class="dropdown">
		                <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-primary ul-1" data-target="#" href="javascript:;">人文<span class="caret"></span></a>
		                <ul id="arrow-ul" class="dropdown-menu multi-level ul-2" role="menu" aria-labelledby="dropdownMenu">
		                	<li class="arrow-li"><b class="arrow"></b></li>
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">历史</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">中国史</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">世界史</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">历史普及读物</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">文化</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">中国文化</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">各国文化</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">文化评述</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">法律</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">民法</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">刑法</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">经济法</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">法律法规</a></li>
		                        </ul>
		                    </li>
		                    
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">政治/军事</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">军事史</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">军事理论</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">中国政治</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">世界政治</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">时事政治</a></li>
		                        </ul>
		                    </li>
		                </ul>
		            </div>

		            <!--目录1-->
		            <div class="dropdown">
		                <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-primary ul-1" data-target="#" href="javascript:;">教育<span class="caret"></span></a>
		                <ul id="arrow-ul" class="dropdown-menu multi-level ul-2" role="menu" aria-labelledby="dropdownMenu">
		                	<li class="arrow-li"><b class="arrow"></b></li>
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">教材</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">职业培训</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">高职高专</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">成人教育</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">研究生/本科</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">考试</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">公职</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">考研</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">公务员</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">学历考试</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">计算机</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>
		                    
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">中小学教辅</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">待添加</a></li>
		                        </ul>
		                    </li>
		                </ul>
		            </div>
        		</div>
			</div>
		</div>
		<!--内容头部-->

		<div class="imagecoll">
			<div class="imgbox">
				<div id="myCarousel" class="carousel slide">
 					<ol class="carousel-indicators">
    					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    					<li data-target="#myCarousel" data-slide-to="1"></li>
    					<li data-target="#myCarousel" data-slide-to="2"></li>
  					</ol>
  					<!-- Carousel items -->
  					<div class="carousel-inner">
    					<div class="active item">
    						<a href="#"><img src="<%=request.getContextPath()%>/resources/images/test1.jpg"></a>
    					</div>
    					<div class="item"><a href="#"><img src="<%=request.getContextPath()%>/resources/images/test2.jpg"></a></div>
    					<div class="item"><a href="#"><img src="<%=request.getContextPath()%>/resources/images/test3.jpg"></a></div>
  					</div>
  					<!-- Carousel nav -->
  					<a class="carousel-control left" href="#myCarousel" data-slide="prev" style="background-image:none;">&lsaquo;</a>
  					<a class="carousel-control right" href="#myCarousel" data-slide="next" style="background-image:none;">&rsaquo;</a>
				</div>
			</div>
			<c:if test="${ rankbook!=NULL}">
			</c:if>
			
			<div class="chart">
				<ul>
				
					<li><img src="<%=request.getContextPath()%>/resources/images/bang.png"><sapn style="line-height:48px;margin-left:10px;">图书排行榜</span></li>
					<c:forEach var="rb" items="${rankbook}" varStatus="rblist">
				
					<li class="roll-li"><img src="<%=request.getContextPath()%>/resources/images/${rblist.count}.png"><a href="book/${rb.bookid }">${rb.bookname}</a></li>
				<%---
					<li class="roll-li"><img src="<%=request.getContextPath()%>/resources/images/2.png"><a href="#">第二名</a></li>
					<li class="roll-li"><img src="<%=request.getContextPath()%>/resources/images/3.png"><a href="#">第三名</a></li>
					<li class="roll-li"><img src="<%=request.getContextPath()%>/resources/images/4.png"><a href="#">第四名</a></li>
					<li class="roll-li"><img src="<%=request.getContextPath()%>/resources/images/5.png"><a href="#">第五名</a></li>
					<li class="roll-li"><img src="<%=request.getContextPath()%>/resources/images/6.png"><a href="#">第六名</a></li>
					<li class="roll-li"><img src="<%=request.getContextPath()%>/resources/images/7.png"><a href="#">第七名</a></li>
					<li class="roll-li"><img src="<%=request.getContextPath()%>/resources/images/8.png"><a href="#">第八名</a></li>
					<li  class="roll-li" style="border-bottom:dotted 0px #fff;"><img src="<%=request.getContextPath()%>/resources/images/9.png"><a href="#">第九名</a></li>
				 --%>
				</c:forEach>
				</ul>
			</div>
		</div>
	
		<div class="recomd" style="height: 700px !important;">
			<div class="r-title">
				<span>图书推荐</span>
			</div>
			<div class="r-book">
				<ul>
				<c:forEach var="re" items="${recommendbook}" varStatus="relist">
					<li>
						<div class="r-book-img"><a href="book/${re.bookid }"><img alt="" src="http://wwhahapic.tunnel.mobi/${re.picture}" width="194px" height="194px"></a></div>
						<div class="r-book-name"><a href="book/${re.bookid }">${re.bookname }</a></div>
						<div class="r-book-author"><a href="book/${re.bookid }">${re.author }</a></div>
						<div class="r-book-price"><a href="book/${re.bookid }">${re.price}</a></div>
					</li>
					</c:forEach>
					<%---------
					<li>
						<div class="r-book-img"></div>
						<div class="r-book-name"><a href="#">名称</a></div>
						<div class="r-book-author"><a href="#">作者</a></div>
						<div class="r-book-price"><a href="#">价格</a></div>
					</li>
					<li>
						<div class="r-book-img"></div>
						<div class="r-book-name"><a href="#">名称</a></div>
						<div class="r-book-author"><a href="#">作者</a></div>
						<div class="r-book-price"><a href="#">价格</a></div>
					</li>
					<li>
						<div class="r-book-img"></div>
						<div class="r-book-name"><a href="#">名称</a></div>
						<div class="r-book-author"><a href="#">作者</a></div>
						<div class="r-book-price"><a href="#">价格</a></div>
					</li>
					<li>
						<div class="r-book-img"></div>
						<div class="r-book-name"><a href="#">名称</a></div>
						<div class="r-book-author"><a href="#">作者</a></div>
						<div class="r-book-price"><a href="#">价格</a></div>
					</li>
				</ul>
				<ul>
					<li>
						<div class="r-book-img"></div>
						<div class="r-book-name"><a href="#">名称</a></div>
						<div class="r-book-author"><a href="#">作者</a></div>
						<div class="r-book-price"><a href="#">价格</a></div>
					</li>
					<li>
						<div class="r-book-img"></div>
						<div class="r-book-name"><a href="#">名称</a></div>
						<div class="r-book-author"><a href="#">作者</a></div>
						<div class="r-book-price"><a href="#">价格</a></div>
					</li>
					<li>
						<div class="r-book-img"></div>
						<div class="r-book-name"><a href="#">名称</a></div>
						<div class="r-book-author"><a href="#">作者</a></div>
						<div class="r-book-price"><a href="#">价格</a></div>
					</li>
					<li>
						<div class="r-book-img"></div>
						<div class="r-book-name"><a href="#">名称</a></div>
						<div class="r-book-author"><a href="#">作者</a></div>
						<div class="r-book-price"><a href="#">价格</a></div>
					</li>
					<li>
						<div class="r-book-img"></div>
						<div class="r-book-name"><a href="#">名称</a></div>
						<div class="r-book-author"><a href="#">作者</a></div>
						<div class="r-book-price"><a href="#">价格</a></div>
					</li>
					
					 --%>
				</ul>
			</div>
		</div>
		<!--图书推荐-->
	</div>
	<!--主要内容-->






	<div class="state">
		<div class="ads-bg">
			<div class="ads">
				<div class="ads-img" style="margin-left:-70px;"><img src="<%=request.getContextPath()%>/resources/images/ad-img-1.png"></div>
				<div class="ads-img"><img src="<%=request.getContextPath()%>/resources/images/ad-img-2.png"></div>
				<div class="ads-img"><img src="<%=request.getContextPath()%>/resources/images/ad-img-3.png"></div>
				<div class="ads-img" style="margin-right:-70px;"><img src="<%=request.getContextPath()%>/resources/images/ad-img-4.png"></div>
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

     <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>   
	
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
    <script type="text/javascript">
    	$('.dropdown').mouseover(function() {
    		$(this).addClass('open');
    	}).mouseout(function() {        
    		$(this).removeClass('open');    
    	});

    	$("a,button").focus(function(){this.blur()});

    	/*$(".form-control").focus(function() {
    		$(this).attr('placeholder','')
    	})*/
    	/*$('form-control').ready(function() {
    		$('.form-control').val('Search').css({color:"#c6c7c8"});
		//当鼠标聚焦
    		$('.form-control').focus(function() {
    			if($(this).val() == 'Search') {
    				$(this).val('').css({color:"#000"});
    			}
    		});
		//当鼠标失去焦点
			$('.form-control').blur(function() {
        		if($(this).val() == '') {
            		$(this).val('Search').css({color:"#c6c7c8"});
        		}
      		});
 		});*/

		$(function(){
			$(window).on('scroll',function(){
				var st = $(document).scrollTop();
				if(st>0){
					if($('#main-container').length!=0){
						var w = $(window).width(),mw = $('#main-container').width();
						if((w-mw)/2>70)
							$('#go-top').css({'left':(w-mw)/2+mw+20});
						else{
							$('#go-top').css({'left':'auto'});
						}
					}
					$('#go-top').fadeIn(function(){
						$(this).removeClass('dn');
					});
				}
				else{
					$('#go-top').fadeOut(function(){
						$(this).addClass('dn');
					});
				}	
			});
			$('#go-top .go').on('click',function(){
				$('html,body').animate({'scrollTop':0},500);
			});

			$('#go-top .uc-2vm').hover(function(){
				$('#go-top .uc-2vm-pop').removeClass('dn');
			},function(){
				$('#go-top .uc-2vm-pop').addClass('dn');
			});
		});
    </script>
</html>