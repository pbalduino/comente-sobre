<body>
	<div id='content'>
		Status: ${notice}<br />${subject}
		<div id='popular'>
			<h2>Assuntos mais populares</h2>
		</div>
		<div id='add'>
			<h2>Deixe seu comentário</h2>
			<form method='post' action="/new">
				<label for='subject'>Assunto: </label> <input type='text' size='60'
					id='comment_subject' name='comment.subject'
					placeholder='que assunto você deseja comentar?'><br />
				<textarea id='comment_content' name='comment.content' rows="20"
					cols="55"
					placeholder="escreva o que você pensa a respeito, mas seja educado como se sua mãe fosse ler o que você escreveu"></textarea>
				<br /> <input type='submit' value='Comentar'>
			</form>
		</div>
	</div>
</body>