package diner.kitchen;

public class Locker extends ProductKeeper { // sure about the name though? 
	
	super.allProductsInList= "salt, pepper, .. ";
	
	public void openKeeper(){
		System.out.println("Locker is opened! ");
	}
	
	public void closeKeeper(){
		System.out.println("Locker is closed! ");
	}

}
