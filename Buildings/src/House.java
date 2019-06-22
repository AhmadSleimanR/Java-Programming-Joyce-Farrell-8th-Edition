package com.course.buildings;

public class House extends Building{
	private int numBedrooms;
	private int numBaths;


public int getNumBedrooms(){
	return numBedrooms;
}

public int getNumBaths(){
	return numBaths;
}

public void setNumBedrooms(int numBedrooms){
	this.numBedrooms = numBedrooms;
}

public void setNumBaths(int numBaths){
	this.numBaths = numBaths;
}
}