package Studentapplication;

import java.util.Locale;
import java.util.Scanner;

import Studentapplication.entitiesGradeStudent.Student;

public class TestStudent {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println();
        System.out.print("Name:");
        student.name = sc.nextLine();

        System.out.println();
        System.out.print("Nota 1° trimestre:");
        student.grade1 = sc.nextDouble();

        System.out.println();
        System.out.print("Nota 2° trimestre:");
        student.grade2 = sc.nextDouble();

        System.out.println();
        System.out.print("Nota 3° trimestre:");
        student.grade3 = sc.nextDouble();

        System.out.printf("Final Grade: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f Points %n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
