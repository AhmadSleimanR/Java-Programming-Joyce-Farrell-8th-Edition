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
public class MetamorphicRock extends Rock{
    public MetamorphicRock(int sampleNumber, int weight){
        super(sampleNumber, weight);
        description = "Metamorphic rocks arise from the transformation of existing rock types, in a process called metamorphism, \n"
                + "Which means \"change in form\". The original rock is subjected to heat \n"
                + "And pressure, causing profound physical or chemical change. The protolith may be a sedimentary, \n"
                + "Igneous, or existing metamorphic rock.";
    }
}
