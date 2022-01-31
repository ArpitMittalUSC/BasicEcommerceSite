<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib tagdir="/WEB-INF/tags" prefix="commontag" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BasicEcommerceSite</title>
        <style type="text/css">
        	<%@include file="/WEB-INF/style/bootstrap.min.css" %>	
        </style>
    </head>
    <script>
    	<%@include file="/WEB-INF/scripts/jquery.min.js" %>	
    	<%@include file="/WEB-INF/scripts/userControl.js" %>	
    </script>
    
    <body>
    <commontag:navbar></commontag:navbar>
        <div class="container d-flex justify-content-center mt-50 mb-50">
	    <div class="row">
	        <div class="col-md-10">
	        <c:forEach items="${productList}" var="product">
	            <div class="card card-body">
	                <div class="media align-items-center align-items-lg-start text-center text-lg-left flex-column flex-lg-row">
	                    <div class="mr-2 mb-3 mb-lg-0"> <img src="${product.image}" width="150" height="150" alt=""> </div>
	                    <div class="media-body">
	                        <h6 class="media-title font-weight-semibold"> <a href="#" data-abc="true"><a href="/BasicEcommerceSetup/product/${product.skuid}">${product.title}</a> </h6>
	                        <p class="mb-3">${product.description}</p>
	                    </div>
	                    <div class="mt-3 mt-lg-0 ml-lg-3 text-center">
	                        <h3 class="mb-0 font-weight-semibold">$${product.price}</h3>
	                        <div> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> </div>
	                        <div class="text-muted">${product.reviewCount}</div> <button type="button" class="btn btn-warning mt-4 text-white"><i class="icon-cart-add mr-2"></i> Add to cart</button>
	                    </div>
	                </div>
	            </div>
	           </c:forEach> 
	        </div>
	    </div>
	</div>
        
    </body>
</html>
