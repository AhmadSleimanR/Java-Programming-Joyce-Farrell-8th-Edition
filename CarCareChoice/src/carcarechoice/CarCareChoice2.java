/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carcarechoice;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CarCareChoice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        String[] carCareShopList = {"oil change","tire rotation","battery check","brake inspection"};
        double[] carCarePricesList = {25, 22, 15, 5};
        int i;
        boolean encountered = false;
        String entered;
        entered = JOptionPane.showInputDialog(null, "Enter a service name").toLowerCase();
        for(i = 0;i < carCareShopList.length && encountered == false;++i){
            switch(entered.charAt(i)){
                case 'o':
                    if(entered.charAt(i + 1) == 'i')
                        if(entered.charAt(i + 2) == 'l'){
                            encountered = true;
                            JOptionPane.showMessageDialog(null, "The service you entered was: "+carCareShopList[0]+"\n"+
                            "And the price for such service is of: $"+carCarePricesList[0]);
                        }
                    break;
                case 't':
                    if(entered.charAt(i + 1) == 'i')
                        if(entered.charAt(i + 2) == 'r'){
                            encountered = true;
                            JOptionPane.showMessageDialog(null, "The service you entered was: "+carCareShopList[1]+"\n"+
                            "And the price for such service is of: $"+carCarePricesList[1]);
                        }
                    break;
                case 'b':
                    if(entered.charAt(i + 1) == 'r'){
                        if(entered.charAt(i + 2) == 'a'){
                            encountered = true;
                            JOptionPane.showMessageDialog(null, "The service you entered was: "+carCareShopList[3]+"\n"+
                            "And the price for such service is of: $"+carCarePricesList[3]);
                        }
                    }else if(entered.charAt(i + 1) == 'a')
                                if(entered.charAt(i + 2) == 't'){
                                    encountered = true;
                                    JOptionPane.showMessageDialog(null, "The service you entered was: "+carCareShopList[2]+"\n"+
                                    "And the price for such service is of: $"+carCarePricesList[2]);
                        }
                    break;
            }
        }
        if(encountered == false)
            JOptionPane.showMessageDialog(null, "The service requested was either mispelled or doesn't exist.");
    }
    
}
