package oracle.project.Inventory;

import java.util.Scanner;

public class Product {

	//Instance field declarations
	private int ProductNumber;			
	private String ProductName;
	private double ProductPrice;
	private int ProductQuantity;
	private boolean ProductActive; 
	//constructor
	public Product() {
		ProductNumber = 0;
		ProductName = "Null";
		ProductQuantity = 00;
		ProductPrice = 00.00;
		ProductActive = true;
	}
	//constructor with parameter
	public Product(int number, String name, int qty, double price, boolean available) {
		this.ProductNumber = number;
		this.ProductName = name;
		this.ProductQuantity = qty;
		this.ProductPrice = price;
		this.ProductActive = available;
	}
	
	//getter
	public int getProductNumber() {
		return ProductNumber;
	}
	public String getProductName() {
		return ProductName;
	}
	public int getProductQuantity() {
		return ProductQuantity;
	}
	public double getProductPrice() {
		return ProductPrice;
	}
	public boolean getProductActive() {
		return ProductActive;
	}
	
	//setter
	public void setProductNumber(int number) {
		this.ProductNumber = number;
	}
	public void setProductName(String name) {
		this.ProductName = name;
	}
	public void setProductQuantity(int qty) {
		this.ProductQuantity = qty;
	}
	public void setProductPrice(double price) {
		this.ProductPrice = price;
	}
	public void setProductActive(boolean available) {
		this.ProductActive = available;
	}
	
	//Print to String
	public void showProductInformation() {
		ProductActive = ProductQuantity >= 1 ? true : false;		//Three param operator,  if PQty >= 1, then is available
		String Info = "Item Number 		: "+ ProductNumber
					+ "\nName 			: "+ ProductName 
					+ "\nQuantity in Stock 	: "+ProductQuantity
					+ "\nPrice 			: "+ ProductPrice
					+ "\nStock Price		: "+ ProductQuantity*ProductPrice
					+ "\nProduct Status		: "+ ProductActive;
		System.out.println(Info);
		System.out.println();
	}
}