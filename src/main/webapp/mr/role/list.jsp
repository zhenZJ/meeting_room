<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,role-scalable=no" />
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
    <i class="Hui-iconfont">&#xe67f;</i> 系统管理 <span class="c-gray en">&gt;</span> 角色管理  <a
      class="btn btn-refresh radius r" style="line-height: 1.6em; margin-top: 3px" href="javascript:location.replace(location.href);" title="刷新"><i
      class="Hui-iconfont">&#xe68f;</i></a>
  </nav>
  <div class="page-container">
    <div class="cl pd-5 bg-1 bk-gray mt-20">
      <span class="l">
<!--           <a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>  -->
        <a href="javascript:;" onclick="member_add('添加角色','add','500','200')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加角色</a>
      </span> 
      <span class="r">共有数据：<strong>${roleList.size()}</strong> 条</span>
    </div>
    <div class="mt-20">
      <table class="table table-border table-bordered table-hover table-bg table-sort">
        <thead>
          <tr class="text-c">
            <th width="100">角色名</th>
            <th width="130">创建时间</th>
            <th width="70">状态</th>
            <th width="200">备注</th>
            <th width="100">操作</th>
          </tr>
        </thead>
        <tbody>
          <c:if test="${!empty roleList }">
            <c:forEach var="role" items="${roleList }">
              <tr class="text-c">
                <td>${role.roleName }</td>
                <td><fmt:formatDate value="${role.createTime}" type="both" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                <td class="td-status">
                  <c:choose>
                    <c:when test="${role.enabled eq 1 }">
                      <span class="label label-success radius">已启用</span>
                    </c:when>
                    <c:otherwise>
                      <span class="label label-defaunt radius">已停用</span>
                    </c:otherwise>
                  </c:choose>
                </td>
                <td>${role.remark }</td>
                <td class="td-manage">
                  <c:choose>
                    <c:when test="${role.enabled eq 1 }">
                      <a style="text-decoration: none" onClick="member_stop(this,'${role.roleId}')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>
                    </c:when>
                    <c:otherwise>
                      <a style="text-decoration: none" onClick="member_start(this,'${role.roleId}')" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe631;</i></a>
                    </c:otherwise>
                  </c:choose>
                  <a title="编辑" href="javascript:;" onclick="member_edit('编辑','update?roleId=${role.roleId}','4','500','200')" class="ml-5" style="text-decoration: none"><i class="Hui-iconfont">&#xe6df;</i></a> 
                  <a title="删除" href="javascript:;" onclick="member_del(this,'${role.roleId}')" class="ml-5" style="text-decoration: none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
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
        "aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
        "bStateSave" : false,//状态保存
        "aoColumnDefs" : [
        //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
          {"orderable":false,"aTargets":[3,4]}// 制定列不参与排序
        ]
      });

    });
    /*角色-添加*/
    function member_add(title, url, w, h) {
      layer_show(title, url, w, h);
    }
    /*角色-查看*/
    function member_show(title, url, id, w, h) {
      layer_show(title, url, w, h);
    }
    /*角色-停用*/
    function member_stop(obj, id) {
      layer.confirm('确认要停用吗？',function(index) {
        var param = {"roleId":id,"enabled":0};
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

    /*角色-启用*/
    function member_start(obj, id) {
      layer.confirm('确认要启用吗？',function(index) {
        var param = {"roleId":id,"enabled":1};
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
    /*角色-编辑*/
    function member_edit(title, url, id, w, h) {
      layer_show(title, url, w, h);
    }
    /*密码-修改*/
    function change_password(title, url, id, w, h) {
      layer_show(title, url, w, h);
    }
    /*角色-删除*/
    function member_del(obj, id) {
      layer.confirm('确认要删除吗？', function(index) {
        $.ajax({
          type : 'POST',
          url : 'deleteAction',
          data: {"roleId":id},
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