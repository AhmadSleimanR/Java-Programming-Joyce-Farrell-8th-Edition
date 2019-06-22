package main;

/**
 *
 * @author lycan
 */
public class InsuredPackage extends Package{
    private final double[][] INSURANCE = {{0,2.45},
                                            {1.01,3.95},
                                            {3.01,5.55}};
    public InsuredPackage(int weight, char shippingMethod){
        super(weight, shippingMethod);
        addInsurance();
    }
    
    public final void addInsurance(){
        if(super.shippingCost >= INSURANCE[0][0]
                && super.shippingCost < INSURANCE[1][0])
            super.shippingCost += INSURANCE[0][1];
        else if(super.shippingCost >= INSURANCE[1][0]
                && super.shippingCost < INSURANCE[2][0])
            super.shippingCost += INSURANCE[1][1];
        else if(super.shippingCost >= INSURANCE[2][0])
            super.shippingCost += INSURANCE[2][1];
    }
}
