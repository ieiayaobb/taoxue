<%@page contentType="text/html;charset=utf-8"%>
<%@include file="../../head.jsp" %>
<html>
<head>
	<title>活动讯息－淘学520</title>
	<script type="text/javascript">
		$(document).ready(function(){
			var activityInfos=${activityInfos};
			$(".Box_box").each(function(){
				for(var i=0;i<activityInfos.length;i++){
					if(activityInfos[i].type==$(this).attr("catalog")){
						var li="<li><span class=\"box_rimg\"><img src=\"${path}/images/"+activityInfos[i].img+"\" /></span>"+
									"<h2><a href=\"${path}/CollegeInfo/ActivityInfo/ActivityInfo!ToDetail.action?id="+activityInfos[i].id+"&type="+activityInfos[i].type+"\">"+activityInfos[i].name+"</a></h2>"+
									"<p>主办方："+activityInfos[i].owner+"<br />"+
									"活动级别："+activityInfos[i].priority+"<br />"+
									"活动时间："+activityInfos[i].time+"</p>"+
								"</li>"
						$(this).find(".Box_r").append(li)
					}
				}
			})
		})
	</script>
</head>
<body>
	<div class="Subs sBox">
	  <div class="Positions pBox">当前位置：<span class="PTit">活动汇总</span></div>
	  <div class="Box_box" catalog="0">
	    <div class="Box_l">
	      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
	      <h2><a href="hdhz_detail.html">热点活动推荐</a></h2>
	      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
	    </div>
	    <ul class="Box_r Box_rrr">
	    </ul>
	  </div>
	  <div class="Box_lindes"></div>
	  <div class="Box_box" catalog="1">
	    <div class="Box_l">
	      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
	      <h2>文艺/体育类活动</h2>
	      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
	    </div>
	    <ul class="Box_r Box_rrr">
	    </ul>
	  </div>
	  <div class="Box_lindes"></div>
	  <div class="Box_box" catalog="2">
	    <div class="Box_l">
	      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
	      <h2>学术/创新类</h2>
	      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
	    </div>
	    <ul class="Box_r Box_rrr">
	    </ul>
	  </div>
	  <div class="Box_lindes"></div>
	  <div class="Box_box" catalog="3">
	    <div class="Box_l">
	      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
	      <h2>其他活动</h2>
	      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
	    </div>
	    <ul class="Box_r Box_rrr">
	    </ul>
	  </div>
	</div>
</body>
</html>
