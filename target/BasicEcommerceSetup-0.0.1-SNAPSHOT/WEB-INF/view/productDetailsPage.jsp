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
	<div class="container">
	    <div class="card">
	        <div class="card-body">
	            <h3 class="card-title">${product.title}</h3>
	            <div class="row">
	                <div class="col-lg-5 col-md-5 col-sm-6">
	                    <div class="white-box text-center"><img src="${product.image}" class="img-responsive"></div>
	                </div>
	                <div class="col-lg-7 col-md-7 col-sm-6">
	                    <h4 class="box-title mt-5">Product description</h4>
	                    <p>${product.description}</p>
	                    <h2 class="mt-5">
	                        $${product.price}
	                    </h2>
	                    <button class="btn btn-primary btn-rounded">Add to Cart</button>
	                </div>
	                <div class="col-lg-12 col-md-12 col-sm-12">
	                    <h3 class="box-title mt-5">Reviews</h3>
	                    <div class="table-responsive">
	                        <table class="table table-striped table-product">
	                            <tbody>
	                            	<c:forEach items="${product.reviews}" var="review">
	                                <tr>
	                                    <td>${review}</td>
	                                </tr>
	                            	</c:forEach>
	                                <tr>
	                                    <td><input type="text" class="form-control" placeholder="Add Review" required=""><button class="form-control btn btn-primary rounded px-3 add_review" style="">Submit</button></td>
	                                </tr>
	                            </tbody>
	                        </table>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	</div>
    </body>
</html>
