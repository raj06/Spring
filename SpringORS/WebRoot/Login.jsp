<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	
	<body>
		<center>
			<s:actionerror />
			<s:form action="Login">
				<s:textfield name="userid" label="UserID"></s:textfield>
				<s:textfield name="password" label="Password"></s:textfield>
				<s:submit name="operation" value="Login" theme="simple"></s:submit>
				<s:reset value="Reset" theme="simple"></s:reset>
			</s:form>
		</center>
	</body>
</html>