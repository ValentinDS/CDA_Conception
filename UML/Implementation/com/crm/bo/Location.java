package com.crm.bo;

import java.util.ArrayList;

public class Location {

	private int nbSpan;
	private int nbShelf;
	private int level;
	
	private ArrayList<Ressource> stockedRessources;
	
	public Location() {
		super();
	};
		
	public Location(int _nbSpan, int _nbShelf, int _level) {
		
		nbSpan = _nbSpan;
		nbShelf = _nbShelf;
		level = _level;
		
	}
	
	public Location(int _nbSpan, int _nbShelf, int _level, ArrayList<Ressource> _stockedRessources) {
		
		nbSpan = _nbSpan;
		nbShelf = _nbShelf;
		level = _level;
		
		stockedRessources = _stockedRessources;
		
	}
	
	/*
	public void setNbSpan(int _nbSpan) {
		nbSpan = _nbSpan;
	}
	
	public void setNbShelf(int _nbShelf) {
		nbShelf = _nbShelf;
	}
	
	public void setLevel(int _level) {
		level = _level;
	}
	*/
	
	public int getNbSpan() {
		return nbSpan;
	}
	
	public int getNbShelf() {
		return nbShelf;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setStockedRessources(ArrayList<Ressource> _stockedRessources) {
		stockedRessources = _stockedRessources;
	}
	
	public ArrayList<Ressource> getStockedRessources(){
		return stockedRessources;
	}
	
}
