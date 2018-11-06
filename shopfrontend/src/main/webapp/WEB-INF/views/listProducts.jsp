<div class="container">

	<div class="row">


		<!-- To display Sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>


		<!-- To Display All Products -->
		<div class="col-md-9">

			<!-- Breadcrumb Class -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>
					<!-- Category -->
					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<!-- It is passed by the second method created in Interface by pagecontroller.java  -->
							<li class="active">${category.name}</li>
						</ol>
					</c:if>

				</div>
			</div>
			<!-- row breadcrumb closed -->
		</div>
		<!-- Display Closed -->
	</div>
	<!-- Main Row Closed -->
</div>
<!-- MainContainer Closed -->