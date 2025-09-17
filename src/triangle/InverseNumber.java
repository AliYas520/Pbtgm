package triangle;

import java.util.Scanner;

public class InverseNumber {

	private static final Scanner input = new Scanner(System.in);

	public InverseNumber() {

		System.out.println("");
		System.out.println("- Inverted Half Triangle -");
		System.out.append("How tall should the pyramid be : ");
		int rows = input.nextInt();

		for (int i = rows; i >= 1; i--) {
			for (int space = 0; space < rows - i; space++) {
				System.out.print("**");
			}
			for (int num = 1; num <= i; num++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		System.out.println("");
		System.out.print("Thank you!");
	}

}
