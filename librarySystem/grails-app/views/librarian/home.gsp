<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Library</title>
	<asset:stylesheet src="home.css"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
   

    <div id="content" role="main">

	<div class="row">
	
		<div class="first">

			<h3>Course</h3>

	<p>Enter course details or create course</p>

		<button type="button" class="btn btn-success">

			<g:link controller="course" action="create">Courses</g:link>

		</button>

	</div>



	
		<div class="seccond">

			<h3>Student</h3>

	<p>Add, create or register students</p>

		<button type="button" class="btn btn-success">

			<g:link controller="student" action="create">Add Student</g:link>

		</button>

	</div>


		<div class="third">

			<h3>Book</h3>

	<p>Add books to the library</p>

		<button type="button" class="btn btn-success">

			<g:link controller="book" action="create">Add Book</g:link>

		</button>

	</div>

	


	<div class="fourth">

			<h3>Librarian</h3>

	<p>Create or register other librarians</p>

		<button type="button" class="btn btn-success">

			<g:link controller="librarian" action="create">Add Librarian</g:link>

		</button>

	</div>

	</div>
</div>

</body>

</html>

