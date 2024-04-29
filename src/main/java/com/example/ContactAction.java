package com.example;

import com.opensymphony.xwork2.ActionSupport;

public class ContactAction extends ActionSupport {

	@Override
	public String execute() {
		// Here you could add any logic needed for the contact page
		return SUCCESS; // This will forward to the Tiles definition for the contact page
	}
}