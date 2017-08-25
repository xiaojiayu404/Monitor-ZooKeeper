<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" pageEncoding="GBK"%><%@ include
	file="/WEB-INF/common/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Expires" content="-1" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Cache-Control" content="no-cache" />
<meta http-equiv="content-type" content="text/html; charset=GBK" />
<title>YouDao ZooKeeper</title>
<link rel="stylesheet" href="<c:url value="/css/default.css" />"
	type="text/css" />
<link rel="stylesheet" href="<c:url value="/css/displaytag.css" />"
	type="text/css" />
<link rel="stylesheet"
	href="<c:url value="/css/smoothness/jquery-ui-1.8.5.custom.css" />"
	type="text/css" />
<script type="text/javascript"
	src="<c:url value="/js/jquery-1.4.2.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/js/jquery-ui-1.8.5.custom.min.js" />"></script>
<decorator:head />
<script type="text/javascript">
$(function() {
	$('#popupDialog').dialog({
		autoOpen: false,
		height: 'auto',
		width: 'auto',
		modal: true
	});
});
</script>
</head>
<body class="composite">
<div id="banner"><a href="<c:url value="/default.do" />" id="bannerLeft">
<img src="img/taokeeper-logo.png" alt=""  border="2"/> </a>
<div class="clear">
<hr />
</div>
</div>
<div id="breadcrumbs">
<div class="xright">
<a target="_blank" href="http://machine.corp.youdao.com/service?action=show&id=339">To Machine</a>
&nbsp;&nbsp;&nbsp;&nbsp;
</div>
<div class="clear">
<hr />
</div>
</div>
<div id="leftColumn"><jsp:include
	page="/WEB-INF/common/header.jsp" flush="true" /></div>
<div id="rightColumn">
<div id="message" class="ui-widget ui-corner-all"></div>
<decorator:body /></div>
<jsp:include page="/WEB-INF/common/footer.jsp" flush="true" />
<div id="popupDialog"></div>
</body>
</html>
