<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<%
			String s = (String) session.getAttribute("userid");
			out.println("WelCome  " + s);
		%>
	</head>
	<body>
		<center>
			<div align="right">
				<a href="<s:url action="Logout" />">Logout</a>
			</div>
			
			<s:form action="Marksheet">
				<s:if test="rollno==0">
					<s:textfield label="RollNO" name="rollno"></s:textfield>
				</s:if>
				<s:else>
					<s:textfield label="RollNO" name="rollno" disabled="true"></s:textfield>
				</s:else>

				<s:textfield label="Name" name="name"></s:textfield>
				<s:textfield label="Physics" name="physics"></s:textfield>
				<s:textfield label="Chemistry" name="chemistry"></s:textfield>
				<s:textfield label="Maths" name="maths"></s:textfield>
				<s:if test="rollno==0">
					<s:submit name="operation" value="Add" theme="simple"></s:submit>
				</s:if>
				<s:else>
					<s:submit name="operation" value="Update" theme="simple"></s:submit>
				</s:else>
				<s:submit name="operation" value="Get" theme="simple"></s:submit>
			</s:form>
			<s:form action="MarksheetList">
				<s:submit name="operation" value="List" theme="simple"></s:submit>
			</s:form>
		</center>
	</body>
</html>