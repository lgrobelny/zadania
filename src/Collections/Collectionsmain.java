package Collections;

import java.util.*;

public class Collectionsmain {
    public static void main(String[] args) {

//        List<Book> books = new ArrayList();
//        boolean addMore = true;
//        Scanner scanner = new Scanner(System.in);


//
//        do {
//            System.out.println("Podaj nazwe autora");
//            String name = scanner.nextLine();
//            System.out.println("Tytuł");
//            String title = scanner.nextLine();
//            books.add(new Book(name, title));
//            System.out.println("Dodajemy dalej?");
//            String answer = scanner.nextLine();
//            addMore = answer.equals("Tak");
//
//        } while (addMore);

        List<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(233);
        numbers.add(122);

        Student rafal = new Student("Rafal");
        Student krzysiek = new Student("Krzysiek");
        Student ola = new Student("Ola");
        rafal.addGrade(4);
        rafal.addGrade(5);
        ;

        krzysiek.addGrade(4);
        krzysiek.addGrade(2);

        ola.addGrade(2);
        ola.addGrade(6);

        List<Student> students = new ArrayList<>();
        students.add(rafal);
        students.add(krzysiek);
        students.add(ola);



        Collections.sort(students, (o1, o2) -> o2.getMEan().compareTo(o1.getMEan()));
        for (Student student : students) {
            System.out.println(student.getName() + " grades " + student.getGrades());
        }


    }
}
