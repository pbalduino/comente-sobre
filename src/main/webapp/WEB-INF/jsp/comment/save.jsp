<body>
	<ul>
		<c:forEach items="${commentList}" var="comment">
			<li>${comment.subject} - ${comment.email}</li>
		</c:forEach>
	</ul>
</body>