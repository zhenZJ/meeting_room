<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,order-scalable=no" />
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
<title>会议查询</title>
</head>
<body>
  <nav class="breadcrumb">
    <i class="Hui-iconfont">&#xe67f;</i> 会议查询 <span class="c-gray en">&gt;</span> 会议使用情况  <a
      class="btn btn-refresh radius r" style="line-height: 1.6em; margin-top: 3px" href="javascript:location.replace(location.href);" title="刷新"><i
      class="Hui-iconfont">&#xe68f;</i></a>
  </nav>
  <div class="page-container">
    <div class="mt-20">
      <table class="table table-border table-bordered table-hover table-bg table-sort">
        <thead>
          <tr class="text-c">
            <th width="90">预定时间</th>
            <th width="100">预定人</th>
            <th width="100">预定会议室</th>
            <th width="90">计划时间</th>
            <th width="90">实际时间</th>
            <th width="90">创建时间</th>
            <th width="70">状态</th>
            <th width="40">会议说明</th>
            <th width="90">备注</th>
          </tr>
        </thead>
        <tbody>
          <c:if test="${!empty orderList }">
            <c:forEach var="order" items="${orderList }">
              <tr class="text-c">
                <td><fmt:formatDate type="time" pattern="yyyy-MM-dd" value="${order.orderDate}" /></td>
                <td>${order.user.userName }</td>
                <td>${order.room.roomName }</td>
                <td>
                  <fmt:formatDate type="time" pattern="HH:mm" value="${order.starDatePlan}" />~<fmt:formatDate type="time" pattern="HH:mm" value="${order.endDatePlan}" />
                </td>
                <td>
                  <fmt:formatDate type="time" pattern="HH:mm" value="${order.starDateActual}" />~<fmt:formatDate type="time" pattern="HH:mm" value="${order.endDateActual}" />
                </td>
                <td><fmt:formatDate value="${order.createTime}" type="both" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                <td class="td-status">
                  <c:choose>
                    <c:when test="${order.statusId eq 1 }">已提交</c:when>
                    <c:when test="${order.statusId eq 2 }">已结束</c:when>
                    <c:when test="${order.statusId eq 3 }">已撤销</c:when>
                    <c:when test="${order.statusId eq 4 }">已删除</c:when>
                  </c:choose>
                </td>
                <td>${order.description }</td>
                <td>${order.remark }</td>
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
          {"orderable":false,"aTargets":[7,8]}// 制定列不参与排序
        ]
      });
    });
  </script>
</body>
</html>