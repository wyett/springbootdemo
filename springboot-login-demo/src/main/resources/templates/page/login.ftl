<!doctype html>
<html lang="utf-8">
<#include "../common/head.ftl">
<body>
<div id="app" style="margin: 20px 20%">
	<form action="/sso/login" method="post">
		用户名<input type="text" name="username" placeholder="用户名"/>
		密码<input type="password" name="password" placeholder="密码"/>
		<input type="submit" value="登录">
	</form>
</div>
</body>
</html>