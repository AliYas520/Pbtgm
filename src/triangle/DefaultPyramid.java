package triangle;

import java.util.Scanner;

public class DefaultPyramid {

	private static final Scanner input = new Scanner(System.in);

	public DefaultPyramid() {

		System.out.println("");
		System.out.println("- Star Pyramid -");
		System.out.append("How tall should the pyramid be : ");
		int rows = input.nextInt();
		int k = 0;

		System.out.println("");
		for (int i = 1; i <= rows; ++i, k = 0) {
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print(" ");
			}
			while (k != 2 * i - 1) {
				System.out.print("*");
				++k;
			}

			System.out.println();
		}
		System.out.println("");
		System.out.print("Thank you!");
	}

}
