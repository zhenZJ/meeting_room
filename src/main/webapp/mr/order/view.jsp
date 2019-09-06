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
<link rel="Bookmark" href="/favicon.ico">
<link rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
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
<!--/meta 作为公共模版分离出去-->

<title>添加用户</title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
  <article class="page-container">
    <form action="orderAction" method="post" class="form form-horizontal" id="form-member-add">
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3">预定人：</label>
        <div class="formControls col-xs-8 col-sm-9">
          ${order.user.userName}
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3">预定会议室：</label>
        <div class="formControls col-xs-8 col-sm-9">
          ${order.room.roomName }
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3">预定日期：</label>
        <div class="formControls col-xs-8 col-sm-9">
          <fmt:formatDate type="time" pattern="yyyy-MM-dd" value="${order.orderDate}" />
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3">预定时间：</label>
        <div class="formControls col-xs-8 col-sm-9">
          <fmt:formatDate type="time" pattern="HH:mm" value="${order.starDatePlan}" />~<fmt:formatDate type="time" pattern="HH:mm" value="${order.endDatePlan}" />
        </div>
      </div>
      <c:if test="${order.statusId eq 2 }">
        <div class="row cl">
          <label class="form-label col-xs-4 col-sm-3">实际时间：</label>
          <div class="formControls col-xs-8 col-sm-9">
            <fmt:formatDate type="time" pattern="HH:mm" value="${order.starDateActual}" />~<fmt:formatDate type="time" pattern="HH:mm" value="${order.endDateActual}" />
          </div>
        </div>
      </c:if>
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3">状态：</label>
        <div class="formControls col-xs-8 col-sm-9">
          <c:choose>
            <c:when test="${order.statusId eq 1 }">已提交</c:when>
            <c:when test="${order.statusId eq 2 }">已结束</c:when>
            <c:when test="${order.statusId eq 3 }">已撤销</c:when>
            <c:when test="${order.statusId eq 4 }">已删除</c:when>
          </c:choose>
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3">会议说明：</label>
        <div class="formControls col-xs-8 col-sm-9">
          ${order.description}
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3">备注：</label>
        <div class="formControls col-xs-8 col-sm-9">
          ${order.remark}
        </div>
      </div>
      <c:if test="${order.statusId eq 1 }">
        <div class="row cl">
          <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
            <input class="btn btn-primary radius" type="button" value="&nbsp;&nbsp;编辑&nbsp;&nbsp;" onclick="updateOrder(${order.orderId})">
            <input class="btn btn-primary radius" type="button" value="&nbsp;&nbsp;撤销&nbsp;&nbsp;" onclick="member_back(this,${order.orderId})">
            <input class="btn btn-primary radius" type="button" value="&nbsp;&nbsp;删除&nbsp;&nbsp;" onclick="member_del(this,${order.orderId})">
            <input class="btn btn-primary radius" type="button" value="&nbsp;&nbsp;结束会议&nbsp;&nbsp;" onclick="closeOrder(${order.orderId})">
          </div>
        </div>
      </c:if>
    </form>
  </article>

  <!--_footer 作为公共模版分离出去-->
  <script type="text/javascript" src="../../lib/jquery/1.9.1/jquery.min.js"></script>
  <script type="text/javascript" src="../../lib/layer/2.4/layer.js"></script>
  <script type="text/javascript" src="../../static/h-ui/js/H-ui.min.js"></script>
  <script type="text/javascript" src="../../static/h-ui.admin/js/H-ui.admin.js"></script>
  <!--/_footer 作为公共模版分离出去-->

  <!--请在下方写此页面业务相关的脚本-->
  <script type="text/javascript" src="../../lib/My97DatePicker/4.8/WdatePicker.js"></script>
  <script type="text/javascript" src="../../lib/jquery.validation/1.14.0/jquery.validate.js"></script>
  <script type="text/javascript" src="../../lib/jquery.validation/1.14.0/validate-methods.js"></script>
  <script type="text/javascript" src="../../lib/jquery.validation/1.14.0/messages_zh.js"></script>
  <script type="text/javascript">
      $(function() {
        $('.skin-minimal input').iCheck({
          checkboxClass : 'icheckbox-blue',
          radioClass : 'iradio-blue',
          increaseArea : '20%'
        });
      });
      function closeOrder(orderId){
        location.href="close?orderId=" + orderId;
      }
      function updateOrder(orderId){
        location.href="update?orderId=" + orderId;
      }
      // 撤销预定
      function member_back(obj, id) {
        layer.confirm('确认要撤销吗？', function(index) {
          $.ajax({
            type : 'POST',
            url : 'updateAction',
            data:{"orderId":id,"statusId":3},
            dataType : 'json',
            success : function(data) {
              location.href = location.href;
              layer.msg('已撤销!', {
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
      // 删除预定
      function member_del(obj, id) {
        layer.confirm('确认要删除吗？', function(index) {
          $.ajax({
            type : 'POST',
            url : 'updateAction',
            data:{"orderId":id,"statusId":4},
            dataType : 'json',
            success : function(data) {
              location.href = location.href;
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
  <!--/请在上方写此页面业务相关的脚本-->
</body>
</html>