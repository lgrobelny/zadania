package enums;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class enumsclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a week day");
        String weekDay = scanner.nextLine().toUpperCase();

        Day day = Day.valueOf(weekDay);


    }
}
