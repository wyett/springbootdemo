<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="wyett">
<link rel="icon" href="<%=request.getContextPath()%>/Images/favicon.ico">
<title>wyett blog</title>
<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/navbar-top-fixed/navbar-top-fixed.css"
	rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
		<a class="navbar-brand"
			href="<%=request.getContextPath()%>/home/index.html">wyett blog</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarCollapse" aria-controls="navbarCollapse"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarCollapse">
			<ul class="navbar-nav mr-auto">
				<li id="liHome" class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/home/index">Home </a></li>
				<li id="liBlog" class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/blog/index">blog</a></li>
                <li id="liBlog" class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/blog/index">About Me</a></li>
				<%
					if (session.getAttribute("UserName") != null) {
				%>
				<li id="liName" class="nav-item"><a class="nav-link"
					href="#"><%=session.getAttribute("UserName")%></a></li>
				<li id="liName" class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/account/logout">退出</a></li>
				<%
					} else {
						out.print("<li id=\"liName\" class=\"nav-item\"><a class=\"nav-link\" href=" + request.getContextPath()
								+ "/account/login" + ">登录</a></li>");
						out.print("<li id=\"liName\" class=\"nav-item\"><a class=\"nav-link\" href=" + request.getContextPath()
								+ "/account/register" + ">注册</a></li>");
					}
				%>
			</ul>
			<%
				//改变页面编码
				request.setCharacterEncoding("UTF-8");
				String keyword = request.getParameter("keyword");

				if (keyword != null && keyword != "") {
					//当关键字不为null的时候 记录到Session
					session.setAttribute("keyword", keyword);
				}
			%>
			<form class="form-inline my-2 my-lg-0"
				action="<%=request.getContextPath()%>/news/index.html" method="post">
				<input id="keyword" name="keyword" placeholder="关键字" value=""
					class="form-control mr-sm-2" type="text" />
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">搜索</button>
			</form>
		</div>
	</nav>