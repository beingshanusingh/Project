<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shanu Singh's Store- ${title}</title>
<!-- GlobalObject JS to fetch the current Location -->
<script>
	window.menu = "${title}";
	window.contextRoot="${contextRoot}";
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap LUX Theme CSS From Bootswatch -->
<link href="${css}/lux.css" rel="stylesheet">

<!-- Bootstrap LUX Theme CSS From Bootswatch -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/shop.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>


		<!-- Page Content -->
		<div class="content">


			<!-- For Home Page -->
			<c:if test="${userClickHome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- For About Us Page -->
			<c:if test="${userClickAboutUs == true}">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- For Contact Us Page -->
			<c:if test="${userClickContactUs == true}">
				<%@include file="contact.jsp"%>
			</c:if>
			<!--  Products-->
			<c:if test="${userClickAllProducts == true}">
				<%@include file="listProducts.jsp"%>
			</c:if>
			<!-- Products -->
			<c:if test="${userClickCategoryProducts == true}">
				<%@include file="listProducts.jsp"%>
			</c:if>

		</div>

		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>


		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		
		<!-- For DataTable -->
		<script src="${js}/jquery.dataTables.js"></script>
		
		<!-- For DataTable -->
		<script src="${js}/dataTables.bootstrap.js"></script>
		
		

		<!-- Custom JS -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
