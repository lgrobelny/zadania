package enums;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class enumsclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide workday");
        String dayProvided = scanner.nextLine();

        Day day = Day.valueOf(dayProvided.toUpperCase());

        int workhours = 0;

        switch (day){
            case MONDAY:
            case TUESDAY:
                System.out.println(" 9 hours");
                workhours = 9;
                break;
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("8h");
                workhours = 8;
                break;
            default:
                workhours = 6;
        }



    }
}
