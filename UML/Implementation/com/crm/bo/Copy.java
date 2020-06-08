package com.crm.bo;

import java.util.Date;

public class Copy {

	private String barcode;
	private Date returnDate;
	
	private Ressource ressource;
	
	private User borrower;
	
	public Copy() {
		
		
	}
	
	public Copy(String _barcode, Date _returnDate) {
		barcode = _barcode;
		returnDate = _returnDate;	
		
	}
	
	public String getCopy() {
		return barcode;
		
	}
	
	public Date getDate() {
		return returnDate;
	}
	
	public void setBorrower(User _borrower) {
		borrower = _borrower;
		
	}
	
	public void setRessource(Ressource _ressource) {
		ressource = _ressource;
	}
}
