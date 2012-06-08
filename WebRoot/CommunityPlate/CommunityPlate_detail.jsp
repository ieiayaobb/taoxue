<%@page contentType="text/html;charset=utf-8"%>
<%@include file="../../head.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>社团介绍－淘学520</title>
<script type="text/javascript">
	$(document).ready(function(){
		var communityInfos=${communityInfos};
		for(var i=0;i<communityInfos.length;i++){
			if(i%2==0){
				var li = "<li class=\"even\">"
			}else{
				var li = "<li class=\"odd\">"
			}
			li+="<a href=\"${path}/CommunityPlate/CommunityPlate!ToDetail.action?id="+communityInfos[i].id+"&type="+communityInfos[i].type+"\">"+communityInfos[i].name+"</a></li>"
			$("#listDemo").append(li);
		}
		var temp;
		$(".even,.odd,#listDemo2 li").mouseover(function(){
			if($(this).hasClass("even")){
				$(this).removeClass("even");
				$(this).addClass("hover");
				temp = 1;
			}else if($(this).hasClass("odd")){
				$(this).removeClass("odd");
				$(this).addClass("hover");
				temp = -1;
			}else{
				$(this).addClass("hover");
				temp = 0
			}
		});
		$(".even,.odd,.hover,#listDemo2 li").mouseout(function(){
			if(temp == 1){
				$(this).removeClass("hover");
				$(this).addClass("even");
			}else if(temp == -1){
				$(this).removeClass("hover");
				$(this).addClass("odd");
			}else{
				$(this).removeClass("hover");
			}
		})
		/*(function(){
		    var j, l = arguments.length;
		    for (j = 0; j < l; j++) {
		        (function(elems){
		            var elem = document.getElementById(elems[0]);
		            var rows = elem.getElementsByTagName(elems[1]), i, len = rows.length;
		            var lastClass = '';
		            if (elem && len > 1) {
		                for (var i = 0; i < len; i++) {
		                    rows[i].className = i % 2 == 0 ? 'even' : 'odd';
		                    rows[i].onmouseover = function(){
		                        lastClass = this.className;
		                        this.className = 'hover';
		                    };
		                    rows[i].onmouseout = function(){
		                        this.className = lastClass;
		                    };
		                }
		            }
		        })(arguments[j]);
		    }
		})(['listDemo','li'],['listDemo2','li']);*/
	})
</script>
</head>
<body>
<div class="Subs">
  <div class="S_left">
    <div class="s_l_BoxA">学生会</div>
    <div class="wrap">
      <ul id="listDemo">
      </ul>
    </div>
    <div class="s_l_BoxC">联系我们</div>
    <div class="wrap">
      <ul id="listDemo2">
        <li><a href="#">商家合作</a></li>
        <li><a href="#">社团合作</a></li>
      </ul>
    </div>
    <div class="QQ_call"><a href="#" class="Talk1"><span class="on_span">点击我在线交谈 QQ：458931193</span></a><a href="#" class="Talk2"><span>点击我在线交谈 QQ：458931193</span></a><a href="#" class="Talk3"><span>点击我在线交谈 QQ：458931193</span></a><a href="#" class="Talk4"><span>点击我在线交谈 QQ：458931193</span></a></div>
    <h2 class="QQ_num">15365031035</h2>
    <h4 class="QQ_time">AM 10:00 ~ PM 06:00</h4>
    <h4 class="QQ_wel">您好，欢迎您的致电，等待你的咨询</h4>
  </div>
  <div class="S_right">
    <div class="Positions">当前位置：<a href="#">校园资讯</a><a href="#">社团介绍</a><a href="#">学生会</a><span class="PTit">组织简介</span></div>
    <div class="Details">
      <div class="Dettail_txt"><img src="${path}/images/${img}" /><br />${detail}</div>
    </div>
  </div>
</body>
</html>
