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
<title>title</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
  
  
  
</head>
<body>

<nav>
	<h2>01_Get 전송</h2>
	
	<ul>
		<li><a href="${path2 }/ajax/">Home</a></li>
	</ul>
	<button id="btn1" type="button">Get 전송</button>
	<script>
	$(document).redat(function(){
		var fn1 = () => $.ajax({
			type:"get",
			url:"${path2}/ajax/ajax1pro.do",
			success:function(data) { console.log("성공", data);},
			error:function(err) { console.log("실패", err);}
		});
		$("#btn1").on("click", function() { fn1(); });
	});
	
	</script>
	
</nav>

</body>
</html>