package triangle;

import java.util.Scanner;

public class InversePyramid {

	private static final Scanner input = new Scanner(System.in);

	public InversePyramid() {

		System.out.println("");
		System.out.println("- Inverted Star Pyramid -");
		System.out.append("How tall should the pyramid be : ");
		int rows = input.nextInt();

		for (int i = rows; i >= 1; --i) {
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print("  ");
			}

			for (int j = i; j <= 2 * i - 1; ++j) {
				System.out.print("* ");
			}

			for (int j = 0; j < i - 1; ++j) {
				System.out.print("* ");
			}

			System.out.println("");
		}
		System.out.println("");
		System.out.print("Thank you!");
	}

}
