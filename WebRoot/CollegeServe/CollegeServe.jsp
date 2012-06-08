<%@page contentType="text/html;charset=utf-8"%>
<%@include file="../../head.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>校园服务－淘学520</title>
<script type="text/javascript">
	$(document).ready(function(){
		var serveInfos=${serveInfos};
		$(".Box_box").each(function(){
			for(var i=0;i<serveInfos.length;i++){
				//alert(serveInfos[i].type)
				if(serveInfos[i].type==$(this).attr("catalog")){
					var li="<li><span class=\"box_rimg\"><img src=\"${path}/images/"+serveInfos[i].img+"\" /></span>"+
								"<h2><a href=\"${path}/CollegeServe/CollegeServe!ToDetail.action?id="+serveInfos[i].id+"&type="+serveInfos[i].type+"\">"+serveInfos[i].name+"</a></h2>"+
								"<p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>"
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
  <div class="Positions pBox">当前位置：<span class="PTit">校园服务</span></div>
  <div class="Box_box" catalog="1">
    <div class="Box_l">
      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
      <h2><a href="detail.html">考试报名</a></h2>
      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
    </div>
    <ul class="Box_r">
    </ul>
  </div>
  <div class="Box_lindes"></div>
  <div class="Box_box" catalog="2">
    <div class="Box_l">
      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
      <h2>校园代理</h2>
      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
    </div>
    <ul class="Box_r">
    </ul>
  </div>
  <div class="Box_lindes"></div>
  <div class="Box_box" catalog="3">
    <div class="Box_l">
      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
      <h2>优惠信息</h2>
      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
    </div>
    <ul class="Box_r">
    </ul>
  </div>
  <div class="Box_lindes"></div>
  <div class="Box_box" catalog="4">
    <div class="Box_l">
      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
      <h2>其他活动</h2>
      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
    </div>
    <ul class="Box_r">
    </ul>
  </div>
</div>
</body>
</html>
