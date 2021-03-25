package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		stu.nome = sc.nextLine();
		stu.note1 = sc.nextDouble();
		stu.note2 = sc.nextDouble();
		stu.note3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", stu.finalNote());
		
		if (stu.finalNote() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINT%n", stu.missing());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
