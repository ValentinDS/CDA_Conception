package com.crm.bo;

import java.util.Calendar;

public class Copy {

	private String barcode;
	private Calendar returnDate;
	
	private Ressource ressource;
	
	private User borrower;
	
	public Copy() {
		
		
	}
	
	public Copy(String _barcode, Calendar _returnDate) {
		barcode = _barcode;
		returnDate = _returnDate;	
		
	}
	
	public String getBarCode() {
		return barcode;
		
	}
	
	public Calendar getDate() {
		return returnDate;
	}
	
	public void setBorrower(User _borrower) {
		borrower = _borrower;
		
	}
	
	public void setRessource(Ressource _ressource) {
		ressource = _ressource;
	}
}
