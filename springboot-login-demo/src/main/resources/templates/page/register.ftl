<!doctype html>
<html lang="utf-8">
<#include "../common/head.ftl">
<body>
<div id="app" style="margin: 20px 20%">
	<form action="/sso/register" method="post">
		用户名<input type="text" name="username" placeholder="用户名"/>
		密码<input type="password" name="password" placeholder="密码"/>
		电话号码<input type="text" name="phone" placeholder="手机号码"/>
		验证码<input type="text" name="optCode" placeholder="注册码"/>
		<input type="submit" value="注册">
	</form>
</div>
</body>
</html>