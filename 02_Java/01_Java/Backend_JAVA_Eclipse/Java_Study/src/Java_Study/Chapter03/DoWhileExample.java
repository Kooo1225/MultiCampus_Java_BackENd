package Java_Study.Chapter03;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("Input Message");
		System.out.println("Want Quit Press q");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print("<");
			inputString = sc.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println("\nProgram is Done");
	}
}
