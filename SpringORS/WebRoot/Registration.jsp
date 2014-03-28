<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="s1" uri="/struts-dojo-tags"%>
<html>

	<s1:head />
	<s:actionerror />
	<body>

		<s:form action="Registration">
			<s:textfield label="Name" name="name"  />
			<s:textfield label="SerName" name="sername"></s:textfield>
			<s:textfield label="UserID" name="userid"></s:textfield>
			<s:password label="Password" name="password" />
			<s:password label="Confrom Password" name="cpass"/>
			<s:radio label="Gender" name="gender" list="{'Male','Female'}" ></s:radio>
			<s:select label="Country" name="country"
				list="{'India','Paskisthan','Englend','US'}"></s:select>
			<s:select label="State" name="state"
				list="{'MP','UP','Rajsthan','Gujrat'}"></s:select>
			<s:select label="City" name="city"
				list="{'Neemuch','Mandsour','Ratlam','Indore','Bhopal'}"></s:select>
			<s1:datetimepicker label="DOB" name="dob" displayFormat="dd/MM/yyyy"
				adjustWeeks="true" toggleType="explode" ></s1:datetimepicker>
			<s:checkboxlist name="hobby" label="Hobby"
				list="{'Cricket','Football','Hockey','Baseball','Tenis','Other'}"></s:checkboxlist>
			<div align="center">
				<s:textfield label="Mobileno" name="mobileno" ></s:textfield>
				<s:textfield label="Email Id" name="emailid" ></s:textfield>
				<s:submit name="operation" value="Register"></s:submit>
			</div>
		</s:form>

	</body>
</html>