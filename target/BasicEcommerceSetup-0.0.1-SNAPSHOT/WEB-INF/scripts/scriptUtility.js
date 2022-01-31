var scriptUtility = {
	ajaxFunctionCall: function(sucessCallBack, errorCallBack, url, httpMethod, data) {
		$.ajax({
			url: url,
			data: data,
			type: httpMethod,
			success: function(data) {
				sucessCallBack(data);
			},
			error: function(data) {
				errorCallBack(data);
			}
		})
	},

	baseUrl: "http://localhost:9001/BasicEcommerceSetup/"
}