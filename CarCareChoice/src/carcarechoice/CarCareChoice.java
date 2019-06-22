package carcarechoice;
import javax.swing.JOptionPane;

public class CarCareChoice {
    public static void main(String[] args) {
        // TODO code application logic here
        String[] carCareShopList = {"oil change","tire rotation","battery check","brake inspection"};
        double[] carCarePricesList = {25, 22, 15, 5};
        int i;
        boolean encountered = false;
        String entered;
        entered = JOptionPane.showInputDialog(null, "Enter a service name").toLowerCase();
        for(i = 0;i < carCareShopList.length;++i){
            if(entered.equals(carCareShopList[i])){
                encountered = true;
                JOptionPane.showMessageDialog(null, "The service you entered was: "+carCareShopList[i]+"\n"+
                        "And the price for such service is of: $"+carCarePricesList[i]);
            }
        }
        if(encountered == false)
            JOptionPane.showMessageDialog(null, "The service requested was either mispelled or doesn't exist.");
    }
    
}
