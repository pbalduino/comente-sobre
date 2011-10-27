<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %><!DOCTYPE html>
<html lang="pt" dir="ltr">  <head>
 	<meta charset="utf-8" />
    <title><decorator:title default="ComenteSobre"/></title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/application.css"/>
    <decorator:head/>
  </head>
  <body>
    <decorator:body/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/application.js"></script>
  </body>
</html>
