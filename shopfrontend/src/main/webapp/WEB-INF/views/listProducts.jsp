<div class="container">
	<div class="row">

		<!-- For Sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>


		<div class="col-md-9">
			<!-- Breadcrumb Class -->
			<div class="row bg-dark">
				<div class="col-md-12">
					<c:if test="${userClickAllProducts == true}">
						<script>
							window.category = " ";
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">/ All Products</li>
						</ol>
					</c:if>
					<!-- Category -->
					<c:if test="${userClickCategoryProducts == true}">
						<script>
							window.categoryId = "${category.id}";
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">/ Category</li>
							<!-- It is passed by the second method created in Interface by pagecontroller.java  -->
							<li class="active">/ ${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>


			<div class="row">
				<div class="col-md-12">
					<div class="table-responsive">
						<table class="table table-striped" id="productListTable">
							<thead>
								<tr>
									<th></th>
									<th>Name</th>
									<th>Brand</th>
									<th>Price</th>
									<th>Quantity</th>
									<th></th>

								</tr>
							</thead>
							<tfoot>
								<tr>
									<th></th>
									<th>Name</th>
									<th>Brand</th>
									<th>Price</th>
									<th>Quantity</th>
									<th></th>
								</tr>
							</tfoot>
						</table>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>
