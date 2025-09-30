package oracle.project.Inventory;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		//add scanner and temp attributes
		Scanner in = new Scanner(System.in);
		
		int TempNumber;
		String TempName;
		int TempQty;
		double TempPrice;
		boolean TempActive = false;

		//user input
		System.out.append("Insert Product Number : ");
		TempNumber = in.nextInt();
		System.out.append("Insert Product Name : ");
		TempName = in.next();
		System.out.append("Insert Product Quantity : ");
		TempQty = in.nextInt();
		System.out.append("Insert Product Price : ");
		TempPrice = in.nextDouble();
		System.out.println("");
		//create Product P1
		Product P1 = new Product(TempNumber,TempName,TempQty,TempPrice,TempActive);
		
		in.nextLine();
		//user input
		System.out.append("Insert Product Number : ");
		TempNumber = in.nextInt();
		System.out.append("Insert Product Name : ");
		TempName = in.next();
		System.out.append("Insert Product Quantity : ");
		TempQty = in.nextInt();
		System.out.append("Insert Product Price : ");
		TempPrice = in.nextDouble();
		System.out.println("");
		in.close();
		//Create  Product P2
		Product P2 = new Product(TempNumber,TempName,TempQty,TempPrice,TempActive);
		
		Product P3 = new Product(3,"Newtean", 	40, 6.75,true);
		Product P4 = new Product(4,"Pops", 		43, 7.6, true);	
		Product P5 = new Product(5,"Mugen", 	3,  2.76,true);
		Product P6 = new Product(6,"Nighten", 	51, 5.6, true);

		P6.setProductPrice(3.4);  //Change P6 Price to 3.6
		//Show Products here
		P1.showProductInformation();
		P2.showProductInformation();
		P3.showProductInformation();
		P4.showProductInformation();
		P5.showProductInformation();
		P6.showProductInformation();
	}

}
