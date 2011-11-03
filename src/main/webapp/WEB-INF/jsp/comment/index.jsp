<c:if test="${error != null}">
	<div id='errors'>${error}</div>
</c:if>
<div id='add'>
	<h2>Sobre o que deseja comentar?</h2>
	<form method='post' action="${pageContext.request.contextPath}/what">
		<label for='subject'>Quero comentar sobre </label> <input type='text'
			size='60' id='subject' name='subject'
			placeholder='que assunto você deseja comentar?' autofocus><br />
		<input type='submit' value='Vamos lá'>
	</form>
</div>