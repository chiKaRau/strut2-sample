package com.example.helloworld;

public class HelloWorldAction {
	private String greeting;
	private String message;

	public String execute() {
		setGreeting("Hello World from Struts 2 Greeting");
		setMessage("Hello World from Struts 2 Message");
		return "success";
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}