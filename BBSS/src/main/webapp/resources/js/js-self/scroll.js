    $(window).scroll(function(){
    	var scrollTop = document.body.scrollTop;
    	var windowheight = $(document).height(); 
        //alert("页面实际高度"+$(document).height());
    	var height = $(window).height(); 
        //alert("页面显示高度"+$(window).height());
    	if(scrollTop + height > windowheight - 130){
        //	alert("滑到底部，浮动隐藏");
    	   $("#fixed").removeClass("fixed-bottom");
    	}
    	if((windowheight > height)&&(scrollTop + height <= windowheight - 170)){
    	//	alert("当前页面有滚动条，浮动显示");
    	   $("#fixed").addClass("fixed-bottom");
    	}
    })