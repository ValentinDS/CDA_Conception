package com.crm.bo;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class Ressource {

	protected String title;
	protected float guarantee;
	
	private Location location;
	
	private ArrayList<Copy> copies;
	
	public Ressource() {
		super();
	};
	
	public Ressource(String _title, float _guarantee) {
		
		title = _title;
		guarantee = _guarantee;
				
		copies = new ArrayList<Copy>(); 
		
	}
	
	public Ressource(String _title, float _guarantee, Location _location) {
		title = _title;
		guarantee = _guarantee;
		
		location = _location;
		
		copies = new ArrayList<Copy>();
		
	}
	

	public void addCopy(String _barcode, Calendar _returnDate) {
		copies.add(new Copy(_barcode, _returnDate));
		
	}
	
	public float getGuarantee() {
		return guarantee;
	}
	
	public ArrayList<Copy> getCopies(){
		return copies;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public void setGuarantee(float _guarantee) {
	 
		guarantee = _guarantee;
	}
	
	public void setTitle(String _title) {
		title = _title;
	}
	
	/** Set the location of this ressource on the library.
	 * @param _location Instance of location
	 */
	public void setLocalisation(Location _location) {
		location = _location;
	}
	
}
