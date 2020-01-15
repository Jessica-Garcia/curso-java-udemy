package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.printf("Final Grade = %.2f%n", student.finalGrade());
		if(student.finalGrade() >= 60.0) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS %n", student.missingPoints());
		}
		
		sc.close();
	}

}
