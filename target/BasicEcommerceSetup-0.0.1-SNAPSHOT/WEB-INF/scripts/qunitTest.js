QUnit.test('Ticket Details Test', function(assert) {
		var option = null;
		jQuery.ajax = function (param) {
            options = param;
        };
        
        ticketControl.openTicketDetail();
        options.success("TicketDetails");
        same($("#singleTicketDetails").html(), 'TicketList');
});

QUnit.test('Ticket Details Error Test', function(assert) {
		var option = null;
		jQuery.ajax = function (param) {
            options = param;
        };
        
        ticketControl.openTicketDetail();
        options.error("Ticket Details API Not Available ");
        same($("#singleTicketDetails").html(), 'Ticket Details API Not Available ');
});

QUnit.test('Ticket List Test', function(assert) {
		var option = null;
		jQuery.ajax = function (param) {
            options = param;
        };
        
        ticketControl.getTicketList();
        options.success("TicketList");
        same($("#ticketMenu").html(), 'TicketList');
});

QUnit.test('Ticket List Error Test', function(assert) {
		var option = null;
		jQuery.ajax = function (param) {
            options = param;
        };
        
        ticketControl.getTicketList();
        options.success("Ticket List API Not Available ");
        same($("#ticketMenu").html(), 'Ticket List API Not Available ');
});

QUnit.test('Next Page Ticket List Test', function(assert) {
		var option = null;
		jQuery.ajax = function (param) {
            options = param;
        };
        ticketControl.gotoNextPage();
        options.success("NextPageTicketList");
        same($("#ticketMenu").html(), 'NextPageTicketList');
});


QUnit.test('Prev Page Ticket List Test', function(assert) {
		var option = null;
		jQuery.ajax = function (param) {
            options = param;
        };
        ticketControl.gotoNextPage();
        options.success("PrevPageTicketList");
        same($("#ticketMenu").html(), 'NextPageTicketList');
});

QUnit.test('Ticket List Test', function(assert) {
		var option = null;
		jQuery.ajax = function (param) {
            options = param;
        };
        
        ticketControl.getTicketList();
        options.success("TicketList");
        same($("#ticketMenu").html(), 'TicketList');
});
