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
public class SedimentaryRock extends Rock{
    public SedimentaryRock(int sampleNumber, int weight){
        super(sampleNumber, weight);
        description = "Sedimentary rocks are types of rock that are formed by the deposition and subsequent cementation of mineral \n"
                + "Or organic particles on the floor of oceans or other bodies of water at the Earth's surface.\n"
                + "Sedimentation is the collective name for processes that cause these particles to settle in place. ";
    }
}
