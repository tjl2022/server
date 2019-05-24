$(function(){
	var sWidth = $("#slider_name").width();
	var len = $("#slider_name .silder_panel").length;
	var index = 0;
	var picTimer;
	
	var btn = "<a class='prev'>Prev</a><a class='next'>Next</a>";
	$("#slider_name").append(btn);

	$("#slider_name .silder_nav li").css({"opacity":"1","filter":"alpha(opacity=60)"}).mouseenter(function() {																		
		index = $("#slider_name .silder_nav li").index(this);
		showPics(index);
	}).eq(0).trigger("mouseenter");

	$("#slider_name .prev,#slider_name .next").css({"opacity":"100","filter":"alpha(opacity=20)"}).hover(function(){
		$(this).stop(true,false).animate({"opacity":"100","filter":"alpha(opacity=60)"},300);
	},function() {
		$(this).stop(true,false).animate({"opacity":"100","filter":"alpha(opacity=20)"},300);
	});


	// Prev
	$("#slider_name .prev").click(function() {
		index -= 1;
		if(index == -1) {index = len - 1;}
		showPics(index);
	});

	// Next
	$("#slider_name .next").click(function() {
		index += 1;
		if(index == len) {index = 0;}
		showPics(index);
	});

	// 
	$("#slider_name .silder_con").css("width",sWidth * (len));
	
	// mouse 
	$("#slider_name").hover(function() {
		clearInterval(picTimer);
	},function() {
		picTimer = setInterval(function() {
			showPics(index);
			index++;
			if(index == len) {index = 0;}
		},3000); 
	}).trigger("mouseleave");
	
	// showPics
	function showPics(index) {
		var nowLeft = -index*sWidth; 
		$("#slider_name .silder_con").stop(true,false).animate({"left":nowLeft},300);
		$("#slider_name .silder_nav li").removeClass("current").eq(index).addClass("current"); 
		$("#slider_name .silder_nav li").stop(true,false).animate({"opacity":"1"},300).eq(index).stop(true,false).animate({"opacity":"1"},300);
	}
});



//走进禾健内容页切换
$(function(){     
	 $('.gsjj').click(function(){
		$('#main').load("a_gsjj.html");
		$('.sousuo1 a').css('color','#727070');
		$(this).css('color','#abcd22');
		  return false; }); 
	 });
	 $(function(){     
	 $('.ppwh').click(function(){
		$('#main').load("a_zjhj.html");
		$('.sousuo1 a').css('color','#727070');
		$(this).css('color','#abcd22');
		  return false; }); 
	 });
	 $(function(){     
	 $('.ppry').click(function(){
		$('#main').load("a_ppry.html");
		$('.sousuo1 a').css('color','#727070');
		$(this).css('color','#abcd22');
		  return false; }); 
	 });
	 $(function(){     
	 $('.xdys').click(function(){
		$('#main').load("a_xdys.html");
		$('.sousuo1 a').css('color','#727070');
		$(this).css('color','#abcd22');
		$('.xdys')
		  return false; }); 
	 });
	 $(function(){     
	 $('.ppzl').click(function(){
		$('#main').load("a_ppzl.html");
		$('.sousuo1 a').css('color','#727070');
		$(this).css('color','#abcd22');
		  return false; }); 
	 });
	 $(function(){     
	 $('.ceofc').click(function(){
		$('#main').load("a_ceofc.html");
		$('.sousuo1 a').css('color','#727070');
		$(this).css('color','#abcd22');
		  return false; }); 
	 });