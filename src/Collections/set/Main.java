package Collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);

        for(Integer i : numbers){
            System.out.println(i);
        }


    }
}
