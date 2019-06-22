/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democandles;

/**
 *
 * @author Lycan
 */
public class DemoCandles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Candle candle = new Candle();
        ScentedCandle candle2 = new ScentedCandle();
        candle.setColor("White");
        candle.setHeight(30);
        candle2.setColor("Yellow");
        candle2.setScent("Mint");
        candle2.setHeight(35);
        System.out.println("The candle's color is: "+candle.getColor()
                +", its height is of: "+candle.getHeight()
                +", and its price is of: $"+candle.getPrice());
        System.out.println("The scentedcandle's color is: "+candle2.getColor()
                +", its height is of: "+candle2.getHeight()
                +", its scent is of: "+candle2.getScent()
                +", and its price is of: $"+candle2.getPrice());
    }
    
}
