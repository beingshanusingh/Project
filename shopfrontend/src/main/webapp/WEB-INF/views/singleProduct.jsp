<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<!-- BreadCrumb -->
	<div class="row">
	<div class="col-xs-12">
	<nav aria-label="breadcrumb">
	<ol class="breadcrumb">
	<li>
	<a href="${contextRoot}/home" class="breadcrumb-item">Home</a>
	</li>
	<li>
	<a href="${contextRoot}/show/all/products" class="breadcrumb-item">Products</a>
	</li>
	<li>
	<a class="breadcrumb-item.active">${product.name}</a>
	</li>
	</ol>
	</nav>
	</div>
	</div>
	<!-- row Closed -->
	
	<div class="row">
	
	<!-- Display the Image -->
	<div class="col-sm-4">
	<div class="thumbnail">
	<img src="${images}/${product.code}.jpg" class="img-fluid"/>
	</div>
	</div>
	
	<!-- Display the Product desc -->
	<div class="col-sm-8">
	<h3>${product.name}</h3>
	<hr/>
	<p>${product.description}</p>
	<hr/>
	<h5>Price: <strong> &#8377; ${product.unitPrice}</strong></h5>
	<hr/>
	
	
	<c:choose>
	<c:when test="${product.quantity < 1}">
	<h6>Quantity Available: <span style="color:red">Out Of Stock</span></h6>
	</c:when>
	<c:otherwise>
	<h6>Quantity Available:  ${product.quantity}</h6>
	<hr/>
	</c:otherwise>
	</c:choose>	
	<!-- Add to cart -->
	
	<c:choose>
	<c:when test="${product.quantity < 1 }">
	<a href="javascript:void(0)" class="btn btn-success disabled">Add To Cart</a>
	</c:when>
	<c:otherwise>
	<a href="${contextRoot}/cart/add/${product.id}/product" class="btn btn-success">Add To Cart</a>
	<hr/>
	</c:otherwise>
	</c:choose>	
	
	
	
	<a href="${contextRoot}/show/all/products" class="btn btn-warning">Back To Shopping</a>
	</div>
		
	
	</div>
	<!-- Row Closed -->

</div>