<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
	<head>
		<title><tiles:getAsString name="title" />
		</title>
	</head>
	<body>
		<center>
			<table border="0" bgcolor="#2e2c54">
				<tr >
					<td bgcolor="#b042fb" colspan="2" width="1000" height="50" >
						<tiles:insertAttribute name="header" />
					</td>
				</tr>
				<tr>
					<td width="200" height="400" bgcolor="#7878e4"> 
						<tiles:insertAttribute name="menu" />
					</td>
					<td width="800" height="400" bgcolor="#917ef5">
						<tiles:insertAttribute name="body" />
					</td>
				</tr>
				<tr>
					<td colspan="2" width="1000" height="50" bgcolor="#6211f9">
						<tiles:insertAttribute name="footer" />
					</td>
				</tr>
			</table>
		</center>
	</body>
</html>