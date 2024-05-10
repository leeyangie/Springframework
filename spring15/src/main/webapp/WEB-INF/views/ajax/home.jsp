<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax 메인 페이지</title>
</head>
<body>
	<h2>Ajax 메인</h2>
	<hr>
	<a href="${path2 }/sample/list.do">샘플 목록</a>	
	<ul>
		<li><a href="${path2 }/ajax/api1.do">api1 테스트</a></li>
		<li><a href="${path2 }/ajax/api2.do">api2 테스트</a></li>
		<li><a href="${path2 }/ajax/api3.do">api3 테스트</a></li>
		<li><a href="${path2 }/ajax/api4.do">api4 테스트</a></li>
		<li><a href="${path2 }/ajax/api5.do">api5 테스트</a></li>
		<li><a href="${path2 }/ajax/api6.do">api6 테스트</a></li>
		<li><a href="${path2 }/ajax/api7.do">api7 테스트</a></li>
		<li><a href="${path2 }/ajax/api8.do">api8 테스트</a></li>
		<li><a href="${path2 }/ajax/api9.do">api9 테스트</a></li>
		<li><a href="${path2 }/ajax/api10.do">api10 테스트</a></li>
		
	
	</ul>
</body>
</html>