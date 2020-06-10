package arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int [] pierwsza = {1, 3, 5, 3, 5, 7, 8, 3, 7};
        int [] druga = {2, 3, 6, 4, 2, 7, 8, 9, 1};
        arrayReverse(pierwsza);
        duplicates(pierwsza, druga);


    }

    public static int[] arrayReverse(int[] array){
        System.out.println("Test?");
        int[] tablica1 = new int[array.length];
        for(int i = 0; i < array.length; i++){
            tablica1[i] = array[array.length - 1 - i];
            System.out.print(tablica1[i] + "  |   ");
        }

        return tablica1;
    }

    public static void duplicates(int[] a, int[]b){
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    System.out.println("We have a duplicate! " + a[i]);
                }
            }
        }
    }
}
