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
public class IgneousRock extends Rock{
    public IgneousRock(int sampleNumber, int weight){
        super(sampleNumber, weight);
        description = "Igneous rock, or magmatic rock, is one of the three main rock types, the others being sedimentary \n"
                + "And metamorphic. Igneous rock is formed through the cooling and solidification of magma or lava. \n"
                + "The magma can be derived from partial melts of existing \n"
                + "Rocks in either a planet's mantle or crust.";
    }
}
