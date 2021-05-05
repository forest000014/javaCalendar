package forest000014.Calendar2;

public class Calendar2 {

	public static void main(String[] args) {
		//System.out.println("There are so many obstacles to overcome -o-");

		System.out.println("일  월  화  수  목  금  토");
		System.out.println("----------------------");
		for(int i = 1; i <= 6; ++i) {
			System.out.print("   ");
		}
		for(int i = 1; i <= 31; ++i) {
			System.out.printf("%2d%c", i, i % 7 == 1 ? '\n' : ' ');
		}
		
	}

}
