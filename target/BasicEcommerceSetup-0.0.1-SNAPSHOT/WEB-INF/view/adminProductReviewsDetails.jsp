<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<h1 class="text-center">User Details</h1>

<c:if test="${not empty usersListData}">
	<b>Total Users  : </b>${fn:length(usersListData)}<br>
	<div class="table-responsive-sm">
		<table class="table table-hover table-sm">
			<thead class="thead-dark">
				<tr>
					<th scope="col">User Ids</th>
					<th scope="col">User Name</th>
					<th scope="col">Roles</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${usersListData}" var="user">
					<tr>
						<th scope="row">${user.id}</th>
						<td>${user.name}</td>
						<td>${user.role}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</c:if>
