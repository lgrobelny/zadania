package Lambdas;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        Student student1 = new Student("Maria", 4);
        Student student2 = new Student("Danuta", 5);
        Student student3 = new Student("Piotr", 3);
        Student student4 = new Student("Nazar", 4);
        Student student5 = new Student("Lukasz", 6);
        Student student6 = new Student("Radek", 4);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        StudentWorkbook workbook = new StudentWorkbook(students);

        List<String> studentNames = workbook.getNameOfBetter();

        //Collections.sort(students, Comparator.comparing(Student::getName));
//
//        students.forEach(System.out::println);
//
//        System.out.println("STREAM");
//
//        List<String> studenNames = students.stream().filter((Student student) -> student.getFinalGrade() >=4)
//                .map(student -> student.getName())
//                .collect(Collectors.toList());
//
//        studenNames.forEach(System.out::println);
//        studenNames.forEach(System.out::println);


    }
}
