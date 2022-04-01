package com.trong.form;

import org.springframework.stereotype.Controller;

@Controller
public class Personform {

	 private String firstName;
	    private String lastName;

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
}
