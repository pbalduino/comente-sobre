<form method='post' action='${pageContext.request.contextPath}/list'>
	<c:if test="${errors != null}">
		<div id='errors'>
			<ul>
				<c:forEach var="error" items="${errors}">
					<li>${error.message}</li>
				</c:forEach>
			</ul>
		</div>
	</c:if>
	<label for='subject'>Assunto: </label>${subject}<input type='hidden'
		id='subject' name='comment.subject' value='${subject}'><br />
	<label for='email'>Email: </label><input type='email' id='email'
		name='comment.email' size='60' value="${comment.email}"><br />
	<label for='content'>Comentário:</label><br />
	<textarea rows="20" cols="55" id='content' name='comment.content'>${comment.content}</textarea>
	<br /> <input type='submit' value='Incluir'>
</form>
<a href="/">Voltar</a>