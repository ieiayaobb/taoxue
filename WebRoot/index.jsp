<%@page contentType="text/html;charset=utf-8"%>
<%@include file="head.jsp" %>
<html>
<head>
<title>淘学520</title>
</head>
<body>
<script type="text/javascript" src="js/swfobject.js"></script>
<script type="text/javascript">			
			var flashvars = {};
			flashvars.xml =  "config.xml";
			var params = {};
			params.allowscriptaccess = "always";
			params.allownetworking = "all";
			params.wmode = "transparent";
			var attributes = {};
			attributes.id = "slider";
			swfobject.embedSWF("cu3er.swf", "cu3er_swf", "960", "360", "9", flashvars, params, attributes);
	</script>
<div class="Banners960">
  <div id="cu3er_swf"></div>
</div>
<div class="Main_show"><img src="images/main_show.jpg" border="0" usemap="#Map" />
  <map name="Map" id="Map">
    <area shape="rect" coords="112,46,185,71" href="#" alt="新生须知" />
    <area shape="rect" coords="111,73,185,98" href="#" alt="社团介绍" />
    <area shape="rect" coords="111,99,185,123" href="#" alt="活动汇总" />
    <area shape="rect" coords="111,18,185,44" href="#" alt="校园资讯" />
    <area shape="rect" coords="301,17,373,42" href="#" alt="校园服务" />
    <area shape="rect" coords="301,45,373,70" href="#" alt="考试报名" />
    <area shape="rect" coords="301,73,372,98" href="#" alt="考试信息" />
    <area shape="rect" coords="300,100,370,123" href="#" alt="快递服务" />
    <area shape="rect" coords="495,16,569,43" href="#" alt="学习资料" />
    <area shape="rect" coords="495,46,569,70" href="#" alt="高等数学" />
    <area shape="rect" coords="495,73,568,98" href="#" alt="大学英语" />
    <area shape="rect" coords="495,100,568,123" href="#" alt="考研资料" />
    <area shape="rect" coords="688,17,761,43" href="#" alt="校园公益" />
    <area shape="rect" coords="688,46,761,71" href="#" alt="公益热点" />
    <area shape="rect" coords="688,73,761,98" href="#" alt="校内公益" />
    <area shape="rect" coords="689,100,762,124" href="#" alt="校外公益" />
    <area shape="rect" coords="884,17,955,45" href="#" alt="联系我们" />
    <area shape="rect" coords="884,46,955,70" href="#" alt="活动推广" />
    <area shape="rect" coords="884,72,956,98" href="#" alt="商家合作" />
    <area shape="rect" coords="884,100,956,124" href="#" alt="社团合作" />
  </map>
</div>

</body>
</html>
