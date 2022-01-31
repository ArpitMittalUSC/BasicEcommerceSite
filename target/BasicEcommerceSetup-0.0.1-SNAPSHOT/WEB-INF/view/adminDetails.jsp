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
    	<%@include file="/WEB-INF/scripts/scriptUtility.js" %>
    	<%@include file="/WEB-INF/scripts/adminControl.js" %>	
    </script>
    
    <body>
    <commontag:adminNavBar></commontag:adminNavBar>
    <div id="adminDetails">
    	<section class="pt-5 pb-5">
		  <div class="container">
		    <div class="row w-100">
		        <div class="col-lg-12 col-md-12 col-12">
		            <h3 class="display-5 mb-2 text-center">Please select Options from NavBar above</h3>
		        </div>
		    </div>
		</div>
		</section>
    </div>
        
    </body>
</html>
