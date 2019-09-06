<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>用户明细</title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
  <div class="pd-20">
    <table class="table">
      <tbody>
        <tr>
          <th class="text-r" width="80">角色：</th>
          <td>${requestScope.user.role.roleName }</td>
        </tr>
        <tr>
          <th class="text-r" width="80">姓名：</th>
          <td>${requestScope.user.userName }</td>
        </tr>
        <tr>
          <th class="text-r" width="80">性别：</th>
          <td>${requestScope.user.sex }</td>
        </tr>
        <tr>
          <th class="text-r">用户名：</th>
          <td>${requestScope.user.userAccount}</td>
        </tr>
        <tr>
          <th class="text-r">手机：</th>
          <td>${requestScope.user.phone}</td>
        </tr>
        <tr>
          <th class="text-r">邮箱：</th>
          <td>${requestScope.user.email}</td>
        </tr>
        <tr>
          <th class="text-r">状态：</th>
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
        </tr>
      </tbody>
    </table>
  </div>
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

        $("#form-member-add").validate({
          rules : {
            userName : {
              required : true,
              minlength : 2,
              maxlength : 16
            },
            userAccount : {
              required : true,
              minlength : 2,
              maxlength : 16
            },
            sex : {
              required : true
            },
            phone : {
              required : true,
              isMobile : true
            },
            email : {
              required : true,
              email : true
            }
          },
          onkeyup : false,
          focusCleanup : true,
          success : "valid",
          submitHandler : function(form) {
            var options = {
              success : function(data) {
                var index = parent.layer.getFrameIndex(window.name);
                //parent.$('.btn-refresh').click();
                parent.location.href = parent.location.href;
                parent.layer.close(index);
              }
            }
            $(form).ajaxSubmit(options);
          }
        });
      });
    </script>
  <!--/请在上方写此页面业务相关的脚本-->
</body>
</html>