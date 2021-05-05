package forest000014.Calendar2;

import java.util.Scanner;

public class Calendar2 {

	private final int MAX_DAYS[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	private int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	private void printCalendar() {
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("----------------------");
		for(int i = 1; i <= 6; ++i) {
			System.out.print("   ");
		}
		for(int i = 1; i <= 31; ++i) {
			System.out.printf("%2d%c", i, i % 7 == 1 ? '\n' : ' ');
		}
	}
	
	public static void main(String[] args) {
		//System.out.println("There are so many obstacles to overcome -o-");
		Calendar2 cal = new Calendar2();
		int month, days;

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 달을 입력하세요.");
		month = sc.nextInt();
		days = cal.getMaxDaysOfMonth(month);
		System.out.println(month + "th month has " + days + " days.");
		
		cal.printCalendar();
		sc.close();
	}

}
