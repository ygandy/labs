<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%--
	On this page the user can choose to view movies or categories.
	
	Model: none
 --%>
<html>
<head>
	<title>Home</title>
	<%-- <link href="<c:url value="/resources/main.css"/>" rel="stylesheet"/>--%>
</head>
<body>

<h1>
	Welcome.
</h1>

<a href="<c:url value="/movies"/>">Movies</a>
<a href="<c:url value="/categories"/>">Categories</a>
</body>
</html>
