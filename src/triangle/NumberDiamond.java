package triangle;

import java.util.Scanner;

public class NumberDiamond {

	private static final Scanner input = new Scanner(System.in);

	public NumberDiamond() {

		System.out.println("");
		System.out.println("- Number Diamond -");
		System.out.append("What number should show up in the middle of the diamond be : ");
		int rows = input.nextInt();
		
		
		//top half
		for (int i = 1; i < rows; i++) {
			for (int j = rows; j > i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print((k) + " ");
			}
			  
			System.out.println();
		}
		//bottom  half
		for (int i = rows; i >= 1; i--) {
			for (int space = 0; space < rows - i; space++) {
				System.out.print("  ");
			}
			for (int left = 1; left <= i; left++) {
				System.out.print(left + " ");
			}
			for (int right = i - 1; right >= 1; right--) {  
				System.out.print((right)+ " ");
			}
			System.out.println();
		}
		System.out.println("");
		System.out.print("Thank you!");
	}

}
