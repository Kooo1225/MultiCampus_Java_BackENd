package Java_Study.Chapter02;

import javax.swing.JOptionPane;

public class StringCompare {

	public static void main(String[] args) {
		String id = "root";
		String pw = "1234";

		String inputId = JOptionPane.showInputDialog("Input ID : ");
		String inputPw = JOptionPane.showInputDialog("Input PASSWORD : ");

		if (id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println("LOGIN SUCCESS");
		} else {
			System.out.println("LOGIN FAILURE");
		}

	}

}
