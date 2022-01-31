var userControl = {

	initiatePageScripts: function() {
		this.initiateOnClickListeners()
	},

	initiateOnClickListeners: function() {
		$(document).on("click", ".open_signin", userControl.opensignin)
		$(document).on("click", ".open_signUp", userControl.opensignup)
		$(document).on("click", ".seller_toggle", userControl.sellertoggle)
		$(document).on("click", ".buyer_toggle", userControl.buyertoggle)
		$(document).on("submit", ".submitNewProduct", userControl.submitCreateProductForm)
		
	},

	submitCreateProductForm : function(e){
	    e.preventDefault();
	    var form = $(this);
	    var actionUrl = form.attr('action');
	    $.ajax({
	        type: "POST",
	        url: actionUrl,
	        data: form.serialize(), // serializes the form's elements.
	        success: function(data)
	        {
	          alert("Your Product has been created");
				Dropzone.forElement('#dropzone').removeAllFiles(true)
				$('#submitNewProduct').trigger("reset");
	        }
	    });
	},
	opensignin: function() {
		$(".login-wrap").show();
		$(".signup-wrap").hide();
	},
	
	opensignup: function() {
		$(".login-wrap").hide();
		$(".signup-wrap").show();
	},
	
	sellertoggle: function() {
		$(".buyer_toggle").prop("disabled", false)
		$(".seller_toggle").prop("disabled", true)
		$(".seller_mode").show();
		$(".buyer_mode").hide();
	},
	
	buyertoggle: function() {
		$(".buyer_toggle").prop("disabled", true)
		$(".seller_toggle").prop("disabled", false)
		$(".seller_mode").hide();
		$(".buyer_mode").show();
	},
	
	signupasbuyer: function() {

		var successCallBack = function(data) {
			window.location.href = data.redirect;
		}

		var errorCallBack = function(data) {
			$(".error_block").html("<div class='alert alert-danger' role='alert'>Error : Something Went Wrong.</div>");
		}

		scriptUtility.ajaxFunctionCall(successCallBack, errorCallBack, scriptUtility.baseUrl + 'ticketsMenuByURL', 'GET', 'application/json', { "pageUrl": $(this).attr("prevPageURL") })
	},
	
	getTicketList: function() {
		var successCallBack = function(data) {
			$("#ticketMenu").html(data);
			$("#singleTicketDetails").hide();
			$("#pageNumber").html(userControl.currentPage);
		}

		var errorCallBack = function(data) {
			$("#ticketMenu").html("<div class='alert alert-danger' role='alert'>Error : Something Went Wrong.</div>");
			$("#singleTicketDetails").hide();
		}

		scriptUtility.ajaxFunctionCall(successCallBack, errorCallBack, scriptUtility.baseUrl + 'ticketsMenu', 'GET', 'application/json')
	},

	gotoNextPage: function() {
		$("#ticketMenu").html("<h1 class='text-center'>Welcome to Ticket menu </h1><div class='d-flex justify-content-center'><div class='spinner-border' role='status'><span class='sr-only'>Loading...</span></div></div>")
		var successCallBack = function(data) {
			$("#ticketMenu").html(data);
			$("#singleTicketDetails").hide();
			userControl.currentPage = userControl.currentPage + 1
			$("#pageNumber").html(userControl.currentPage);
		}

		var errorCallBack = function(data) {
			$("#ticketMenu").html("<div class='alert alert-danger' role='alert'>Error : Something Went Wrong.</div>");
			$("#singleTicketDetails").hide();
		}

		scriptUtility.ajaxFunctionCall(successCallBack, errorCallBack, scriptUtility.baseUrl + 'ticketsMenuByURL', 'GET', 'application/json', { "pageUrl": $(this).attr("nextPageUrl") })
	},


	openTicketDetail: function() {
		$("#ticketMenu").hide();
		$("#singleTicketDetails").show();

		var successCallBack = function(data) {
			$("#singleTicketDetails").html(data);

		}

		var errorCallBack = function(data) {
			$("#singleTicketDetails").html("<div class='alert alert-danger' role='alert'>Error : Something Went Wrong.</div>");
		}

		scriptUtility.ajaxFunctionCall(successCallBack, errorCallBack, scriptUtility.baseUrl + 'ticket', 'GET', 'application/json', { "ticketId": $(this).attr("ticketId") })
	},

	backToTicketList: function() {
		$("#ticketMenu").show();
		$("#singleTicketDetails").hide();
		$("#singleTicketDetails").html("<h1 class='text-center'>Ticket Details</h1><div class='d-flex justify-content-center'><div class='spinner-border' role='status'><span class='sr-only'>Loading...</span></div></div>");
	}
}

userControl.initiatePageScripts()

window.onload = function() {
	Dropzone.options.dropzone = {
    	acceptedFiles: 'image/*',
		maxFiles : 1
	};
	$("div#dropzone").dropzone({
		url : "/BasicEcommerceSetup/upload",
		paramName: 'file'
	});
};
