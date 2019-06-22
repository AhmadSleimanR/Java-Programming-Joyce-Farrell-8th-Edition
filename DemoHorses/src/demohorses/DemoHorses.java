/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohorses;

import java.util.Scanner;

/**
 *
 * @author Lycan
 */
public class DemoHorses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        System.out.print("Please enter the name for the regular horse >> ");
        horse1.setName(input.nextLine());
        System.out.print("Now, please enter the color of the horse >> ");
        horse1.setColor(input.nextLine());
        System.out.print("Finally, please enter the birth year of the horse >> ");
        horse1.setBirthYear(input.nextInt());
        input.nextLine();
        System.out.print("Now, please enter the racehorse's name >> ");
        horse2.setName(input.nextLine());
        System.out.print("Now,please enter the color of the racehorse >> ");
        horse2.setColor(input.nextLine());
        System.out.print("Now, please enter the birth year of the racehorse >> ");
        horse2.setBirthYear(input.nextInt());
        input.nextLine();
        System.out.print("Finally, please enter the amount of races"
                + " of the race horse >> ");
        horse2.setnRaces(input.nextInt());
        input.nextLine();
        System.out.println("--------------------------------");
        System.out.println("The color of "+horse1.getName()+" is: "+horse1.getColor()
                +", and its birth year was in: "+horse1.getBirthYear());
        System.out.println("The color of "
                +horse2.getName()
                +" is: "+horse2.getColor()
                +", its birth year was in: "+horse2.getBirthYear()
                +", and the amount of races that he has participated in are of: "
                +horse2.getnRaces());
    }
}
