<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="col-lg-3">

	<h1 class="my-4">Shop Name</h1>
	<div class="list-group">
	
	
	<!--  Here we called the categories object from the pagecontroller.java and passed it to a variable 
	and then retrieve only the category name.-->
   <c:forEach items="${categories}" var="category" >
   <a href="#" class="list-group-item">${category.name}</a>
   
   </c:forEach>
	
	</div>
	</div>