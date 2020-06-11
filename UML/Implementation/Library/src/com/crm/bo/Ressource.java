package com.crm.bo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Ressource {

	protected String title;
	protected float guarantee;
	
	private Location location;
	
	private List<Copy> copies;
	
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
	
	public void addCopy(String _copybarcode, Calendar _returndate) {
		copies.add(new Copy(_copybarcode, _returndate));
	}
	
	public void addCopy(Copy _copy) {
		copies.add(new Copy(_copy.getBarCode(), _copy.getDate()));
		
	}
	
	public float getGuarantee() {
		return guarantee;
	}
	
	public List<Copy> getCopies(){
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
	
	public String ToString() {
		StringBuilder builder = new StringBuilder();
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		
		builder.append(this.title + "\n");
			
		for(Copy copy: copies ) {
		builder.append(copy.hashCode() + " - " + formatDate.format(copy.getDate().getTime()) + "\n");
		
		}
		
		return builder.toString();
	}
	
}
