package com.crm.bo;

import java.util.ArrayList;

public class Book extends Ressource {

	private String author;
	private int isbnCode;
	
	public Book() {
		super();
	}
	
	public Book(String _title, float _guarantee, String _author, int _isbn) {
		super(_title, _guarantee);
		
		author = _author;
		isbnCode = _isbn;
		
	}
	
	public Book(String _title, float _guarantee, String _author, int _isbn, Location _location) {
		super(_title, _guarantee, _location);
		
		author = _author;
		isbnCode = _isbn;
		
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getIsbnCode() {
		return isbnCode;
	}
	
	/*
	 * 
	public void setAuthor(String _author) {
		author = _author;
	}
		
	public void setIsbnCode(int _isbn) {
		isbnCode = _isbn;
	}
	
	*/
	
}
