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
		
	public String getLastname() {
		return lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public float getGuarantee() {
		return guaranteeAmount;
	}
	
	public void setGuarantee(float _guarantee) {
		guaranteeAmount = _guarantee;
	}
	
	public void setBorrowedCopies(ArrayList<Copy> _borrowedCopies) {
		borrowedCopies = _borrowedCopies;
		
	}
	
	public ArrayList<Copy> getBorrowedCopies() {
		return borrowedCopies;
		
	}
	
}
