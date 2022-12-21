package Project1;
import java.util.Scanner;
public class TipCalculator {

    public static void main(String[] args) {
	// write your code here
        Scanner scnr = new Scanner (System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("What was the bill? $");
        double bill = Double.valueOf(scnr.nextLine());

        System.out.println("How many people are splitting the bill?");
        int people = scnr.nextInt();

        System.out.println("What percent tip are you leaving? (10, 12, 15)");
        int tip = scnr.nextInt();

        //float total = (bill + (tip / 100)) * bill;
        double total = (((tip/100.00) * bill) + bill) / people;
        //System.out.printf("%.2f", total);
        //total = total / 5;
        //System.out.println("Each person owes: $" + total);
        System.out.printf("Each person owes: $%.2f",total);




    }
}
