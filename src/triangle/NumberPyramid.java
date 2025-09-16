package triangle;

import java.util.Scanner;

public class NumberPyramid {

	private static final Scanner input = new Scanner(System.in);

	public NumberPyramid() {

		System.out.println("");
		System.out.println("- Number Pyramid -");
		System.out.append("How tall should the pyramid be : ");
		int rows = input.nextInt();

		for (int i = 1; i <= rows; i++) {

			for (int j = rows; j > i; j--) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print((k) + " ");
			}

			for (int l = i - 1; l >= 1; l--) {
				System.out.print((l) + " ");
			}
			System.out.println();
		}
		System.out.println("");
		System.out.println("Thank you!");

	}
}