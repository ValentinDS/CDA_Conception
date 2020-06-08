package com.crm.bo;

import java.util.Calendar;
/* import java.util.Date; */

public class Revue extends Ressource {

	private int nVolume;
	private Calendar releaseDate;
	
	public Revue() {
		super();
		
	}
	
	public Revue(String _title, float _guarantee, int _nVolume, Calendar _releaseDate) {
		super(_title, _guarantee);
		
		nVolume = _nVolume;
		releaseDate = _releaseDate;
		
	}
	
	public Revue(String _title, float _guarantee, int _nVolume, Calendar _releaseDate, Location _location) {
		super(_title, _guarantee, _location);
		
		nVolume = _nVolume;
		releaseDate = _releaseDate;
		
	}
	
	public int getNVolume() {
		return nVolume;
	}
	
	public Calendar getReleaseDate() {
		return releaseDate;
	}
	
	/* 
	public void setNVolume(int _nVolume) {
		nVolume = _nVolume;
	}
	
	public void setReleaseDate(Calendar _releaseDate) {
		releaseDate = _releaseDate;
	}
	*/
	
	
}
