<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="fn" uri ="http://java.sun.com/jsp/jstl/functions"  %>
<%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Java 문자열 검색 </p>
	<p>Hello, Java Server Pages! =>
		${fn:contains("Hello, Java Server Pages!", "java") }</p>
	<p>hello, java server Pages! =>
		${fn:contains("hello, java server pages!", "JAVA") }</p>
	
	<hr>
	
	<c:set var="texts" value="${fn:split('hello, java server pages!', ' ') }" />
	<c:forEach var"i" begin="0" end = "${fn:length(texts)-1 }">
		<p>text[${i}] = ${texts[i]}</p>
	</c:forEach>
	<p><c:out value="${fn:join(texts, '*')}" /></p>
	   
</body>
</html>