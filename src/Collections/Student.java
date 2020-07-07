package Collections;

import java.util.LinkedList;
import java.util.List;

public class Student {

    private String name;

    private List<Integer> grades = new LinkedList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }
    public void addGrade(Integer grade){
        grades.add(grade);
    }

    public Double getMEan(){
        double sum = 0;
        for(Integer grade : grades){
            sum += grade;
        }
        return sum / (double) grades.size();
    }
}
