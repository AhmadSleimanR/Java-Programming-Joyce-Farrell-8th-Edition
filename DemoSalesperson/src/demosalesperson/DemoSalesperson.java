/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosalesperson;

/**
 *
 * @author lycan
 */
public class DemoSalesperson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Salesperson[] salesPersonArray = new Salesperson[10];
        int i;
        System.out.println("Here are the ten salespeople:");
        for(i = 0;i < salesPersonArray.length;++i){
            salesPersonArray[i] = new Salesperson(9999, 0);
            System.out.println("Number "+(i + 1)+"'s id is: "+salesPersonArray[i].getId()+"\n"+
                    "And his sales value is: "+salesPersonArray[i].getAnnualSalesAmount());
        }
        
    }
    
}
