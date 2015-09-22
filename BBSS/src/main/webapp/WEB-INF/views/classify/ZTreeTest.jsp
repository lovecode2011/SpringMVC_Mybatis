<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tree结构测试</title>
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/resources/css/zTreeStyle/zTreeStyle.css"
	rel="stylesheet">
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery.ztree.all-3.5.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/bootstrap-treeview.js"></script>
	
	<SCRIPT type="text/javascript">
	
		var curMenu = null, zTree_Menu = null;
		var setting = {
			view: {
				showLine: false,
				showIcon: false,
				selectedMulti: false,
				dblClickExpand: false,
				addDiyDom: addDiyDom
			},
			data: {
				simpleData: {
					enable: true
				}
			},
			callback: {
				beforeClick: beforeClick
			}
		};
		var url = "classifyZTreeJson";
	    var datajson;
		$.ajax( {
			type : "POST",
			url : url,
			data : {},
			dataType : "JSON",
			success : function(data) {
				alert(data);
				datajson=data;
				alert(datajson);
				//data为后台返回的Json信息
				for(var n=0;n<data.length;n++){
				//	alert(data.length);
		 		  	var ids=data[n].id;
		 		  	alert(ids);
		 		  //	alert(ids);
					var pId=data[n].pId;
					alert(pId);
					var names=data[n].name;
					alert(names);
				//	alert(names);
					$("#classSubid").append("<option  value='"+ids+"'>"+names+"</option>");
		     		}
			}
		})
		
		var zNodes =[
			{ id:1, pId:0, name:"文件夹", open:true},
			{ id:11, pId:1, name:"收件箱"},
			{ id:111, pId:11, name:"收件箱1"},
			{ id:112, pId:111, name:"收件箱2"},
			{ id:113, pId:112, name:"收件箱3"},
			{ id:114, pId:113, name:"收件箱4"},
			{ id:12, pId:1, name:"垃圾邮件"},
			{ id:13, pId:1, name:"草稿"},
			{ id:14, pId:1, name:"已发送邮件"},
			{ id:15, pId:1, name:"已删除邮件"},
			{ id:3, pId:0, name:"快速视图"},
			{ id:31, pId:3, name:"文档"},
			{ id:32, pId:3, name:"照片"}
		];

		function addDiyDom(treeId, treeNode) {
			var spaceWidth = 5;
			var switchObj = $("#" + treeNode.tId + "_switch"),
			icoObj = $("#" + treeNode.tId + "_ico");
			switchObj.remove();
			icoObj.before(switchObj);

			if (treeNode.level > 1) {
				var spaceStr = "<span style='display: inline-block;width:" + (spaceWidth * treeNode.level)+ "px'></span>";
				switchObj.before(spaceStr);
			}
		}

		function beforeClick(treeId, treeNode) {
			if (treeNode.level == 0 ) {
				var zTree = $.fn.zTree.getZTreeObj("treeDemo");
				zTree.expandNode(treeNode);
				return false;
			}
			return true;
		}

		$(document).ready(function(){
			var treeObj = $("#treeDemo");
			$.fn.zTree.init(treeObj, setting,datajson);
			zTree_Menu = $.fn.zTree.getZTreeObj("treeDemo");
			curMenu = zTree_Menu.getNodes()[0].children[0].children[0];
			zTree_Menu.selectNode(curMenu);

			treeObj.hover(function () {
				if (!treeObj.hasClass("showIcon")) {
					treeObj.addClass("showIcon");
				}
			}, function() {
				treeObj.removeClass("showIcon");
			});
		});
	</SCRIPT>
	
	
