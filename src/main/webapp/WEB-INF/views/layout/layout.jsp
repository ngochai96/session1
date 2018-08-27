<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<c:set var="titleKey">
  <tiles:insertAttribute name="title" ignore="true" />
</c:set>
<tiles:insertAttribute name="commonstyle" />
</head>
<body class="sidebar-fixed header-fixed">
	<div class="page-wrapper">
		<header>
			<tiles:insertAttribute name="header" />
		</header>
		<div class="main-container">

			<tiles:insertAttribute name="menu" />
			<div class="content">
				<tiles:insertAttribute name="body" />
			</div>
		</div>

		<tiles:insertAttribute name="footer" />
	</div>

	<tiles:insertAttribute name="commonscript" />
</body>
</html>
