<%@page contentType="text/html;charset=utf-8"%>
<%@include file="../../head.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>公益平台－淘学520</title>
<script type="text/javascript">
	$(document).ready(function(){
		var communityInfos=${communityInfos};
		$(".Box_box").each(function(){
			for(var i=0;i<communityInfos.length;i++){
				if(communityInfos[i].type==$(this).attr("catalog")){
					var li="<li><span class=\"box_rimg\"><img src=\"${path}/images/"+communityInfos[i].img+"\" /></span>"+
								"<h2><a href=\"${path}/CommunityPlate/CommunityPlate!ToDetail.action?id="+communityInfos[i].id+"&type="+communityInfos[i].type+"\">"+communityInfos[i].name+"</a></h2>"+
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
  <div class="Positions pBox">当前位置：<span class="PTit">公益平台</span></div>
  <div class="Box_box" catalog="1">
    <div class="Box_l">
      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
      <h2>公益你知道</h2>
      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
    </div>
    <ul class="Box_r">
    </ul>
  </div>
  <div class="Box_lindes"></div>
  <div class="Box_box" catalog="2">
    <div class="Box_l">
      <div class="box_limg"><img src="${path}/images/box_show.jpg" /></div>
      <h2>校类公益活动</h2>
      <p>包含校级、院级学生会、活动丰富。点击院系名进入。</p>
    </div>
    <ul class="Box_r">
    </ul>
  </div>
</div>
</body>
</html>
