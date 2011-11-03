<div id="comments">
	<c:forEach items="${commentList}" var="comment">
		<p><b>${comment.subject}</b><br/>
		<small>Comentado em ${comment.posted} por ${comment.email}</small></p>
		${comment.content}
		<hr />		
	</c:forEach>
</div>
<a href="/">Voltar</a>