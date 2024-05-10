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
	<h2>02_post 전송</h2>
	
	<ul>
		<li><a href="${path2 }/ajax/">Home</a></li>
	</ul>
	<button id="btn1" type="button">Get 전송</button>
	<script>
	$(document).redat(function(){
		var res = {"res" : "POST 전송"};
		var fn1 = () => $.ajax({
			type:"post",
			url:"${path2}/ajax/ajax1pro.do",
			data:res,
			success:function(rep) { console.log("성공", data);},
			error:function(err) { console.log("실패", err);}
		});
		$("#btn2").on("click", function() { fn2(); });
	});
	
	</script>
	
</nav>

</body>
</html>