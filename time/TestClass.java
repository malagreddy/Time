//program to calculate sum of two time objects and return time 
package time;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hours and minutes");
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		int hours1 = sc.nextInt();
		int minutes1 = sc.nextInt();

		// creating objects of TimeClass
		TimeClass time1 = new TimeClass(hours, minutes);
		TimeClass time2 = new TimeClass(hours1, minutes1);

		// call display function
		time1.display();
		time2.display();

		TimeClass obj = new TimeClass();
		obj.sum(time1, time2);
	}

}
