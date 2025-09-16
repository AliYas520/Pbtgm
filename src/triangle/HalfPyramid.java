package triangle;

import java.util.Scanner;

public class HalfPyramid {

	private static final Scanner input = new Scanner(System.in);

	public HalfPyramid() {

		System.out.println("");
		System.out.println("- Half Pyramid -");
		System.out.append("How tall should the pyramid be : ");
		int rows = input.nextInt();
		int k = 0, count = 0, count1 = 0;

		for (int i = 1; i <= rows; ++i) {
			while (k != i) {

				if (count <= rows - 1) {
					System.out.print((k + 1) + " ");
					++count;

				} else {
					++count1;
					System.out.print((i + k - 2 * count1) + " ");
				}

				++k;
			}
			count1 = count = k = 0;

			System.out.println();
		}
		System.out.println("");
		System.out.print("Thank you!");
	}

}
