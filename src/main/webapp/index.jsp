<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>欢迎使用会议室预定管理系统</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="会议室预定管理系统" />
<style type="text/css">
label.error {
  right: 18px;
  color: #ef392b;
  font-size: 12px;
}
</style>
<script type="application/x-javascript">
  
addEventListener("load", function () {
  setTimeout(hideURLbar, 0);
}, false);
function hideURLbar() {
  window.scrollTo(0, 1);
}

</script>
<!-- Meta tag Keywords -->
<!-- css files -->
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<!-- Style-CSS -->
<link rel="stylesheet" href="css/font-awesome.css">
<!-- Font-Awesome-Icons-CSS -->
<!-- //css files -->
<!-- online-fonts -->
<link href="//fonts.googleapis.com/css?family=PT+Serif:400,400i,700,700i" rel="stylesheet">
<!-- //online-fonts -->
</head>

<body>
  <!--header-->
  <div class="header-w3l">
    <h1>会议室预定管理系统</h1>
  </div>
  <!--//header-->
  <div class="main-content-agile">
    <div class="sub-main-w3">
      <h2>Login</h2>
      <form action="/login" method="post">
        <label id="userName-error" class="error" for="userName" style="display: block;">${errorMessage}</label>
        <div class="pom-agile">
          <span class="fa fa-user" aria-hidden="true"></span> <input placeholder="账户" name="userAccount" class="user" type="text" required="" value="${userAccount}">
        </div>
        <div class="pom-agile">
          <span class="fa fa-key" aria-hidden="true"></span> <input placeholder="密码" name="userPwd" class="pass" type="password" required="">
        </div>
        <div class="sub-w3l">
          <div class="sub-agile">
          </div>
          <div class="clear"></div>
        </div>
        <div class="right-w3l">
          <input type="submit" value="Login">
        </div>
      </form>
    </div>
  </div>
  <!--//main-->
  <!--footer-->
  <div class="footer">
    <p>&copy; 2019 All rights reserved</p>
  </div>
  <!--//footer-->
</body>
</html>