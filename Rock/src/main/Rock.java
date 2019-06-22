/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author lycan
 */
public class Rock {
    private int sampleNumber;
    protected String description;
    private int weight;
    private final String DEFAULTDESCRIPTION = "Unclassified";
    
    public Rock(int sampleNumber, int weight){
        this.sampleNumber = sampleNumber;
        this.weight = weight;
        this.description = DEFAULTDESCRIPTION;
    }

    public int getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(int sampleNumber) {
        this.sampleNumber = sampleNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}
