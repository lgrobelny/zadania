package binary;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int[] tablica = {1, 2, 3, 4, 6,7 , 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length");
        int arrayLengthh = scanner.nextInt();
        int[] arrayForLoop = new int[arrayLengthh];
        System.out.println("Wartosci tablicy");
        for(int i = 0; i < arrayLengthh; i++){
            arrayForLoop[i] = scanner.nextInt();
        }
        System.out.println("Value");
        int valueFromScanner = scanner.nextInt();
        for (int i = 0; i < arrayForLoop.length; i++){
            if(arrayForLoop[i] == valueFromScanner){
                System.out.println("We have it at " + i);
            }
        }

    }
}
