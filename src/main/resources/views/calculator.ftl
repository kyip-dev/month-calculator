<#import "/views/global-template.ftl" as g>

<@g.globalTemplate title="Calculator" scriptPath="/assets/js/calculator.js">
	<div class="page-header">
		<h1>Calculator for Monthly Fee</h1>
	</div>
	<div id="listTransaction" class="article blue">
		<form class="form-horizontal" role="form">
			<div class="row-fluid">
				<div id="1" class="span3">
					My
					<div data-bind="foreach: items">
					    <p><input data-bind="attr: { id: '1_' + $index() }, value: $parent.items()[$index()], valueUpdate: 'afterkeydown', event: { keydown: $parent.pushNewEmpty}" /></p> 
					</div>
				</div>
				<div id="2" class="span3">
					Ping
					<div data-bind="foreach: itemsPing">
					    <p><input data-bind="attr: { id: '2_'+$index() }, value: $parent.itemsPing()[$index()], valueUpdate: 'afterkeydown', event: { keydown: $parent.pushNewEmptyPing}" /></p> 
					</div>
				</div>
				<div id="3" class="span3">
					Ping Yan
					<div data-bind="foreach: itemsPingYan">
					    <p><input data-bind="attr: { id: '3_'+$index() }, value: $parent.itemsPingYan()[$index()], valueUpdate: 'afterkeydown', event: { keydown: $parent.pushNewEmptyPingYan}" /></p> 
					</div>
				</div>
				<div id="4" class="span3">
					Ping Yi
					<div data-bind="foreach: itemsPingYi">
					    <p><input data-bind="attr: { id: '4_'+$index() }, value: $parent.itemsPingYi()[$index()], valueUpdate: 'afterkeydown', event: { keydown: $parent.pushNewEmptyPingYi}" /></p> 
					</div>
				</div>
			</div>
			<hr/>
			
			<div class="row-fluid">
				<div class="span3">
					<input data-bind="value: resultMine()" type="text" class="form-control" disabled="disabled" id="inputResultMine" placeholder="ResultMine">
				</div>
				<div class="span3">
					<input data-bind="value: resultPing()" type="text" class="form-control" disabled="disabled" id="inputResultPing" placeholder="ResultPing">
				</div>
				<div class="span3">
					<input data-bind="value: resultPingYan()" type="text" class="form-control" disabled="disabled" id="inputResultPingYan" placeholder="ResultPingYan">
				</div>
				<div class="span3">
					<input data-bind="value: resultPingYi()" type="text" class="form-control" disabled="disabled" id="inputResultPingYi" placeholder="ResultPingYi">
				</div>
			</div>
				
			<pre data-bind="text: ko.toJSON($data)"></pre>			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button data-bind="click: cal" type="button" class="btn btn-primary">Cal</button>
				</div>
			</div>
			<div class="form-group">
				<label for="inputResult" class="col-sm-2 control-label">Total</label>
				<div class="col-sm-10">
					<input data-bind="value: result()" type="text" class="form-control" disabled="disabled" id="inputResult" placeholder="Result">
				</div>
			</div>

		</form>
	</div>
</@g.globalTemplate> 