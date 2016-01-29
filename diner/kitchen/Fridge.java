package diner.kitchen;

import java.util.Scanner;

public class Fridge extends ProductKeeper {
	
	super.listOfAllProucts="milk, cheese, eggs, meat...";
	
	public void openKeeper(){
		System.out.println("Fridge is opened ");
	}
	
	public void closeKeeper(){
		System.out.println("Fridge is closed ");
	}
	
}