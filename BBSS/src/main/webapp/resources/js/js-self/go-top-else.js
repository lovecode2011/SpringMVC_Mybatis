	$('.buy_num').spinner({});

    $('.dropdown').mouseover(function() {
    	$(this).addClass('open');
    }).mouseout(function() {        
    	$(this).removeClass('open');    
    });


    $("a,button").focus(function(){this.blur()});


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