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
        <section class="pt-5 pb-5">
		  <div class="container">
		    <div class="row w-100">
		        <div class="col-lg-12 col-md-12 col-12">
		            <h3 class="display-5 mb-2 text-center">Shopping Cart</h3>
		            <p class="mb-5 text-center">
		                <i class="text-info font-weight-bold">3</i> items in your cart</p>
		            <table id="shoppingCart" class="table table-condensed table-responsive">
		                <thead>
		                    <tr>
		                        <th style="width:60%">Product</th>
		                        <th style="width:12%">Price</th>
		                        <th style="width:10%">Quantity</th>
		                    </tr>
		                </thead>
		                <tbody>
		                	<c:forEach items="${cartData.products}" var="product">
		                    <tr>
		                        <td data-th="Product">
		                            <div class="row">
		                                <div class="col-md-9 text-left mt-sm-2">
		                                    <h4>${product.title}</h4>
		                                </div>
		                            </div>
		                        </td>
		                        <td data-th="Price">$${product.price}</td>
		                        <td data-th="Quantity">
		                            <input type="text" class="form-control form-control-lg text-center" value="1">
		                        </td>
		                    </tr>
		                    
		                	</c:forEach>
		                </tbody>
		            </table>
		            <div class="float-right text-right">
		                <h4>Subtotal:</h4>
		                <h1>$${cartData.totalAmount}</h1>
		            </div>
		        </div>
		    </div>
		    <div class="row mt-4 d-flex align-items-center">
		        <div class="col-sm-6 order-md-2 text-right">
		            <a href="/BasicEcommerceSetup/placeOrder" class="btn btn-primary mb-4 btn-lg pl-5 pr-5">Place Order</a>
		        </div>
		        <div class="col-sm-6 mb-3 mb-m-1 order-md-1 text-md-left">
		            <a href="catalog.html">
		                <i class="fas fa-arrow-left mr-2"></i> </a>
		        </div>
		    </div>
		</div>
		</section>
        
    </body>
</html>
