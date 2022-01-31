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
	<div class="container bootdey">
	    <div class="panel panel-default panel-order">
	        <div class="panel-heading">
	            <h2>
	            <strong>Order history</strong>
	            </h2>
	        </div>
	
	        <div class="panel-body">
	        	<c:forEach items="${orders}" var="order">
	        	<br />
		            <div class="row">
		                <div class="col-md-11">
		                    <div class="row">
		                        <div class="col-md-12">
		                            <span><strong>${order.orderId}</strong></span><br />
		                            <u>Products Purchased : </u><br />
		                            <c:forEach items="${order.products}" var="product">
		                            	${product.title}<br />
		                            </c:forEach>
		                            <u>Quantity</u> : ${order.totalQuantity}, <u>Cost:</u> $${order.totalAmount} <br />
		                        </div>
		                        <div class="col-md-12"><u>Order made on:</u> ${order.placedAt} <a href="#"> </a></div>
		                    </div>
		                </div>
		            </div>
	        	</c:forEach>
	        </div>
	    </div>
	</div>
    </body>
</html>
