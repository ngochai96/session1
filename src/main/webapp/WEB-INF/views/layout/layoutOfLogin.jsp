<!DOCTYPE html>
<html class="no-js">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="width=device-width" />
<script type="text/javascript">
  
</script>
<c:set var="titleKey">
  <tiles:insertAttribute name="title" ignore="true" />
</c:set>

 <tiles:insertAttribute name="commonscript" />
 <tiles:insertAttribute name="commonstyle" />
</head>
<body>
<div class="page-wrapper flex-row align-items-center">
    <div class="container">
        <tiles:insertAttribute name="body" />
    </div>
</div>
</body>
</html>
