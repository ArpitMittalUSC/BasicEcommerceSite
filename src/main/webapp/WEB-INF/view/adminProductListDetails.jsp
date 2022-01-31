<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<h1 class="text-center">Product Details</h1>
<c:if test="${not empty productListData}">
	<b>Total Users  : </b>${fn:length(productListData)}<br>
	<div class="table-responsive-sm">
		<table class="table table-hover table-sm">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Product Title</th>
					<th scope="col">Product Skuid</th>
					<th scope="col">Product Description</th>
					<th scope="col">Product Price</th>
					<th scope="col">Product Seller</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${productListData}" var="product">
					<tr>
						<th scope="row">${product.title}</th>
						<td>${product.skuid}</td>
						<td>${product.description}</td>
						<td>${product.price}</td>
						<td>${product.sellerId}</td>
						<td><button>Block</button><button>Delete</button><button>Remove</button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</c:if>
