<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib tagdir="/WEB-INF/tags" prefix="commontag" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BasicEcommerceSite</title>
        <style type="text/css">
        	<%@include file="/WEB-INF/style/bootstrap.min.css" %>	
        	<%@include file="/WEB-INF/style/dropzone.css" %>	
        	
        </style>
    </head>
    <script>
    	<%@include file="/WEB-INF/scripts/jquery.min.js" %>	
    	<%@include file="/WEB-INF/scripts/userControl.js" %>
    	<%@include file="/WEB-INF/scripts/dropzone.js" %>	

    </script>

	<body>
	
		<!------ Include the above in your HEAD tag ---------->
		<commontag:navbar></commontag:navbar>
		<form:form id="submitNewProduct" class="form-horizontal submitNewProduct"
			action="/BasicEcommerceSetup/product/submitNewProduct" modelAttribute="product">
			
			<fieldset>
	
				<!-- Form Name -->
				<legend>CREATE NEW PRODUCT</legend>
	
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="product_id">PRODUCT
						ID</label>
					<div class="col-md-4">
						<input id="product_id" name="product_id" placeholder="PRODUCT ID"
							class="form-control input-md" required="" type="text">
	
					</div>
				</div>
	
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="product_name">PRODUCT
						NAME</label>
					<div class="col-md-4">
						<input id="product_name" name="product_name"
							placeholder="PRODUCT NAME" class="form-control input-md"
							required="" type="text">
	
					</div>
				</div>
	
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="product_name_fr">PRODUCT
						DESCRIPTION</label>
					<div class="col-md-4">
						<input id="product_name_fr" name="product_name_fr"
							placeholder="PRODUCT DESCRIPTION" class="form-control input-md"
							required="" type="text">
	
					</div>
				</div>
	
				<div class="form-group">
					<label class="col-md-4 control-label" for="product_name_fr">PRODUCT
						PRICE</label>
					<div class="col-md-4">
						<input id="product_name_fr" name="product_name_fr"
							placeholder="PRODUCT PRICE" class="form-control input-md"
							required="" type="text">
	
					</div>
				</div>
	
				<div id="dropzone" class="dropzone"></div>
	
				<!-- Button -->
				<div class="form-group">
					<div class="col-md-4">
						<button id="singlebutton" name="singlebutton"
							class="btn btn-primary">Submit</button>
					</div>
				</div>
	
			</fieldset>
		</form:form>
	
	</body>
</html>
