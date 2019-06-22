/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoitemsandpets;

/**
 *
 * @author lycan
 */
public class DemoItemsAndPets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();
        item1.setDescription("nice item 1");
        item1.setInvoiceNumber(999875432);
        item1.setPrice(33.80);
        item2.setDescription("nice item 2");
        item2.setInvoiceNumber(999879688);
        item2.setPrice(15.32);
        pet1.setDescription("nice pet 1");
        pet1.setInvoiceNumber(583857382);
        pet1.setPrice(550.50);
        pet1.setHousebroken(true);
        pet1.setNeutered(true);
        pet1.setVaccinated(false);
        pet2.setDescription("nice pet 2");
        pet2.setInvoiceNumber(693847644);
        pet2.setPrice(350.50);
        pet2.setHousebroken(true);
        pet2.setNeutered(false);
        pet2.setVaccinated(false);
        System.out.println("Item1 contains: "
                +"description: "+item1.getDescription()
                +" invoice number: "+item1.getInvoiceNumber()
                +" price: "+item1.getPrice());
        System.out.println("Item2 contains: "
                +"description: "+item2.getDescription()
                +" invoice number: "+item2.getInvoiceNumber()
                +" price: "+item2.getPrice());
        System.out.println("Pet1 contains: "
                +"description: "+pet1.getDescription()
                +" invoice number: "+pet1.getInvoiceNumber()
                +" price: "+pet1.getPrice()
                +" is housebroken: "+pet1.isHousebroken()
                +" is neutered: "+pet1.isNeutered()
                +" is vaccinated: "+pet1.isVaccinated());
        System.out.println("Pet2 contains: "
                +"description: "+pet2.getDescription()
                +" invoice number: "+pet2.getInvoiceNumber()
                +" price: "+pet2.getPrice()
                +" is housebroken: "+pet2.isHousebroken()
                +" is neutered: "+pet2.isNeutered()
                +" is vaccinated: "+pet2.isVaccinated());
    }
    
}
