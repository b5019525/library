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

			<h3>Book Review</h3>

	<p>Enter a book review</p>

		<button type="button" class="btn btn-success">

			<g:link controller="bookReview" action="create">Book Reviews</g:link>

		</button>

	</div>

	<div class="seccond">

			<h3>Books</h3>

	<p>Display Books</p>

		<button type="button" class="btn btn-success">

			<g:link controller="book" action="index">Books</g:link>

		</button>

	</div>



	


	



	</div>
</div>

</body>

</html>

