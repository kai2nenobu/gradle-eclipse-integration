package com.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GreetingTest {
	private Greeting sut;

	@Before
	public void setup() {
		sut = new Greeting();
	}

	@Test
	public void greeet_to_john() {
		assertThat(sut.greet("John"), is("Hello John"));
	}

	@Test
	public void greet_to_anonymous() {
		assertThat(sut.greet(null), is("Hello anonymous"));
	}

}
