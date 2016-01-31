package diner.kitchen;

import java.util.Scanner;

public abstract class ProductKeeper {
	
	protected String listOfAllProducts;
	protected String userProducts;
	
	protected abstract void openKeeper();
	
	protected abstract void closeKeeper();
	
	public void addProductInKeeper(){
		System.out.println("Hello! Here's a list with some products! ");
		listOfAllProducts.toString();  //prints all products available(String)
		System.out.println("You can add your product now: ");
		Scanner sc= new Scanner(System.in);
		String product= sc.nextLine(); // user types a product
		
		if(listOfAllProducts.contains(product) && !userProducts.contains(product)){ // checks if the product exists in the list
			userProducts=userProducts + "," + product;
		} // adds a product in the user's list
		
		System.out.println("Do you want to add other products? ");
		String answer = sc.nextLine();
		if(answer.equals("yes")){
			addProductInKeeper();
		}
		else return;
		
		
	}
	public void removeProduct(){ // removes a product from keeper
		Scanner sc= new Scanner(System.in);
		String product= sc.nextLine();
		if(userProducts.contains(product)){
		  userProducts.replace(product, "");
		}
		else System.out.println("There has been a mistake! You don't have this product!");	
	}
	
	

}
