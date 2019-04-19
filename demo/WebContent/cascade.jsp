<%@ page import="ru.funsys.demo.avalanche.DemoApplication"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Демонстрационное приложение - каскадный вызов функций</title>
</head>
<body>
<h1>Демонстрационное приложение - каскадный вызов функций</h1>
<p>
Каскадный вызов функций. Повторные запросы этой страницы будут приводить к вызову функции getInfo() c
другого сервера.
</p>

<jsp:useBean id='CascadeApp' scope='application' class='ru.funsys.demo.avalanche.DemoApplication'/>

<%= CascadeApp.getInfo(true) %>

</body>
</html>