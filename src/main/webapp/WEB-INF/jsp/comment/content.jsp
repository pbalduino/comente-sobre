<form method='post' action='/list'>
	<label for='subject'>Assunto: </label>${subject}<input type='hidden'
		id='subject' name='comment.subject' value='${subject}'><br />
	<label for='email'>Email: </label><input type='email' id='email'
		name='comment.email' size='60'><br /> <label for='content'>Comentário:</label><br />
	<textarea rows="20" cols="55" id='content' name='comment.content'></textarea>
	<br /> <input type='submit' value='Incluir'>
</form>
<a href="/">Voltar</a>