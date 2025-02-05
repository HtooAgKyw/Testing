package testing;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int array[] = new int[5];

		System.out.println("Enter 5 elements for the array:");

		for (int i = 0; i < array.length; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("Here what you entered: " + array[i]);
		}
		
	}

}
