<%@ page import="ru.funsys.demo.avalanche.DemoApplication"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Демонстрационное приложение - HADR интерфейс</title>
</head>
<body>
<h1>Демонстрационное приложение - HADR интерфейс</h1>
<p>
Использование HADR интерфейса
</p>
<jsp:useBean id='HADRApp' scope='application' class='ru.funsys.demo.avalanche.DemoApplication'/>

<%= HADRApp.getInfo(true) %>

</body>
</html>