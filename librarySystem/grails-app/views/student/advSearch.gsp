<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Library System -Advanced Seacrch</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

	<div class="row">
		
		<h1>Library System</h1>

		<formset>

			<legend>Advanced Search for Students</legend>

		<table>

			<g:form action="advResults">

			<tr>

				<td>Name</td>
			
				<td><g:textField name="name"/></td>

			</tr>

			<tr>

				<td>Username</td>

				<td><g:textField name="username"/></td>

			</tr>

			<tr>

				<td>Student ID</td>

				<td><g:textField name="studentid"/></td>

			</tr>

			<tr>

				<td>Query Type:</td>

				<td><g:radioGroup name="queryType" labels="['And','Or','Not']" values="['and','or','not']" value="and">


					${it.radio}${it.label}

				</g:radioGroup>

				</td>

			</tr>


			<tr>

				<td/>

				<td>

				<g:submitButton name="search" value="Search"/></td>

			</tr>

				</g:form>

		</table>

	</formset>

		</div>

</body>

</html>

				




