<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="title" content="애플리케이션 제목">
    <meta name="application-name" content="애플리케이션 이름">
    <meta name="author" content="애플리케이션 제작자 이름">
    <meta name="description" content="애플리케이션 설명">
    <meta name="keywords" content="애플리케이션 검색어 열거">
    <meta property="og:url" content="애플리케이션 URL" />
    <meta property="og:type" content="website" />
    <meta property="og:title" content="애플리케이션 제목" />
    <meta property="og:description" content="애플리케이션 설명" />
    <meta property="og:image" content="애플리케이션 메인 이미지 경로" />

<title>테스트 추가</title>
</head>
<body>
	<h2>테스트 추가</h2>
	<hr>
	<form name="insert" action="insTestPro.do" method="post">
		<input type="text" name="title" id="title" placeholder="제목 입력"/><br>
		<button type="submit">추가</button>
	</form>
</body>
</html>