package com.example;

public class ErrorAction {
	public String execute() throws Exception {
		// Some risky operation that could throw an exception
		if (true) {
			throw new NullPointerException("A specific error occurred.");
		}
		return "success";
	}
}
