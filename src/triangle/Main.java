package triangle;

import java.util.Scanner;

public class Main {

	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Menu : ");
		System.out.println("1. Star Pyramid");
		System.out.println("2. Number Pyramid");
		System.out.println("3. Half Pyramid (Numbers)");
		System.out.println("4. Inverted Star Pyramid");
		System.out.println("5. Pascal's Triangle");
		System.out.println("6. Inverted Half Triangle");
		System.out.println("7. Exit");
		System.out.println("---------------------------");
		System.out.println("Choose from the option above");
		System.out.println("");

		Integer Option = input.nextInt();
		System.out.println("Option picked : " + Option);

		switch (Option) {
		case 1:
			new DefaultPyramid();
			break;
		case 2:
			new NumberPyramid();
			break;
		case 3:
			new HalfPyramid();
			break;
		case 4:
			new InversePyramid();
			break;
		case 5:
			new PascalTriangle();
			break;
		case 6:
			new InverseNumber();
			break;
		case 7:
			System.out.println("Thank you!");
			break;
		default:
			System.out.println("Please enter a viable option");
		}
	}
}
