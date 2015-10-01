<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
	<title>树塾书署</title>
	<meta charset="utf-8">
	<link rel="shortcut icon" href="images/Book.ico">
	<link rel="stylesheet" type="text/css" href="css/css-self/navbar.css">
	<link rel="stylesheet" type="text/css" href="css/css-self/recomd.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/css-self/container.css">
	<link rel="stylesheet" type="text/css" href="css/css-self/ad-state.css">
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
		<li class="nav-right"><a href="#" style="text-align:center;">我的订单</a></li>
		<li class="nav-right"><a href="#" style="margin-left:1em;">个人中心</a>
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



	<div class="container s-container">
		<div class="c-head">
			<div class="logo">
				<a href="#">
					<img src="images/logo长.png">
				</a>
			</div>
			<div class="search" style="/*line-height:63px*/">
				<form class="navbar-form navbar-left" role="search">
					<div class="form-group" style="width:174px;height:100%;">
						<input type="text" class="form-control" placeholder="Search" style="display:block;width:174px;height:100%;">
					</div>
					<button type="submit" class="btn btn-default m-btn" style="width:54px;height:100%;float:right;margin-left:7px;">搜索</button>
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
		                <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-primary ul-1" data-target="#" href="javascript:;">社科<span class="caret"></span></a>
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

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">百科知识</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">植物志</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">动物志</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">国家地理</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">宇宙知识</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">外星人</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">宇宙幻想</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">宇宙探索</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">科学世界</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">地球科学</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">科学史话</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">科普图鉴</a></li>
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
		                        <a tabindex="-1" href="javascript:;">影视</a>
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
		                        <a tabindex="-1" href="javascript:;">摄影</a>
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
		                        <a tabindex="-1" href="javascript:;">作品集</a>
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
		                <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-primary ul-1" data-target="#" href="javascript:;">文学<span class="caret"></span></a>
		                <ul id="arrow-ul" class="dropdown-menu multi-level ul-2" role="menu" aria-labelledby="dropdownMenu">
		                	<li class="arrow-li"><b class="arrow"></b></li>
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">小说</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">名著经典</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">中国小说</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">外国小说</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">动漫</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">绘本</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">漫画</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">轻小说</a></li>
		                        </ul>
		                    </li>

		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">传记</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">学者</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">科学</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">艺术</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">政治人物</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">历代帝王</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">其他传记</a></li>
		                        </ul>
		                    </li>
		                    
		                    <li class="divider m-divider"></li>
		                    <li class="dropdown-submenu">
		                        <a tabindex="-1" href="javascript:;">青春文学</a>
		                        <ul class="dropdown-menu ul-2 ul-3">
			                        <li><a href="javascript:;">校园</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">爱情/情感</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">叛逆/成长</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">悬疑/惊悚</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">爆笑/无厘头</a></li>
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
			                        <li><a href="javascript:;">小学</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">中考</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">高考</a></li>
			                        <li class="divider m-divider"></li>
			                        <li><a href="javascript:;">课外读物</a></li>
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
    						<a href="#"><img src="images/test1.jpg"></a>
    					</div>
    					<div class="item"><a href="#"><img src="images/test2.jpg"></a></div>
    					<div class="item"><a href="#"><img src="images/test3.jpg"></a></div>
  					</div>
  					<!-- Carousel nav -->
  					<a class="carousel-control left" href="#myCarousel" data-slide="prev" style="background-image:none;">&lsaquo;</a>
  					<a class="carousel-control right" href="#myCarousel" data-slide="next" style="background-image:none;">&rsaquo;</a>
				</div>
			</div>
			<div class="chart">
				<ul>
				
					<li><img src="images/bang.png"><sapn style="line-height:48px;margin-left:10px;">图书排行榜</span></li>
					<c:forEach var="rb" items="${rankbook}" varStatus="rblist">
				
					<li class="roll-li"><img src="images/${rblist.count}.png"><a href="book/${rb.bookid }">${rb.bookname}</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<!--轮播跟排行榜-->

		<div class="recomd" style="height: 700px !important;">
			<div class="r-title-wrap">
				<div class="r-img">
					<img src="images/recomd.png">
				</div>
				<div class="r-title">
					<span>图书推荐</span>
				</div>
			</div>
			<div class="r-book">
				<ul>
					<c:forEach var="re" items="${recommendbook}" varStatus="relist">
					<li>
						<a href="book/${re.bookid }"><div class="r-book-img"><img src="http://wwhahapic.tunnel.mobi/${re.picture}"></div>
						<div class="r-book-name">${re.bookname }</div></a>
						<div class="r-book-author">${re.author }</div>
						<div class="r-book-price">¥${re.price}</div>
					</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<!--图书推荐-->
	</div>
	<!--主要内容-->






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
    <script type="text/javascript">
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