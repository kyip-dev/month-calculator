<#macro globalTemplate title scriptPath="">
<!DOCTYPE html>
<html lang="en">
<head>
	<title>${title}</title>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    
	<link rel="stylesheet" href="/assets/bootstrap/3.1.1/css/bootstrap.min.css">
		
	<script src="/assets/jquery/1.11.1/jquery.min.js"></script>
	<script src="/assets/bootstrap/3.1.1/js/bootstrap.min.js"></script>
			
	<script src="/assets/knockout/3.0.0/knockout-3.0.0.js"></script>
</head>
<body>
	<!-- Begin page content -->
	<div class="container">
		<#nested>
	</div>
	
	<#if (scriptPath?has_content)>
		<script src="${scriptPath}"></script>
	</#if>
</body>
</html>
</#macro>