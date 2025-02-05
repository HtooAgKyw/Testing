package testing;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int num = 5000;

		System.out.println("Your current amount is: 5000");
		
		System.out.println("How much would you like to withdraw: ");
		int withdrawAmount = scan.nextInt();
		
		
		
		if (withdrawAmount > 5000) {
			System.out.println("You can't withdraw more than your current amount!");
			
		}else {
			int currentBalance = num - withdrawAmount;
			System.out.println("U have successfuly withdrawed: "+ withdrawAmount + "\n" + "Your main balance is: " + currentBalance );
		}

	}

}
