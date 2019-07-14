/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

import java.io.*;
/**
 *
 * @author lycan
 */
public class DemoIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "ABCDEF";
        byte[] data = s.getBytes();
        OutputStream output;
        try{
            output = System.out;
            output.write(data);
            output.flush();
            output.close();
        }catch(IOException e){
            System.out.println("Message: "+e);
        }
    }
}
