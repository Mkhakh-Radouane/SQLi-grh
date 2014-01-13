<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.compte-resources"/>
<html>
<head>
<title>Edit <fmt:message key="compte.title"/></title>
<script>
 function ShowManagerRHList(){
        $.getJSON(
             "stateslist.html", 
             {countryId: $('#country').val()},
             function(data) {
                  var html = '';
                  var len = data.length;
                  for(var i=0; i<len; i++){
                       html += '<option value="' + data[i].id + '">' + data[i].name + '</option>';
                   }
                  $('#state').append(html);
             }
          );
 }

 $(document).ready(function() {
         $('#profile').change(function()
          { 
       
           if ($('#profile').val() == 1) {
						alert("ManagerRH");
							
						}
          });
      });


</script>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="compte.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexCompte"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveCompte" method="POST" modelAttribute="compte">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="compte.id.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="compte_id" path="id" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "compte_id",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="compte.id.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${compte.id}
						&nbsp;
									<form:hidden id="compte_id" path="id"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="compte.login.title"/>:
						</td>
						<td>
							<form:input id="compte_login" path="login" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "compte_login",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="compte.login.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="compte.password.title"/>:
						</td>
						<td>
							<form:password id="compte_password" path="password" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "compte_password",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="compte.password.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="compte.email.title"/>:
						</td>
						<td>
							<form:input id="compte_email" path="email" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "compte_email",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="compte.email.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="profile.profilefield.title"/>:
						</td>
						<td>
						  <form:select path="profile" id="profile" required="true">
	                <form:option value="-" label="-- Selectionner un profile --"/>
                <form:options items="${profiles}" itemValue="id" itemLabel="profileField" />
	          </form:select>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="Liste Managers RH"/>:
						</td>
						<td>
						<div id="tablemanagRH" >
						<table id="listTable" cellpadding="0" cellspacing="0">
							<thead>
								<tr>
									<th class="thead">&nbsp;</th>
									<th class="thead"><fmt:message key="niveau.id.title"/></th>
									<th class="thead"><fmt:message key="niveau.niveaufield.title"/></th>
								</tr>
							</thead>
					<tbody>
						<c:forEach items="${niveaus}" var="current" varStatus="i">
							<c:choose>
								<c:when test="${(i.count) % 2 == 0}">
				    				<c:set var="rowclass" value="rowtwo"/>
								</c:when>
								<c:otherwise>
				    				<c:set var="rowclass" value="rowone"/>
								</c:otherwise>
							</c:choose>	
						<tr class="${rowclass}">
							<td nowrap="nowrap" class="tabletd">
								<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectNiveau?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
								<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editNiveau?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
								<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteNiveau?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
							</td>
							<td nowrap="nowrap" class="tabletd">
								
									${current.id}
								&nbsp;
							</td>
							<td nowrap="nowrap" class="tabletd">
								
									${current.niveauField}
								&nbsp;
							</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
								
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="compte.activation.title"/>:
						</td>
						<td>
							<form:checkbox id="compte_activation" path="activation" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "compte_activation",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>