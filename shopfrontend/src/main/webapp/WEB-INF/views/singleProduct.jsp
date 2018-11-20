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
	<h6>Quantity Available:  ${product.quantity}</h6>
	<hr/>
	<a href="${contextRoot}/cart/add/${product.id}/product" class="btn btn-success">Add To Cart</a>
	<a href="${contextRoot}/show/all/product" class="btn btn-warning">Back To Shopping</a>
	</div>
		
	
	</div>
	<!-- Row Closed -->

</div>