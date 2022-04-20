package grades;

import java.util.ArrayList;

public class GradesApp {
    public static void main(String[] args) {
        // make an array list of type grades

        // must make a student
        Student student = new Student("Einshtien");
        student.addGrade(100);
        student.addGrade(99);
        student.addGrade(69);
        student.addGrade(97);
        System.out.println(student.getGradeAverage());
    }
}
