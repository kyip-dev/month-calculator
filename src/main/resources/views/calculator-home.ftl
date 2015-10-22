<#import "/views/global-template.ftl" as g>

<@g.globalTemplate title="Calculator" scriptPath="/assets/js/calculator-home.js">
	<div class="page-header">
		<h1>Calculator</h1>
	</div>
	<form class="form-horizontal" role="form">
		<div class="form-group">
			<label for="inputValue1" class="col-sm-2 control-label">Value 1</label>
			<div class="col-sm-10">
				<input data-bind="value: value1" type="text" class="form-control" id="inputValue1" placeholder="Value 1">
			</div>
		</div>
		<div class="form-group">
			<label for="inputValue2" class="col-sm-2 control-label">Value 2</label>
			<div class="col-sm-10">
				<input data-bind="value: value2" type="text" class="form-control" id="inputValue2" placeholder="Value 2">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button data-bind="click: add" type="button" class="btn btn-primary">Add</button>
			</div>
		</div>
		<div class="form-group">
			<label for="inputResult" class="col-sm-2 control-label">Result</label>
			<div class="col-sm-10">
				<input data-bind="value: result()" type="text" class="form-control" disabled="disabled" id="inputResult" placeholder="Result">
			</div>
		</div>
	</form>
</@g.globalTemplate> 