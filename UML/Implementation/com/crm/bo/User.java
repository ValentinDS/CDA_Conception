package com.crm.bo;

import java.util.ArrayList;

public class User {
	
	private String lastname;
	private String firstname;
	private float guaranteeAmount;
	
	private ArrayList<Copy> borrowedCopies;
	
	public User() {
		super();
		
	}
	
	public User(String _lastname, String _firstname, float _guarantee) {
		lastname = _lastname;
		firstname = _firstname;
		guaranteeAmount = _guarantee;
		
	}
		
}
