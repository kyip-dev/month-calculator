function CalculatorHomeViewModel() {
	var self = this;

	self.value1 = "";
	self.value2 = "";
	self.result = ko.observable();

	self.add = function() {
		var request = {
			'value1': self.value1, 
			'value2': self.value2
		};
	
		$.ajax({
			url: "/calculator/add",
			type: "POST",
			data: JSON.stringify(request),
			contentType: "application/json",
			dataType: 'json',
			success: function(data) {
				self.result(data.result);
			}
		});
	}
}

ko.applyBindings(new CalculatorHomeViewModel());