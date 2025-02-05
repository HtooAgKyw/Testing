package testing;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your blood pressure:");

		int num = scan.nextInt();

		if (num >= 90 && num <= 120) {
			System.out.print("Normal Blood Pressure!");
		} else if (num >= 121 && num <= 160) {
			System.out.print("High Blood Pressure! Go the Nearest Clinic!");
		} else {
			System.out.println("U are about to die!");
		}

	}

}
