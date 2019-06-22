package com.course.buildings;

public class School extends Building{
	private int numClassrooms;
	private String gradeLevel;

	public int getNumClassrooms(){
	return numClassrooms;
}
	public String getGradeLevel(){
	return gradeLevel;
}

	public void setNumClassrooms(int numClassrooms){
	this.numClassrooms = numClassrooms;
}
	public void setGradeLevel(String gradeLevel){
	this.gradeLevel = gradeLevel;
}
}