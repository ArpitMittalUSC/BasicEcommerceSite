<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<h1 class="text-center">Product Reviews Details</h1>
<c:if test="${not empty productListData}">
	<b>Total Users  : </b>${fn:length(productListData)}<br>
	<div class="table-responsive-sm">
		<table class="table table-hover table-sm">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Product Title</th>
					<th scope="col">Product Reviews</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${productListData}" var="product">
					<c:forEach items="${product.reviews}" var="review">
						<tr>
							<th scope="row">${product.skuid}</th>
							<td>${review}</td>
							<td><button>Block</button><button>Delete</button><button>Remove</button></td>
						</tr>
					</c:forEach>
				</c:forEach>
			</tbody>
		</table>
	</div>
</c:if>
