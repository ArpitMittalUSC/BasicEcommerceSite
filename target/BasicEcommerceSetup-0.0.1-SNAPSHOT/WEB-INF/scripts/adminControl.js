var adminControl = {

	initiatePageScripts: function() {
		this.initiateOnClickListeners()
	},

	initiateOnClickListeners: function() {
		$(document).on("click", ".adminUserDetails", adminControl.getAdminUserDetails)
		$(document).on("click", ".adminProductsDetails", adminControl.getAdminProductsDetails)
		$(document).on("click", ".adminProductReviewsDetails", adminControl.getAdminProductReviewsDetails)
		$(document).on("click", ".adminShoppingCardsDetails", adminControl.getAdminShoppingCardsDetails)

	},

	getAdminUserDetails: function(e) {
		e.preventDefault();
		adminControl.getAdminDetails("users");
	},

	getAdminProductsDetails: function(e) {
		e.preventDefault();
		adminControl.getAdminDetails("products");
	},

	getAdminProductReviewsDetails: function(e) {
		e.preventDefault();
		adminControl.getAdminDetails("productReviews");
	},

	getAdminShoppingCardsDetails: function(e) {
		e.preventDefault();
		adminControl.getAdminDetails("shoppingCard");
	},

	getAdminDetails: function(querytype) {
		var successCallBack = function(data) {
			$("#adminDetails").html(data);
		}

		var errorCallBack = function(data) {
			$("#adminDetails").html("<section class='pt-5 pb-5'><div class='container'><div class='row w-100'><div class='col-lg-12 col-md-12 col-12'><h3 class='display-5 mb-2 text-center'>Something Went Wrong. Please try Again</h3></div></div></div></section>");
		}

		scriptUtility.ajaxFunctionCall(successCallBack, errorCallBack, scriptUtility.baseUrl + 'adminDetails', 'GET', { "queryType": querytype })
	}
}

adminControl.initiatePageScripts()
