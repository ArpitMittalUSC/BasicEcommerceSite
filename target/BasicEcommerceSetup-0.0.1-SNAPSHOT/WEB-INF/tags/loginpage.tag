<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div id="ticketMenu">
	<h1 class="text-center">Welcome to Basic Ecommerce Site</h1>
	<br>
	<c:if test="${not empty error}">
		<div class="error_block">
			<div class="alert alert-danger" role="alert">Error : ${error}</div>
		</div>"
	</c:if>
	<div class="login-wrap p-4 p-md-5">
		<div class="d-flex">
			<div class="w-100">
				<h3 class="mb-4">Sign In</h3>
			</div>
			<div class="w-100">
				<p class="social-media d-flex justify-content-end">
					<a href="#"
						class="social-icon d-flex align-items-center justify-content-center"><span
						class="fa fa-facebook"></span></a> <a href="#"
						class="social-icon d-flex align-items-center justify-content-center"><span
						class="fa fa-twitter"></span></a>
				</p>
			</div>
		</div>
		<form:form method="POST" action="/BasicEcommerceSetup/signin"
			modelAttribute="loginDetails">
			<div class="form-group mb-3">
				<label class="label" for="name" style="">Username</label> 
				<input
					type="text" class="form-control username" placeholder="Username"
					required="">
			</div>
			<div class="form-group mb-3">
				<label class="label" for="password" style="">Password</label> <input
					type="password" class="form-control password"
					placeholder="Password" required="">
			</div>
			<div class="form-group">
				<button type="submit"
					class="form-control btn btn-primary rounded submit px-3" style="">Sign In</button>
			</div>
		</form:form>
		<p class="text-center">
			Not a member? <a class="open_signUp">Sign Up</a>
	</div>
	<div class="signup-wrap p-4 p-md-5" style="display: none;">
		<div class="d-flex">
			<div class="w-100">
				<h3 class="mb-4">Register</h3>
			</div>
			<div class="w-100">
				<p class="social-media d-flex justify-content-end">
					<a href="#"
						class="social-icon d-flex align-items-center justify-content-center"><span
						class="fa fa-facebook"></span></a> <a href="#"
						class="social-icon d-flex align-items-center justify-content-center"><span
						class="fa fa-twitter"></span></a>
				</p>
			</div>
		</div>
		<form:form method="POST" action="/BasicEcommerceSetup/signup"
			modelAttribute="loginDetails">
			<div class="form-group mb-3">
				<label class="label" for="name" style="">Username</label> <input
					type="text" class="form-control username" placeholder="Username"
					required="">
			</div>
			<div class="form-group mb-3">
				<label class="label" for="password" style="">Password</label> <input
					type="password" class="form-control password"
					placeholder="Password" required="">
			</div>
			<div class="form-group">
				<label class="label" for="re-enter-password" style="">Re-enter
					Password</label> <input type="password" class="form-control"
					placeholder="Re-enter Password" required="">
			</div>
			<div class="form-group">
				<label class="label" for="role" style="">Role</label> <select
					class="form-control">
					<option value="buyer">Buyer</option>
					<option value="seller">Seller</option>
				</select>
			</div>
			<div class="form-group">
				<button
					class="form-control btn btn-primary rounded px-3 submit signup_buyer"
					style="">Sign Up</button>

			</div>
		</form:form>
		<p class="text-center">
			Already a member? <a class="open_signin">Sign In</a>
		</p>
	</div>

</div>