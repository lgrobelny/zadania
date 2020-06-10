package Zadania27;

import java.util.Scanner;

public class DiscountProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        double age = scanner.nextDouble();

        calculateDiscount(age);



    }

    public static double calculateDiscount(double number){
        if(number < 18){
            number = number * 0.75;
            System.out.println("Discount is 25%");
        }else if(number < 65){
            System.out.println("Dicsount is 10");
            number = number * 0.9;
        }else {
            System.out.println("Discount 5%");
            number = number = 0.95;
        }
        return number;
    }

}
