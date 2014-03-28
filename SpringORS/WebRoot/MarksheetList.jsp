<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
		<SCRIPT language="javascript">
$(function(){
 
    // add multiple select / deselect functionality
    $("#selectall").click(function () {
          $('.check').attr('checked', this.checked);
    });
 
    // if all checkbox are selected, check the selectall checkbox
    // and viceversa
    $(".check").click(function(){
 
        if($(".check").length == $(".check:checked").length) {
            $("#selectall").attr("checked", "checked");
        } else {
            $("#selectall").removeAttr("checked");
        }
 
    });
});
</SCRIPT>
	</head>
	<body>
		<s:hidden name="pageno"></s:hidden>
		<s:form action="MarksheetList">
			<s:textfield name="name" label="Name" />
			<s:submit name="operation" value="Search" theme="simple"></s:submit>
		</s:form>
		<s:form action="MarksheetList">
			<center>
				<s:actionmessage />
				<table border="2" bordercolor="green">
					<tr>

					</tr>
					<tr>
						<td>
							<input type="checkbox" id="selectall"/> 
						</td>
						<td>
							Rollno
						</td>
						<td>
							Name
						</td>
						<td>
							Physics
						</td>
						<td>
							Chemistry
						</td>
						<td>
							Maths
						</td>
						<td>
							Update
						</td>
					</tr>
					<s:iterator value="list">
						<tr>
							<td>
								<input type="checkbox" class="check" name="ids"
										value='<s:property value="id"/>'>
							</td>
							<td>
								<s:property value="rollno" />
							</td>
							<td>
								<s:property value="name" />
							</td>
							<td>
								<s:property value="Physics" />
							</td>
							<td>
								<s:property value="Chemistry" />
							</td>
							<td>
								<s:property value="Maths" />
							</td>
							<td>
								<a
									href="Marksheet?rollno=<s:property value="rollno"/>&operation=get">Edit</a>
							</td>
						</tr>
					</s:iterator>
					<tr>
						<td>
							<div align="left">
								<s:submit name="operation" value="Previous" theme="simple"></s:submit>
							</div>
						</td>
						<td>
							<div align="center">
								<s:submit name="operation" value="Delete" theme="simple"></s:submit>
							</div>
						</td>
						<td>
							<div align="right">
								<s:submit name="operation" value="Next" theme="simple"></s:submit>
							</div>
						</td>
					</tr>

				</table>
			</center>
		</s:form>
	</body>
</html>