function ViewModel(){
	var self = this;
	self.result = ko.observable();
	self.resultMine = ko.observable();
	self.resultPing = ko.observable();
	self.resultPingYan = ko.observable();
	self.resultPingYi = ko.observable();

    self.items = ko.observableArray([ko.observable("")]);
    self.itemsPing = ko.observableArray([ko.observable("")]);
    self.itemsPingYan = ko.observableArray([ko.observable("")]);
    self.itemsPingYi = ko.observableArray([ko.observable("")]);
    
    
    self.pushNewEmpty =function (data, event) {
    	return push(self.items);
    }
    self.pushNewEmptyPing =function (data, event) { 
    	return push(self.itemsPing);
    }
    self.pushNewEmptyPingYan =function (data, event) { 
    	return push(self.itemsPingYan);
    }
    self.pushNewEmptyPingYi =function (data, event) { 
    	return push(self.itemsPingYi);
    }
    
    self.cal = function() {
		var request = {
			'myAmountJson': ko.toJSON(self.items),
			'pingAmountJson': ko.toJSON(self.itemsPing),
			'pingAndYanAmountJson': ko.toJSON(self.itemsPingYan),
			'pingAndYiAmountJson': ko.toJSON(self.itemsPingYi),
		};

		$.ajax({
			url: "/calculator/cal",
			type: "POST",
			data: JSON.stringify(request),
			contentType: "application/json",
			dataType: 'json',
			success: function(data) {
				self.result(data.result);
				self.resultMine(data.resultMine);
				self.resultPing(data.resultPing);
				self.resultPingYan(data.resultPingYan);
				self.resultPingYi(data.resultPingYi);
			}
		});
	}

};
 
ko.applyBindings(new ViewModel());

function push(obj) {
	if (event.keyCode == 13) {
		obj.push('');
		
		var currentTextBoxId = $(document.activeElement).attr('id');
		var parts = currentTextBoxId.split('_');
		$("#" +parts[0]+ " input:last").focus();
    }
	if (event.keyCode == 37) { //left
		var currentTextBoxId = $(document.activeElement).attr('id');
		var parts = currentTextBoxId.split('_');
		if (parts[0] !='1') {
			var col = parseInt(parts[0],10) - 1;
			$("#" +col.toString()+ " input:last").focus();
		}
    }
	if (event.keyCode == 39) { // right
		var currentTextBoxId = $(document.activeElement).attr('id');
		var parts = currentTextBoxId.split('_');
		if (parts[0] !='4') {
			var col = parseInt(parts[0],10) + 1;
			$("#" +col.toString()+ " input:last").focus();
		}
    }
	if (event.keyCode == 38) { //top
		
    }
	if (event.keyCode == 40) { //down
		
    }
	return true;
}