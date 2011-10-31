package br.eti.balduino.comente.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import org.junit.Before;
import org.junit.Test;

public class CommentTest {

	private Comment comment;

	@Before
	public void setUp() {
		comment = new Comment();
	}

	@Test
	public void instancesWithSameValuesShouldBeEquals() {
		comment.setSubject("mimimi");
		comment.setId(123);
		
		Comment anotherComment = new Comment();
		anotherComment.setId(123);
		anotherComment.setSubject("mimimi");
		assertThat(comment, is(anotherComment));
	}

	@Test
	public void instancesWithDifferentIdShouldNotBeEquals() {
		comment.setSubject("mimimi");
		comment.setId(122);
		
		Comment anotherComment = new Comment();
		anotherComment.setId(123);
		anotherComment.setSubject("mimimi");
		assertThat(comment, is(not(anotherComment)));
	}
	
	@Test
	public void instancesWithDifferentContentShouldNotBeEquals() {
		comment.setContent("fffuuuuuuu");
		comment.setId(122);
		
		Comment anotherComment = new Comment();
		anotherComment.setId(123);
		anotherComment.setContent("meh");
		assertThat(comment, is(not(anotherComment)));
	}

	@Test
	public void instancesWithDifferentNameShouldNotBeEquals() {
		comment.setSubject("foo");
		comment.setId(123);
		
		Comment anotherComment = new Comment();
		anotherComment.setId(122);
		anotherComment.setSubject("bar");
		assertThat(comment, is(not(anotherComment)));
	}
	
	@Test
	public void cannotBeEqualsNull(){
		assertThat(comment.equals(null), is(false));
	}
	
	@Test
	public void cannotBeEqualsAnObjectOfDifferentType(){
		assertThat(comment.equals(""), is(false));
	}
	
	@Test
	public void shouldBeEqualsItself(){
		assertThat(comment.equals(comment), is(true));
	}
}