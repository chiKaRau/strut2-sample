package com.example;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {

	@Override
	public String execute() {
		// Here you could add any logic needed for the home page, such as loading data
		try {
			System.out.println("Calling Home action");
			return SUCCESS; // This will forward to the Tiles definition for the home page
		} catch (Exception e) {
			System.out.println("ERR: ");
			System.out.println(e);
			return ERROR;
		}
	}
}