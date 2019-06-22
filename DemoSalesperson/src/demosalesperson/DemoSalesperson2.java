package demosalesperson;

/**
 *
 * @author lycan
 */
public class DemoSalesperson2 {

    public static void main(String[] args) {
        Salesperson[] salesPersonArray = new Salesperson[10];
        int i;
        System.out.println("Here are the ten salespeople:");
        for(i = 0;i < salesPersonArray.length;++i){
            salesPersonArray[i] = new Salesperson(111+i, 25000+(i*5000));
            System.out.println("Number "+(i + 1)+"'s id is: "+salesPersonArray[i].getId()+"\n"+
                    "And his sales value is: "+salesPersonArray[i].getAnnualSalesAmount());
        }
    }
}
