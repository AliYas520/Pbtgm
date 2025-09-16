package triangle;

import java.util.Scanner;

public class PascalTriangle {

	private static final Scanner input = new Scanner(System.in);

	public PascalTriangle() {

		System.out.println("");
		System.out.println("- Pascal's Triangle -");
		System.out.append("How tall should the pyramid be : ");
		int rows = input.nextInt();
		int coef = 1;

		for (int i = 0; i < rows; i++) {
			for (int space = 1; space < rows - i; ++space) {
				System.out.print("  ");
			}

			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == 0)
					coef = 1;
				else
					coef = coef * (i - j + 1) / j;

				System.out.printf("%4d", coef);
			}

			System.out.println();
		}
		System.out.println("");
		System.out.println("Thank you!");
	}
}