<style type="text/css">
.ztree * {font-size: 10pt;font-family:"Microsoft Yahei",Verdana,Simsun,"Segoe UI Web Light","Segoe UI Light","Segoe UI Web Regular","Segoe UI","Segoe UI Symbol","Helvetica Neue",Arial}
.ztree li ul{ margin:0; padding:0}
.ztree li {line-height:30px;}
.ztree li a {width:200px;height:30px;padding-top: 0px;}
.ztree li a:hover {text-decoration:none; background-color: #E7E7E7;}
.ztree li a span.button.switch {visibility:hidden}
.ztree.showIcon li a span.button.switch {visibility:visible}
.ztree li a.curSelectedNode {background-color:#D4D4D4;border:0;height:30px;}
.ztree li span {line-height:30px;}
.ztree li span.button {margin-top: -7px;}
.ztree li span.button.switch {width: 16px;height: 16px;}

.ztree li a.level0 span {font-size: 150%;font-weight: bold;}
.ztree li span.button {background-image:url("./left_menuForOutLook.png"); *background-image:url("./left_menuForOutLook.gif")}
.ztree li span.button.switch.level0 {width: 20px; height:20px}
.ztree li span.button.switch.level1 {width: 20px; height:20px}
.ztree li span.button.noline_open {background-position: 0 0;}
.ztree li span.button.noline_close {background-position: -18px 0;}
.ztree li span.button.noline_open.level0 {background-position: 0 -18px;}
.ztree li span.button.noline_close.level0 {background-position: -18px -18px;}
	</style>
</head>
<body>
<h1>tree测试</h1>
<div class="zTreeDemoBackground left">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
 		<div class="row">
        <div class="col-sm-4">
          <h2>Link enabled, or</h2>
          <div id="treeview10" class=""></div>
        </div>
        <div class="col-sm-4">

        </div>
        <div class="col-sm-4">

        </div>



</body>
<script type="text/javascript">
$(function() {

    var defaultData = [
      {
        text: 'Parent 1',
        href: '#parent1',
        tags: ['4'],
        nodes: [
          {
            text: 'Child 1',
            href: '#child1',
            tags: ['2'],
            nodes: [
              {
                text: 'Grandchild 1',
                href: '#grandchild1',
                tags: ['0']
              },
              {
                text: 'Grandchild 2',
                href: '#grandchild2',
                tags: ['0']
              }
            ]
          },
          {
            text: 'Child 2',
            href: '#child2',
            tags: ['0']
          }
        ]
      },
      {
        text: 'Parent 2',
        href: '#parent2',
        tags: ['0']
      },
      {
        text: 'Parent 3',
        href: '#parent3',
         tags: ['0']
      },
      {
        text: 'Parent 4',
        href: '#parent4',
        tags: ['0']
      },
      {
        text: 'Parent 5',
        href: '#parent5'  ,
        tags: ['0']
      }
    ];
    
    var url = "classifyTreeJson";
    var datajson;
	$.ajax( {
		type : "POST",
		url : url,
		data : {},
		dataType : "JSON",
		success : function(data) {
			alert(data);
			datajson=data;
			alert(datajson);
			//data为后台返回的Json信息
			for(var n=0;n<data.length;n++){
			//	alert(data.length);
	 		  	var ids=data[n].text;
	 		  	alert(ids);
	 		  //	alert(ids);
				var names=data[n].nodes;
				alert(names);
			//	alert(names);
				$("#classSubid").append("<option  value='"+ids+"'>"+names+"</option>");
	     		}
		}
	})
    
    
    var alternateData = [
                         {
                           text: 'Parent 1',
                           tags: ['2'],
                           nodes: [
                             {
                               text: 'Child 1',
                               tags: ['3'],
                               nodes: [
                                 {
                                   text: 'Grandchild 1',
                                   tags: ['6']
                                 },
                                 {
                                   text: 'Grandchild 2',
                                   tags: ['3']
                                 }
                               ]
                             },
                             {
                               text: 'Child 2',
                               tags: ['3']
                             }
                           ]
                         },
                         {
                           text: 'Parent 2',
                           tags: ['7']
                         },
                         {
                           text: 'Parent 3',
                           icon: 'glyphicon glyphicon-earphone',
                           href: '#demo',
                           tags: ['11']
                         },
                         {
                           text: 'Parent 4',
                           icon: 'glyphicon glyphicon-cloud-download',
                           href: '/demo.html',
                           tags: ['19'],
                           selected: true
                         },
                         {
                           text: 'Parent 5',
                           icon: 'glyphicon glyphicon-certificate',
                           color: 'pink',
                           backColor: 'red',
                           href: 'http://www.tesco.com',
                           tags: ['available','0']
                         }
                       ];

                       var json = '[' +
                         '{' +
                           '"text": "Parent 1",' +
                           '"nodes": [' +
                             '{' +
                               '"text": "Child 1",' +
                               '"nodes": [' +
                                 '{' +
                                   '"text": "Grandchild 1"' +
                                 '},' +
                                 '{' +
                                   '"text": "Grandchild 2"' +
                                 '}' +
                               ']' +
                             '},' +
                             '{' +
                               '"text": "Child 2"' +
                             '}' +
                           ']' +
                         '},' +
                         '{' +
                           '"text": "Parent 2"' +
                         '},' +
                         '{' +
                           '"text": "Parent 3"' +
                         '},' +
                         '{' +
                           '"text": "Parent 4"' +
                         '},' +
                         '{' +
                           '"text": "Parent 5"' +
                         '}' +
                       ']';

$('#treeview10').treeview({
    color: "#428bca",
    data: datajson
  });
});

</script>
</html>