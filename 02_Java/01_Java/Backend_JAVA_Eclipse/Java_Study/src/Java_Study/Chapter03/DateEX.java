package Java_Study.Chapter03;

import java.util.Date;

public class DateEX {

	public static void main(String[] args) {
		Date date = new Date();

		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();

		System.out.printf("%d시 %d분 %d초", hour, min, sec);

		int year = date.getYear();
		int month = date.getMonth() + 1;
		int today = date.getDate();

		System.out.printf("%d년 %d월 %d일", year + 1900, month, today);
	}

}
