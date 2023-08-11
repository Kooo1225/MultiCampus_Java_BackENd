package Java_Study.Chapter03;

import java.util.Scanner;

public class ConsoleTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input ID : ");
		String name = sc.next();

		System.out.println("Input Age : ");
		int age = sc.nextInt();

		System.out.println("Your Name is " + name);
		System.out.println("Your Age is " + age);

	}
}
