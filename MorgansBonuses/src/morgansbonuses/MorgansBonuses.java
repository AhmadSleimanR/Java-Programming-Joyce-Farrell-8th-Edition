package morgansbonuses;
import java.util.Scanner;

public class MorgansBonuses {
    public static void main(String[] args) {
        double[][] bonusesArray = {{5.00,9.00,16.00,22.00,30.00},
                                                {10.00,12.00,18.00,24.00,36.00},
                                                {20.00,25.00,32.00,42.00,53.00},
                                                {32.00,38.00,45.00,55.00,68.00},
                                                {46.00,54.00,65.00,77.00,90.00},
                                                {60.00,72.00,84.00,96.00,120.00},
                                                {85.00,100.00,120.00,140.00,175.00}};
        Scanner input = new Scanner(System.in);
        final int QUIT = 999;
        int weeksWorked, positiveReviews;
        System.out.print("Enter the amount of weeks worked: ");
        weeksWorked = input.nextInt();
        input.nextLine();
        System.out.print("Now, enter the amount of positive reviews received: ");
        positiveReviews = input.nextInt();
        input.nextLine();
        while(weeksWorked != QUIT || positiveReviews != QUIT){
            if(weeksWorked > 5)
                weeksWorked = 6;
            if(positiveReviews > 3)
                positiveReviews = 4;
            display(bonusesArray[weeksWorked][positiveReviews]);
            System.out.print("Enter the amount of weeks worked: ");
            weeksWorked = input.nextInt();
            input.nextLine();
            System.out.print("Now, enter the amount of positive reviews received: ");
            positiveReviews = input.nextInt();
            input.nextLine();
        }
        System.out.println("Goodbye.");
    }
    public static void display(double bonus){
        System.out.println("Your bonus is of: $"+bonus);
    }
}
