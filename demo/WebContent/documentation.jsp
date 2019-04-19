<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Hashtable"%>
<%@page import="java.lang.reflect.Method"%>
<%@page import="ru.funsys.avalanche.a.A"%>
<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Демонстрационное приложение - HTTP</title>
</head>
<body>
<h1>Справочная информация</h1>
<p>
Справочная информация о функциональности системы
</p>
<jsp:useBean id='documentation' scope='application' class='ru.funsys.avalanche.d.A'/>

<h2>Приложения</h2>
<table>
<tr><th>Имя</th><th>Класс</th><th>Описание</th><th>Методы</th></tr>
<%
for (Enumeration<A> appDocs = documentation.a(); appDocs.hasMoreElements(); ) {
	A a = appDocs.nextElement();
	String className = a.getClassName();
	String name = a.getName();
	String description = a.getDescription();
	String doc = a.getDoc();
	String ext = a.getExt();
	String href = doc + '/' + className.replace('.', '/') + '.' + ext;
%>
	<tr><td><%= name %></td><td>
	<% if (doc == null) { %>
		<%= className %>
	<% } else { %>
		<a href="<%= href %>"><%= className %></a>
	<% } %>
	</td><td><%= description %></td><td>
	<%
	Hashtable<String, String> methods = a.getMethods();
	for (Enumeration<String> enumeration = methods.keys(); enumeration.hasMoreElements(); ) {
		String key = enumeration.nextElement();
		// Выделить имя метода
		int i = key.indexOf('-');
		String methodName = key.substring(0, i);
		String method = methods.get(key);
	%>
		<nobr><%= method.replaceFirst(className + '.' + methodName, "<a href=\"" + href + '#' + key + "\">" + methodName + "</a>") %></nobr><br>
	<% } %>
</td></tr>
<%
}
%>
</table>
	
<h2>Функции</h2>
<table>
<tr><th>Имя</th><th>Класс</th><th>Описание</th><th>Методы</th></tr>
<%
for (Enumeration<A> appDocs = documentation.b(); appDocs.hasMoreElements(); ) {
	A a = appDocs.nextElement();
	String className = a.getClassName();
	String name = a.getName();
	String description = a.getDescription();
	String doc = a.getDoc();
	String ext = a.getExt();
	String href = doc + '/' + className.replace('.', '/') + '.' + ext;
%>
	<tr><td><%= name %></td><td>
	<% if (doc == null) { %>
		<%= className %>
	<% } else { %>
		<a href="<%= href %>"><%= className %></a>
	<% } %>
	</td><td><%= description %></td><td>
	<%
	Hashtable<String, String> methods = a.getMethods();
	for (Enumeration<String> enumeration = methods.keys(); enumeration.hasMoreElements(); ) {
		String key = enumeration.nextElement();
		// Выделить имя метода
		int i = key.indexOf('-');
		String methodName = key.substring(0, i);
		String method = methods.get(key);
	%>
		<nobr><%= method.replaceFirst(className + '.' + methodName, "<a href=\"" + href + '#' + key + "\">" + methodName + "</a>") %></nobr><br>
	<% } %>
</td></tr>
<%
}
%>
</table>


</body>
</html>