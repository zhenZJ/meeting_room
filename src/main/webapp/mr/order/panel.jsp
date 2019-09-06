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
    <i class="Hui-iconfont">&#xe67f;</i> 会议安排 <span class="c-gray en">&gt;</span> 会议预定  <a
      class="btn btn-refresh radius r" style="line-height: 1.6em; margin-top: 3px" href="javascript:location.replace(location.href);" title="刷新"><i
      class="Hui-iconfont">&#xe68f;</i></a>
  </nav>
  <div class="page-container">
    <div class="cl pd-5 bg-1 bk-gray mt-20">
      <form id="panelForm" action="panel">
        <input type="hidden" name="date" value="${dateList[0]}" />
        <input type="hidden" name="dType" value="" />
        <span class="l">
          <a href="javascript:;" onclick="toSearch('1')" class="btn btn-primary radius">上周</a>
          <a href="javascript:;" onclick="toSearch('2')" class="btn btn-primary radius">本周</a>
          <a href="javascript:;" onclick="toSearch('3')" class="btn btn-primary radius">下周</a>
        </span>
      </form>
    </div>
    <div class="mt-20">
      <table class="table table-border table-bordered table-hover table-bg table-sort">
        <thead>
          <tr class="text-c">
            <th width="100">会议室</th>
            <c:forEach var="date" items="${dateList}" varStatus="dateStatus">
              <c:choose>
                <c:when test="${dateStatus.index >= 5}">
                  <th width="100" style='color:red;'>${date}(${weekName[dateStatus.index]})</th>
                </c:when>
                <c:otherwise>
                  <th width="100">${date}(${weekName[dateStatus.index]})</th>
                </c:otherwise>
              </c:choose>
            </c:forEach>
          </tr>
        </thead>
        <tbody>
          <c:if test="${!empty mrList}">
            <c:forEach var="room" items="${mrList}">
              <tr class="text-c">
                <td>${room.roomName }</td>
                <c:forEach var="date" items="${dateList}" varStatus="dateStatus">
                  <td>
                    <c:set var="key" value="${room.roomId }_${date }" />
                    <c:if test="${!empty orderMap[key]}">
                      <c:forEach var="order" items="${orderMap[key]}">
                        <c:set var="status" value="${order.statusId}"/>
                        <c:set var="color" value=""/>
                        <c:set var="onClickJs" value=""/>
                        <c:choose>
                          <c:when test="${status eq 1}">
                            <c:set var="color" value="#A9A9A9"/>
                            <c:if test="${sessionScope.user.userId eq order.userId}">
                              <c:set var="onClickJs" value="viewOrder(${order.orderId})"/>
                            </c:if>
                          </c:when>
                          <c:when test="${status eq 2}">
                            <c:set var="color" value="#A9A9A9"/>
                            <c:if test="${sessionScope.user.userId eq order.userId}">
                              <c:set var="onClickJs" value="viewOrder(${order.orderId})"/>
                            </c:if>
                          </c:when>
                          <c:when test="${status eq 3}">
                            <c:set var="color" value="#000000"/>
                            <c:if test="${sessionScope.user.userId eq order.userId}">
                              <c:set var="onClickJs" value="viewOrder(${order.orderId})"/>
                            </c:if>
                          </c:when>
                        </c:choose>
                        <div style='float:left;margin:1px 0px;padding:0px 0px 0px 5px;color:${color};<c:if test="${!empty onClickJs}">cursor: pointer;</c:if>' onclick="${onClickJs}" title="预定人：${order.user.userName}&#13;预定日期：<fmt:formatDate type="time" pattern="yyyy-MM-dd" value="${order.orderDate}" />&#13;开始时间：<fmt:formatDate type="time" pattern="HH:mm" value="${order.starDatePlan}" />&#13;结束时间：<fmt:formatDate type="time" pattern="HH:mm" value="${order.endDatePlan}" />&#13;会议说明：${order.description}">
                          <fmt:formatDate type="time" pattern="HH:mm" value="${order.starDatePlan}" />
                          -
                          <fmt:formatDate type="time" pattern="HH:mm" value="${order.endDatePlan}" /> ${order.user.userName}
                        </div>
                      </c:forEach>
                    </c:if>
                    <a style="text-decoration: none" onClick="orderRoom('预定会议室','order?roomId=${room.roomId}&orderDate=${date}','','560')" href="javascript:;" title="预定会议室"><i class="Hui-iconfont">+</i></a>
                  </td>
                </c:forEach>
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
      /*
      $('.table-sort').dataTable({
        "aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
        "bStateSave" : true,//状态保存
        "aoColumnDefs" : [
        //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
          {"orderable":false,"aTargets":[0,1,2,3,4,5,6,7]}// 制定列不参与排序
        ]
      });
      */
    });

    function orderRoom(title, url, w, h){
      layer_show(title, url, w, h);
    }
    function viewOrder(orderId){
      layer_show('查看会议', 'view?orderId=' + orderId , '', '560');
    }
    
    function toSearch(dType){
      $("input[name=dType]").val(dType);
      $("#panelForm").submit();
    }
  </script>
</body>
</html>