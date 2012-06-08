<%@page contentType="text/html;charset=utf-8"%>
<%@include file="../../head.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>考试资讯－淘学520</title>
<script type="text/javascript">
	$(document).ready(function(){
		var examInfos = ${examInfos};
		for(var i=0;i<examInfos.length;i++){
			var li = "<li><a href=\"${path}/ExamInfo/ExamInfo!ToDetail.action?examId="+examInfos[i].examId+"&collegeId="+examInfos[i].collegeId+"\">"+examInfos[i].name+"</a></li>"
			$(".Box_box").each(function(){
				if(examInfos[i].examId == $(this).attr("examCataId")){
					$(this).find(".Box_rr").append(li);
				}
			})
		}
	})
</script>
</head>
<body>
<div class="Subs sBox">
  <div class="Positions pBox">当前位置：<span class="PTit">考试资讯</span></div>
  <div class="Box_box" examCataId="1">
    <div class="Box_l">
      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
      <h2><a href="detail.html">公共课</a></h2>
      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
    </div>
    <ul class="Box_rr">
    </ul>
  </div>
  <div class="Box_lindes"></div>
  <div class="Box_box" examCataId="2">
    <div class="Box_l">
      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
      <h2>专业课</h2>
      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
    </div>
    <ul class="Box_rr">
    </ul>
  </div>
  <div class="Box_lindes"></div>
  <div class="Box_box" examCataId="3">
    <div class="Box_l">
      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
      <h2>等级考试</h2>
      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
    </div>
    <ul class="Box_rr">
    </ul>
  </div>
</div>
</body>
</html>
