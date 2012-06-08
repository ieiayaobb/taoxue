<%@page contentType="text/html;charset=utf-8"%>
<%@include file="../../head.jsp" %>
<html>
<head>
<title>社团介绍－淘学520</title>
<script type="text/javascript">
	$(document).ready(function(){
		var councilInfos = ${councilInfos};
		var unionInfos = ${unionInfos};
		for(var i=0;i<unionInfos.length;i++){
			var li = "<li><a href=\"${path}/CollegeInfo/UnionInfo!ToDetail.action?unionId="+unionInfos[i].unionId+"&collegeId="+unionInfos[i].collegeId+"\">"+unionInfos[i].name+"</a></li>"
			$(".Box_box").each(function(){
				if(unionInfos[i].unionId == $(this).attr("unionId")){
					$(this).find(".Box_rr").append(li);
				}
			})
		}
		for(var j=0;j<councilInfos.length;j++){
			var li = "<li> <span class=\"box_oimg\"><img src=\"${path}/images/"+councilInfos[j].img+"\"/></span>"+
	        		 "<h2><a href=\"${path}/CollegeInfo/UnionInfo!ToDetail.action?unionId="+councilInfos[j].unionId+"&collegeId="+councilInfos[j].collegeId+"\">"+councilInfos[j].name+"</a></h2>"+
	        		 "</li>"
	        $(".Box_ro").append(li);
		}
	})
</script>
</head>
<body>
	<div class="Subs sBox">
	  <div class="Positions pBox">当前位置：<span class="PTit">社团介绍</span></div>
	  <div class="Box_box" type="1" unionId="1">
	    <div class="Box_l">
	      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
	      <h2><a href="stjs_detail.html">学生会</a></h2>
	      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
	    </div>
	    <ul class="Box_rr">
	    </ul>
	  </div>
	  <div class="Box_lindes"></div>
	  <div class="Box_box" type="1" unionId="2">
	    <div class="Box_l">
	      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
	      <h2>分团委</h2>
	      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
	    </div>
	    <ul class="Box_rr">
	    </ul>
	  </div>
	  <div class="Box_lindes"></div>
	  <div class="Box_box" type="1" unionId="3">
	    <div class="Box_l">
	      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
	      <h2>科协</h2>
	      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
	    </div>
	    <ul class="Box_rr">
	    </ul>
	  </div>
	  <div class="Box_lindes"></div>
	  <div class="Box_box" type="2" unionId="4">
	    <div class="Box_l">
	      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
	      <h2>社团联合会</h2>
	      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
	    </div>
	    <ul class="Box_ro">
	    </ul>
	  </div>
	</div>
</body>
</html>
