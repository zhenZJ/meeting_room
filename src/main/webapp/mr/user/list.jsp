<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="../../lib/html5shiv.js"></script>
<script type="text/javascript" src="../../lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="../../static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="../../static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="../../lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="../../static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="../../static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="../../lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>系统管理</title>
</head>
<body>
  <nav class="breadcrumb">
    <i class="Hui-iconfont">&#xe67f;</i> 系统管理 <span class="c-gray en">&gt;</span> 用户管理  <a
      class="btn btn-refresh radius r" style="line-height: 1.6em; margin-top: 3px" href="javascript:location.replace(location.href);" title="刷新"><i
      class="Hui-iconfont">&#xe68f;</i></a>
  </nav>
  <div class="page-container">
    <form method="post" action="/list">
      <div class="text-c">
        日期范围： <input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" class="input-text Wdate"
          style="width: 120px;" name="minDate" value="${param.minDate }"> - <input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })"
          id="datemax" class="input-text Wdate" style="width: 120px;" name="maxDate" value="${param.maxDate}"> <input type="text" class="input-text" style="width: 250px"
          placeholder="输入用户名称" id="" name="searchParam" value="${param.searchParam}">
        <button type="submit" class="btn btn-success radius" formmethod="post" formaction="list">
          <i class="Hui-iconfont">&#xe665;</i> 搜用户
        </button>
      </div>
    </form>
    <div class="cl pd-5 bg-1 bk-gray mt-20">
      <span class="l">
<!--           <a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>  -->
        <a href="javascript:;" onclick="member_add('添加用户','add','','560')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a>
      </span> 
      <span class="r">共有数据：<strong>${userList.size()}</strong> 条</span>
    </div>
    <div class="mt-20">
      <table class="table table-border table-bordered table-hover table-bg table-sort">
        <thead>
          <tr class="text-c">
            <th width="25"><input type="checkbox" name="" value=""></th>
            <th width="100">姓名</th>
            <th width="100">账户</th>
            <th width="90">角色</th>
            <th width="40">性别</th>
            <th width="90">手机</th>
            <th width="150">邮箱</th>
            <th width="130">创建时间</th>
            <th width="70">状态</th>
            <th width="100">操作</th>
          </tr>
        </thead>
        <tbody>
          <c:if test="${!empty userList }">
            <c:forEach var="user" items="${userList }">
              <tr class="text-c">
                <td><input type="checkbox" value="${user.userId }" name=""></td>
                <td>${user.userName }</td>
                <td>${user.userAccount }</td>
                <td>${user.role.roleName }</td>
                <td>${user.sex }</td>
                <td>${user.phone }</td>
                <td>${user.email }</td>
                <td><fmt:formatDate value="${user.createTime}" type="both" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                <td class="td-status">
                  <c:choose>
                    <c:when test="${user.enabled eq 1 }">
                      <span class="label label-success radius">已启用</span>
                    </c:when>
                    <c:otherwise>
                      <span class="label label-defaunt radius">已停用</span>
                    </c:otherwise>
                  </c:choose>
                </td>
                <td class="td-manage">
                  <c:choose>
                    <c:when test="${user.enabled eq 1 }">
                      <a style="text-decoration: none" onClick="member_stop(this,'${user.userId}')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>
                    </c:when>
                    <c:otherwise>
                      <a style="text-decoration: none" onClick="member_start(this,'${user.userId}')" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe631;</i></a>
                    </c:otherwise>
                  </c:choose>
                  <a title="编辑" href="javascript:;" onclick="member_edit('编辑','update?userId=${user.userId}','4','','560')" class="ml-5" style="text-decoration: none"><i class="Hui-iconfont">&#xe6df;</i></a> 
                  <a style="text-decoration: none" class="ml-5" onClick="change_password('修改密码','changePwd?userId=${user.userId}','10001','600','270')" href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i></a> 
                  <a title="删除" href="javascript:;" onclick="member_del(this,'${user.userId}')" class="ml-5" style="text-decoration: none"><i class="Hui-iconfont">&#xe6e2;</i></a>
                </td>
              </tr>
            </c:forEach>
          </c:if>
        </tbody>
      </table>
    </div>
  </div>
  <!--_footer 作为公共模版分离出去-->
  <script type="text/javascript" src="../../lib/jquery/1.9.1/jquery.min.js"></script>
  <script type="text/javascript" src="../../lib/layer/2.4/layer.js"></script>
  <script type="text/javascript" src="../../static/h-ui/js/H-ui.min.js"></script>
  <script type="text/javascript" src="../../static/h-ui.admin/js/H-ui.admin.js"></script>
  <!--/_footer 作为公共模版分离出去-->

  <!--请在下方写此页面业务相关的脚本-->
  <script type="text/javascript" src="../../lib/My97DatePicker/4.8/WdatePicker.js"></script>
  <script type="text/javascript" src="../../lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
  <script type="text/javascript" src="../../lib/laypage/1.2/laypage.js"></script>
  <script type="text/javascript">
    $(function() {
      $('.table-sort').dataTable({
        "aaSorting" : [ [ 2, "desc" ] ],//默认第几个排序
        "bStateSave" : false,//状态保存
        "aoColumnDefs" : [
        //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
          {"orderable":false,"aTargets":[0,1,9]}// 制定列不参与排序
        ]
      });

    });
    /*用户-添加*/
    function member_add(title, url, w, h) {
      layer_show(title, url, w, h);
    }
    /*用户-查看*/
    function member_show(title, url, id, w, h) {
      layer_show(title, url, w, h);
    }
    /*用户-停用*/
    function member_stop(obj, id) {
      layer.confirm('确认要停用吗？',function(index) {
        var param = {"userId":id,"enabled":0};
        $.ajax({
          type : 'POST',
          url : 'enabledAction',
          dataType : 'json',
          contentType : 'application/json',
          data:JSON.stringify(param),
          success : function(data) {
            $(obj).parents("tr").find(".td-manage")
                .prepend('<a style="text-decoration:none" onClick="member_start(this,'+id+')" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
            $(obj).remove();
            layer.msg('已停用!', {
              icon : 5,
              time : 1000
            });
          },
          error : function(data) {
            console.log(data.msg);
          },
        });
      });
    }

    /*用户-启用*/
    function member_start(obj, id) {
      layer.confirm('确认要启用吗？',function(index) {
        var param = {"userId":id,"enabled":1};
        $.ajax({
          type : 'POST',
          url : 'enabledAction',
          dataType : 'json',
          contentType : 'application/json',
          data:JSON.stringify(param),
          success : function(data) {
            $(obj)
                .parents("tr")
                .find(".td-manage")
                .prepend(
                    '<a style="text-decoration:none" onClick="member_stop(this,'+id+')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
            $(obj).remove();
            layer.msg('已启用!', {
              icon : 6,
              time : 1000
            });
          },
          error : function(data) {
            console.log(data.msg);
          },
        });
      });
    }
    /*用户-编辑*/
    function member_edit(title, url, id, w, h) {
      layer_show(title, url, w, h);
    }
    /*密码-修改*/
    function change_password(title, url, id, w, h) {
      layer_show(title, url, w, h);
    }
    /*用户-删除*/
    function member_del(obj, id) {
      layer.confirm('确认要删除吗？', function(index) {
        $.ajax({
          type : 'POST',
          url : 'deleteAction',
          data:{"userId":id},
          dataType : 'json',
          success : function(data) {
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {
              icon : 1,
              time : 1000
            });
          },
          error : function(data) {
            console.log(data);
            console.log(data.msg);
          },
        });
      });
    }
  </script>
</body>
</html>