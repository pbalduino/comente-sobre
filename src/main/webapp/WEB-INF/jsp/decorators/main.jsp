<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<!DOCTYPE html>
<html lang="pt-BR" dir="ltr">
<head>
<meta charset="utf-8" />
<title><decorator:title default="ComenteSobre" /></title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/stylesheets/application.css" />
<decorator:head />
</head>
<body>
	<div id="header">
	</div>
	<div id="content">
		<decorator:body />
	</div>
	<div id="footer">
	<small>Aplicação desenvolvida por Plínio Balduino para a <a href="http://site.bluesoft.com.br/" target="_blank">Bluesoft</a></small>
	</div>
</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/javascripts/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/javascripts/application.js"></script>
</html>