package br.eti.balduino.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import org.junit.Before;
import org.junit.Test;

public class SubjectTest {

	private Subject subject;

	@Before
	public void setUp() {
		subject = new Subject();
	}

	@Test
	public void instancesWithSameValuesShouldBeEquals() {
		subject.setName("mimimi");
		subject.setId(123);
		
		Subject anotherSubject = new Subject();
		anotherSubject.setId(123);
		anotherSubject.setName("mimimi");
		assertThat(subject, is(anotherSubject));
	}

	@Test
	public void instancesWithDifferentIdShouldNotBeEquals() {
		subject.setName("mimimi");
		subject.setId(122);
		
		Subject anotherSubject = new Subject();
		anotherSubject.setId(123);
		anotherSubject.setName("mimimi");
		assertThat(subject, is(not(anotherSubject)));
	}

	@Test
	public void instancesWithDifferentNameShouldNotBeEquals() {
		subject.setName("foo");
		subject.setId(123);
		
		Subject anotherSubject = new Subject();
		anotherSubject.setId(122);
		anotherSubject.setName("bar");
		assertThat(subject, is(not(anotherSubject)));
	}
	
	public void nameCannotBeNull(){
		assertThat(subject.getName(), is(not(null)));
	}

}
