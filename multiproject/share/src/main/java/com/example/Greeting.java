package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Greeting {
	private static final Logger logger = LoggerFactory.getLogger(Greeting.class);

	public String greet(String you) {
		if (you == null) you = "anonymous";
		logger.info("Greeting to " + you);
		return "Hello " + you;
	}

}
