package main;

/**
 *
 * @author lycan
 */
public class Package {
    private final double[][] PRICES = {{1,2.00,1.50,0.50},
                                              {9,3.00,2.35,1.50},
                                              {17,4.50,3.25,2.15}};
    private int weight;
    private char shippingMethod;
    protected double shippingCost;
    public Package(int weight, char shippingMethod){
        this.weight = weight;
        this.shippingMethod = shippingMethod;
        calculateCost();
    }
    protected final void calculateCost(){
        if(weight >= PRICES[0][0] 
                && weight < PRICES[1][0]){
            switch(shippingMethod){
                case 'A':
                    shippingCost = PRICES[0][1];
                    break;
                case 'T':
                    shippingCost = PRICES[0][2];
                    break;
                case 'M':
                    shippingCost = PRICES[0][3];
                    break;
            }
        }else if(weight >= PRICES[1][0] 
                && weight < PRICES[2][0]){
            switch(shippingMethod){
                case 'A':
                    shippingCost = PRICES[1][1];
                    break;
                case 'T':
                    shippingCost = PRICES[1][2];
                    break;
                case 'M':
                    shippingCost = PRICES[1][3];
                    break;
            }
        }else if(weight >= PRICES[2][0]){
            switch(shippingMethod){
                case 'A':
                    shippingCost = PRICES[2][1];
                    break;
                case 'T':
                    shippingCost = PRICES[2][2];
                    break;
                case 'M':
                    shippingCost = PRICES[2][3];
                    break;
            }
        }
    }
    
    public void display(){
        int a, b;
        System.out.println("Here's the table: ");
        for(a = 0;a < PRICES.length;++a){
            for(b = 0;b < PRICES[a].length;++b)
                System.out.print(PRICES[a][b]+" ");
            System.out.println();
        }
        System.out.println("And here's the weight: "+weight+"\n"
                +"Shipping method: "+shippingMethod
                +" and cost: "+shippingCost);
    }
}
