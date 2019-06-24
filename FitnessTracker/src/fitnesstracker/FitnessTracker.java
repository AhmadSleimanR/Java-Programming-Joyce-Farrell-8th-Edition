/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesstracker;
import model.FitTrack;

/**
 *
 * @author Usuario
 */
public class FitnessTracker {
            
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FitTrack fit = new FitTrack();
        System.out.println("The Activity is: "+fit.getFitActivity()+
                "\nThe Number of minutes is: "+fit.getNumOfMin()+
                "\nAnd the Date is: "+fit.getDate());
    }
    
}
