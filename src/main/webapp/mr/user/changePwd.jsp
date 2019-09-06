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
<link rel="Bookmark" href="favicon.ico" >
<link rel="Shortcut Icon" href="favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="../../lib/html5.js"></script>
<script type="text/javascript" src="../../lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="../../static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="../../static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="../../lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="../../static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="../../static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>修改密码 - 用户管理 </title>
<meta name="keywords" content="会议管理系统">
<meta name="description" content="会议管理系统">
</head>
<body>
<article class="cl pd-20">
  <form action="changePwdAction" method="post" class="form form-horizontal" id="form-change-password">
    <div class="row cl">
      <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>账户：</label>
      <div class="formControls col-xs-8 col-sm-9">${user.userName}</div>
      <input type="hidden" name="userId" value="${user.userId }" />
    </div>
    <div class="row cl">
      <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>新密码：</label>
      <div class="formControls col-xs-8 col-sm-9">
        <input type="password" class="input-text" autocomplete="off" placeholder="请输入密码" name="userPwd" id="newpassword">
      </div>
    </div>
    <div class="row cl">
      <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>确认密码：</label>
      <div class="formControls col-xs-8 col-sm-9">
        <input type="password" class="input-text" autocomplete="off" placeholder="请再次输入密码" name="newpassword2" id="new-password2">
      </div>
    </div>
    <div class="row cl">
      <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
        <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;保存&nbsp;&nbsp;">
      </div>
    </div>
  </form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="../../lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="../../lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="../../static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="../../static/h-ui.admin/js/H-ui.admin.page.js"></script> 
<!--/_footer /作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="../../lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="../../lib/jquery.validation/1.14.0/messages_zh.js"></script> 
<script type="text/javascript">
$(function(){
  $("#form-change-password").validate({
    rules:{
      newpassword:{
        required:true,
        minlength:6,
        maxlength:16
      },
      newpassword2:{
        required:true,
        minlength:6,
        maxlength:16,
        equalTo: "#newpassword",
      },
    },
    messages:{
      newpassword2:{
        equalTo : "两次输入的密码不一致"
      }
    },
    onkeyup:false,
    focusCleanup:true,
    success:"valid",
    submitHandler:function(form){
      $(form).ajaxSubmit();
      var index = parent.layer.getFrameIndex(window.name);
      //parent.$('.btn-refresh').click();
      //parent.layer.close(index);
      parent.location.href = parent.location.href;
      parent.layer.close(index);
      layer.msg('修改成功!', {
        icon : 5,
        time : 1000
      });
    }
  });
});
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>