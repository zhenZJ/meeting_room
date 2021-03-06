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

<title>添加用户</title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
  <article class="page-container">
    <form action="updateAction" method="post" class="form form-horizontal" id="form-member-add">
      <input type="hidden" name="userId" value="${user.userId }" />
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>姓名：</label>
        <div class="formControls col-xs-8 col-sm-9">
          <input type="text" class="input-text" value="${user.userName}" placeholder="" id="userName" name="userName">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>账户：</label>
        <div class="formControls col-xs-8 col-sm-9">
          <input type="text" class="input-text" value="${user.userAccount}" placeholder="" id="userAccount" name="userAccount">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>角色：</label>
        <div class="formControls col-xs-8 col-sm-9 skin-minimal">
          <c:if test="${!empty roleList}">
            <c:forEach var="role" items="${roleList }" varStatus="varStatus">
              <div class="radio-box">
                <input name="roleId" type="radio" id="sex-${role.roleId}" value="${role.roleId }" <c:if test="${role.roleId eq user.roleId or (empty user.roleId and role.roleId == 2) }">checked</c:if>  > <label for="sex-1">${role.roleName }</label>
              </div>
            </c:forEach>
          </c:if>
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>性别：</label>
        <div class="formControls col-xs-8 col-sm-9 skin-minimal">
          <div class="radio-box">
            <input name="sex" type="radio" id="sex-1" value="男" checked> <label for="sex-1">男</label>
          </div>
          <div class="radio-box">
            <input type="radio" id="sex-2" name="sex" value="女"> <label for="sex-2">女</label>
          </div>
          <div class="radio-box">
            <input type="radio" id="sex-3" name="sex" value="保密"> <label for="sex-3">保密</label>
          </div>
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>手机：</label>
        <div class="formControls col-xs-8 col-sm-9">
          <input type="text" class="input-text" value="${user.phone}" placeholder="" id="phone" name="phone">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>邮箱：</label>
        <div class="formControls col-xs-8 col-sm-9">
          <input type="text" class="input-text" value="${user.email }" placeholder="@" name="email" id="email">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3">备注：</label>
        <div class="formControls col-xs-8 col-sm-9">
          <textarea name="remark" cols="" rows="" class="textarea" placeholder="说点什么...最少输入10个字符" onKeyUp="$.Huitextarealength(this,100)">${user.remark}</textarea>
          <p class="textarea-numberbar">
            <em class="textarea-length">0</em>/100
          </p>
        </div>
      </div>
      <div class="row cl">
        <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
          <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
        </div>
      </div>
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
                if(data.success == 'true'){
                  var index = parent.layer.getFrameIndex(window.name);
                  //parent.$('.btn-refresh').click();
                  parent.location.href = parent.location.href;
                  parent.layer.close(index);
                }else{
                  $("#userAccount").addClass("error");
                  $("#userAccount-error").text("账户已存在，请重新输入。");
                }
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