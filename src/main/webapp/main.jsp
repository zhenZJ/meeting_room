<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico">
<link rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>会议室预定管理系统</title>
<meta name="keywords" content="会议室预定系统">
<meta name="description" content="会议室预定系统。">
</head>
<body>
  <header class="navbar-wrapper">
    <div class="navbar navbar-fixed-top">
      <div class="container-fluid cl">
        <a class="logo navbar-logo f-l mr-10 hidden-xs" href="#">会议室预定管理系统</a> <span class="logo navbar-slogan f-l mr-10 hidden-xs"></span> <a
          aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
        <nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
          <ul class="cl">
            <li>${sessionScope.user.role.roleName}</li>
            <li class="dropDown dropDown_hover"><a href="#" class="dropDown_A">${sessionScope.user.userName}<i class="Hui-iconfont">&#xe6d5;</i></a>
              <ul class="dropDown-menu menu radius box-shadow">
                <li><a href="#" onclick="myselfInfo(${sessionScope.user.userId})">个人信息</a></li>
                <li><a href="#" onclick="changePwd(${sessionScope.user.userId})">修改密码</a></li>
                <li><a href="#" onclick="loginOut()">退出</a></li>
              </ul></li>
            <!-- <li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li> -->
            <li id="Hui-skin" class="dropDown right dropDown_hover"><a href="javascript:;" class="dropDown_A" title="换肤"><i
                class="Hui-iconfont" style="font-size: 18px">&#xe62a;</i></a>
              <ul class="dropDown-menu menu radius box-shadow">
                <li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
                <li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
                <li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
                <li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
                <li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
                <li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
              </ul></li>
          </ul>
        </nav>
      </div>
    </div>
  </header>
  <aside class="Hui-aside">
    <div class="menu_dropdown bk_2">
      <c:if test="${sessionScope.user.role.roleId eq 2 }">
        <dl id="menu-admin">
          <dt>
            <i class="Hui-iconfont">&#xe623;</i> 会议预定信息<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
          </dt>
          <dd>
            <ul>
              <li><a data-href="/mr/meetingRoom/list-view" data-title="会议室管理" href="javascript:void(0)">会议室查询</a></li>
              <li><a data-href="/mr/order/list" data-title="会议室使用情况" href="javascript:void(0)">会议室使用情况</a></li>
            </ul>
          </dd>
        </dl>
        <dl id="menu-member">
          <dt>
            <i class="Hui-iconfont">&#xe692;</i> 会议安排<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
          </dt>
          <dd>
            <ul>
              <li><a data-href="/mr/order/panel" data-title="会议室看板" href="javascript:;">会议室预定</a></li>
            </ul>
          </dd>
        </dl>
        <dl id="menu-member">
          <dt>
            <i class="Hui-iconfont">&#xe687;</i> 待开会议<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
          </dt>
          <dd>
            <ul>
              <li><a data-href="/mr/order/list-future" data-title="待开会议" href="javascript:;">待开会议</a></li>
            </ul>
          </dd>
        </dl>
        <dl id="menu-member">
          <dt>
            <i class="Hui-iconfont">&#xe637;</i> 已开会议<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
          </dt>
          <dd>
            <ul>
              <li><a data-href="/mr/order/list-gone" data-title="已开会议" href="javascript:;">已开会议</a></li>
            </ul>
          </dd>
        </dl>
      </c:if>
      <c:if test="${sessionScope.user.role.roleId eq 1 }">
        <dl id="menu-system">
          <dt>
            <i class="Hui-iconfont">&#xe63c;</i> 系统管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
          </dt>
          <dd>
            <ul>
              <li><a data-href="/mr/user/list" data-title="用户管理" href="javascript:;">用户管理</a></li>
              <li><a data-href="/mr/role/list" data-title="角色管理" href="javascript:;">角色管理</a></li>
              <li><a data-href="/mr/meetingRoom/list" data-title="会议室管理" href="javascript:;">会议室管理</a></li>
            </ul>
          </dd>
        </dl>
      </c:if>
    </div>
  </aside>
  <div class="dislpayArrow hidden-xs">
    <a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a>
  </div>
  <section class="Hui-article-box">
    <div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
      <div class="Hui-tabNav-wp">
        <ul id="min_title_list" class="acrossTab cl">
          <li class="active"><span title="我的桌面" data-href="welcome.html">我的桌面</span> <em></em></li>
        </ul>
      </div>
      <div class="Hui-tabNav-more btn-group">
        <a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a
          id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a>
      </div>
    </div>
    <div id="iframe_box" class="Hui-article">
      <div class="show_iframe">
        <div style="display: none" class="loading"></div>
        <iframe scrolling="yes" frameborder="0" src="welcome.jsp"></iframe>
      </div>
    </div>
  </section>

  <div class="contextMenu" id="Huiadminmenu">
    <ul>
      <li id="closethis">关闭当前</li>
      <li id="closeall">关闭全部</li>
    </ul>
  </div>
  <!--_footer 作为公共模版分离出去-->
  <script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
  <script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
  <script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
  <script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
  <!--/_footer 作为公共模版分离出去-->

  <!--请在下方写此页面业务相关的脚本-->
  <script type="text/javascript" src="lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
  <script type="text/javascript">
      $(function() {
        /*$("#min_title_list li").contextMenu('Huiadminmenu', {
          bindings: {
            'closethis': function(t) {
              console.log(t);
              if(t.find("i")){
                t.find("i").trigger("click");
              }    
            },
            'closeall': function(t) {
              alert('Trigger was '+t.id+'\nAction was Email');
            },
          }
        });*/
      });
      /*个人信息*/
      function changePwd(userId) {
        layer_show("修改密码", '/mr/user/changePwd?userId=' + userId, 600, 270);
      }
      function myselfInfo(userId) {
        layer_show("个人信息", '/mr/user/detail?userId=' + userId, 300, 400);
      }

      /*资讯-添加*/
      function article_add(title, url) {
        var index = layer.open({
          type : 2,
          title : title,
          content : url
        });
        layer.full(index);
      }
      /*图片-添加*/
      function picture_add(title, url) {
        var index = layer.open({
          type : 2,
          title : title,
          content : url
        });
        layer.full(index);
      }
      /*产品-添加*/
      function product_add(title, url) {
        var index = layer.open({
          type : 2,
          title : title,
          content : url
        });
        layer.full(index);
      }
      /*用户-添加*/
      function member_add(title, url, w, h) {
        layer_show(title, url, w, h);
      }
      function loginOut() {
        layer.confirm('您确认要退出吗？', function(index) {
          location.href = "/logout";
        });
      }
    </script>
</body>
</html>