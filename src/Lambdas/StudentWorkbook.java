package Lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class StudentWorkbook {

    public List<Student> students;

    public StudentWorkbook(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public List<String> getNameOfBetter(){
        return students.stream()
                .filter((Student student) -> student.getFinalGrade() >=4)
                .map(student -> student.getName())
                .collect(Collectors.toList());
    }
}
