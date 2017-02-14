<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<html>
<head>
<link rel="stylesheet" href="./css/world.css" type="text/css"/>
<title>
<%-- <spring:message code="country.plural"/> --%>
</title>
</head>
<body>

 

<c:forEach items="${countries}" var="country">

<a href="countryDetails.html?id=${country.id}">
${country.name}

</c:forEach>

</body>
</html>