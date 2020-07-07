package Lambdas;

public class Student {

    private String name;
    private int finalGrade;

    public Student(String name, int finalGrade){
        this.name = name;
        this.finalGrade = finalGrade;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student" +
                "name='" + name + '\'' +
                '}' + finalGrade;
    }
}
