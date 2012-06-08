<%@page contentType="text/html;charset=utf-8"%> 
<%@include file="head.jsp" %>
<html>
  <head>
    <title>淘学520</title>
	<script type="text/javascript">
		//调整高度
		function adjustHeight(){
			$("#main").load(function(){
				$("#main").height($("#main").contents().find("body").height())
			});
		}
		$(document).ready(function(){
			$(".nav1").click(function(){
				$("#main").attr("src","${path}/index.jsp");
				adjustHeight();
			})
			$(".nav2 li:eq(0)").click(function(){
				$("#main").attr("src","${path}/CollegeInfo/UnionInfo!ToMain.action");
				adjustHeight();
			})
			$(".nav2 li:eq(1)").click(function(){
				$("#main").attr("src","${path}/CollegeInfo/NewComeToKnow/NewComeToKnow!ToMain.action?id=1");
				adjustHeight();
			})
			$(".nav2 li:eq(2)").click(function(){
				$("#main").attr("src","${path}/CollegeInfo/ActivityInfo/ActivityInfo!ToMain.action");
				adjustHeight();
			})
			$(".nav3").click(function(){
				$("#main").attr("src","${path}/CollegeServe/CollegeServe!ToMain.action");
				adjustHeight();
			})
			$(".nav4").click(function(){
				$("#main").attr("src","${path}/ExamInfo/ExamInfo!ToMain.action");
				adjustHeight();
			})
			$(".nav5").click(function(){
				$("#main").attr("src","${path}/CommunityPlate/CommunityPlate!ToMain.action");
				adjustHeight();
			})
			$(".nav6").click(function(){
				$("#main").attr("src","${path}/ConnactUs/ConnactUs.jsp");
				adjustHeight();
			})
		});
	</script>
  </head>
  <body>
	<div class="Tops">
	  <div class="Top960">
	    <div class="Topleft">HI,欢迎来到淘学520，www.taoxue520.com</div>
	    <div class="Topright"><a href="#" onClick="this.style.behavior='url(#default#homepage)';this.setHomePage('http://www.taoxue520.com');">设为首页</a> / <a href="javascript:window.external.AddFavorite('http://www.taoxue520.com','淘学520')" class="setJoin">加入收藏</a></div>
	  </div>
	</div>
	<div class="Heads">
	  <div id="Logos"><a href="index.html"><img src="images/logo.jpg" alt="淘学520" border="0" /></a></div>
	</div>
	<div class="Navs960">
	  <ul id="nav">
	    <li class="nav1 on1"><a href="javascript:;" class="on1">网站首页</a></li>
	    <li class="nav2 Life_A"><a href="javascript:;">校园资讯</a>
	      <ul class="Life_B">
	        <li><a href="javascript:;">社团介绍</a>
	        <li><a href="javascript:;">新生须知</a></li>
	        <li><a href="javascript:;">活动汇总</a></li>
	      </ul>
	    </li>
	    <li class="nav3"><a href="javascript:;">校园服务</a></li>
	    <li class="nav4"><a href="javascript:;">考试资讯</a></li>
	    <li class="nav5"><a href="javascript:;">公益平台</a></li>
	    <li class="nav6"><a href="javascript:;">联系我们</a></li>
	  </ul>
	</div>
	<div class="Lines"></div>
	<div style="width:1000px;margin:auto;">
		<iframe name="main" id="main" src="${path}/index.jsp" width=100% height=600 frameborder=0 scrolling="no" style="display:block;"></iframe>
	</div>
	<div style="clear:both"></div>
	<div class="Foots">
	  <div class="Foots960"><span class="Copyright"><p><script language="JavaScript" src="http://s19.cnzz.com/stat.php?id=3153116&amp;web_id=3153116&amp;show=pic"></script></p>Copyright © 2011 taoxue520.com  All Rights Reserved  皖ICP备10002772号   设计制作：<a href="http://www.woaidesign.com" target="_blank">陈义正工作室</a>
	    </span></div>
	</div>
  </body>
</html>
