<!doctype html>
<html lang="en">
<#include "../common/head.ftl">
<body>
<div id="app" style="margin: 20px 20%">
    <form action="/sso/getOptCode" method="POST">
        请输入手机号码: +86<input name="telPhone" type="text" placeholder="手机号码"/>
        <input type="submit" value="获取注册码">
    </form>
</div>
</body>
</html>