<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
	<TITLE> 32323</TITLE>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.ztree.core-3.5.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/json2.js"></script>
	<SCRIPT type="text/javascript">
	
	var url = "classifyZTreeJson";
    var datajson;
    var aToStr;
    var bToObj;
	$.ajax( {
		type : "POST",
		url : url,
		data : {},
		dataType : "JSON",
		contentType: "application/json; charset=utf-8",
		success : function(data) {
			alert("data原本的类型"+typeof(data));
			aToStr = eval(data);
			alert(aToStr);
			bToObj = JSON.parse(data);
			
			var  str = data.toJSONString();
			var sr2 = JSON.stringify(data);
			
			alert("bToStr原本的类型"+typeof(bToStr));
			alert(bToStr);
			alert("str原本的类型"+typeof(str));
			alert(str);
			alert("sr2"+typeof(sr2));
			alert(sr2);
		//	datajson =eval("(" + data + ")"); //转换为json对象
			
			//alert(data);
			//datajson=data;
			//alert(datajson);
			//data为后台返回的Json信息
			for(var n=0;n<data.length;n++){
	 		  	var ids=data[n].id;
				var pId=data[n].pId;
				var names=data[n].name;
			//	alert(ids+"=="+pId+"==="+names);
	     		}
		}
	})	
		var setting = {
			data: {
				simpleData: {
					enable: true
				}
			}
		};
        var datajson1=[{"id":1,"pId":0,"name":"童书"},{"id":2,"pId":0,"name":"教育"},{"id":3,"pId":0,"name":"生活"},{"id":4,"pId":0,"name":"人文"},{"id":5,"pId":0,"name":"科普"},{"id":6,"pId":0,"name":"外籍"},{"id":85,"pId":1,"name":"0-2岁"},{"id":86,"pId":1,"name":"3-6岁"},{"id":87,"pId":1,"name":"7-10岁"},{"id":88,"pId":1,"name":"11-14岁"},{"id":89,"pId":1,"name":"精装图画书"},{"id":90,"pId":1,"name":"少儿期刊"},{"id":91,"pId":2,"name":"教材"},{"id":92,"pId":2,"name":"中小学教辅"},{"id":94,"pId":2,"name":"考试"},{"id":95,"pId":91,"name":"研究生/本科"},{"id":96,"pId":91,"name":"高职高专"},{"id":97,"pId":91,"name":"成人教育"},{"id":98,"pId":91,"name":"职业培训"},{"id":99,"pId":94,"name":"学历考试"},{"id":100,"pId":94,"name":"公职"},{"id":102,"pId":94,"name":"考研"},{"id":103,"pId":94,"name":"公务员"},{"id":104,"pId":3,"name":"烹饪/美食"},{"id":105,"pId":3,"name":"旅游/地图"},{"id":106,"pId":3,"name":"亲子/家教"},{"id":107,"pId":3,"name":"手工/DIY"},{"id":108,"pId":3,"name":"运动"},{"id":109,"pId":3,"name":"美妆"},{"id":110,"pId":104,"name":"家常菜谱"},{"id":111,"pId":104,"name":"烘培甜品"},{"id":112,"pId":104,"name":"餐饮文化"},{"id":113,"pId":105,"name":"国内自助游"},{"id":115,"pId":105,"name":"旅游攻略"},{"id":116,"pId":106,"name":"家教方法"},{"id":117,"pId":106,"name":"素质教育"},{"id":118,"pId":106,"name":"亲子关系"},{"id":119,"pId":108,"name":"田径"},{"id":120,"pId":108,"name":"篮球"},{"id":121,"pId":108,"name":"足球"},{"id":122,"pId":108,"name":"羽毛球"},{"id":123,"pId":109,"name":"化妆指导"},{"id":124,"pId":109,"name":"化妆品推荐"},{"id":125,"pId":107,"name":"纸艺"},{"id":126,"pId":107,"name":"布艺"},{"id":127,"pId":107,"name":"黏土"},{"id":128,"pId":4,"name":"历史"},{"id":129,"pId":4,"name":"文化"},{"id":130,"pId":4,"name":"政治/军事"},{"id":131,"pId":4,"name":"法律"},{"id":132,"pId":128,"name":"历史普及读物"},{"id":133,"pId":128,"name":"中国史"},{"id":134,"pId":128,"name":"世界史"},{"id":135,"pId":129,"name":"中国文化"},{"id":136,"pId":129,"name":"各国文化"},{"id":137,"pId":129,"name":"文化评述"},{"id":138,"pId":130,"name":"中国政治"},{"id":139,"pId":130,"name":"世界政治"},{"id":140,"pId":130,"name":"时事政治"},{"id":141,"pId":130,"name":"军事理论"},{"id":142,"pId":130,"name":"军事史"},{"id":143,"pId":131,"name":"民法"},{"id":144,"pId":131,"name":"刑法"},{"id":145,"pId":131,"name":"经济法"},{"id":146,"pId":131,"name":"法律法规"},{"id":149,"pId":5,"name":"百科知识"},{"id":151,"pId":5,"name":"宇宙知识"},{"id":152,"pId":5,"name":"科学世界"},{"id":154,"pId":6,"name":"传记Biograp"},{"id":155,"pId":6,"name":"艺术 Art"},{"id":156,"pId":6,"name":"摄影 Photogr"},{"id":157,"pId":6,"name":"摄影 Photogr"},{"id":158,"pId":2,"name":"计算机"}];
		alert("datajson1的类型"+typeof(datajson1));
		alert(datajson);
		
        
        $(document).ready(function(){
			$.fn.zTree.init($("#treeDemo"), setting, datajson1);
		});
	</SCRIPT>
 </HEAD>
<BODY>
	<div class="zTreeDemoBackground left">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
</BODY>
</HTML>