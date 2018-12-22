<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
</head>
<body>
	<h1>基于@ControllerAdvice的所有显示的例子：</h1>
	<h3><a href="Advice/daoSqlEx">处理dao层中抛出的数据库异常</a></h3>
	<h3><a href="Advice/daoParaEx">处理dao层中抛出的参数异常</a></h3>
	<h3><a href="Advice/daoMyEx">处理dao层中抛出的自定义异常</a></h3>
	
	<h3><a href="Advice/serviceBusyEx">处理service层中抛出的业务逻辑异常</a></h3>
	<h3><a href="Advice/serviceParaEx">处理service层中抛出的参数异常</a></h3>
	<h3><a href="Advice/serviceMyEx">处理service层中抛出的自定义异常</a></h3>
	
	<h3><a href="Advice/controllerBusyEx">处理controller层中抛出的业务逻辑异常</a></h3>
	<h3><a href="Advice/controllerParaEx">处理controller层中抛出的参数异常</a></h3>
	<h3><a href="Advice/controllerMyEx">处理controller层中抛出的自定义异常</a></h3>
	
	<hr>
	<hr>
	<h1>基于@ExceptionHander的所有显示的例子：</h1>
	<h3><a href="Hander/daoSqlEx">处理dao层中抛出的数据库异常</a></h3>
	<h3><a href="Hander/daoParaEx">处理dao层中抛出的参数异常</a></h3>
	<h3><a href="Hander/daoMyEx">处理dao层中抛出的自定义异常</a></h3>
	
	<h3><a href="Hander/serviceBusyEx">处理service层中抛出的业务逻辑异常</a></h3>
	<h3><a href="Hander/serviceParaEx">处理service层中抛出的参数异常</a></h3>
	<h3><a href="Hander/serviceMyEx">处理service层中抛出的自定义异常</a></h3>
	
	<h3><a href="Hander/controllerBusyEx">处理controller层中抛出的业务逻辑异常</a></h3>
	<h3><a href="Hander/controllerParaEx">处理controller层中抛出的参数异常</a></h3>
	<h3><a href="Hander/controllerMyEx">处理controller层中抛出的自定义异常</a></h3>
</body>
</html>