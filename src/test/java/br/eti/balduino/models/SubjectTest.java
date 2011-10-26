package br.eti.balduino.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class SubjectTest {
	
	private Subject subject;

	@Before
	public void setUp(){
		subject = new Subject();
	}
	
	@Test
	public void instancesWithSameValuesShouldBeEquals(){
		subject.setName("mimimi");
		Subject anotherSubject = new Subject();
		anotherSubject.setName("mimimi");
		assertThat(subject, is(anotherSubject));
	}
}
