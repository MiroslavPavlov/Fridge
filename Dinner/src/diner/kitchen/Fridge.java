package diner.kitchen;

import java.util.Scanner;
import java.util.TreeMap;

public class Fridge extends ProductKeeper {

	// super.listOfAllProucts="milk, cheese, eggs, meat...";
	// protected String listOfAllProducts="milk,cheese,eggs,meat..";

	// Added a treemap that will hold the various products that are stored in
	// the
	// fridge and their respective amounts

	TreeMap<String, Double> ingredients = new TreeMap<String, Double>();

	public void openKeeper() {
		System.out.println("Fridge is opened ");
	}

	public void closeKeeper() {
		System.out.println("Fridge is closed ");
	}

	
	/**
	 * Adds a general product into the refrigerator, if the product already exists
	 * the new amount will be added to the old one, uses String argument to ID the
	 * product and set it as a key, and a double number to use as value
	 */
	
	public void addProduct(String product,double value){
		if(ingredients.containsKey(product)){
			double temp=ingredients.remove(product);
			ingredients.put(product, temp+value);
		}
	}
	
	/**
	 * Removes a general product from the list of ingredients
	 */
	public void removeProduct(String product, double value){
		if(ingredients.containsKey(product)){
		double temp= ingredients.remove(product);
		ingredients.put(product, temp-value);
	} 
	}
	
	
	/**
	 * This is a method that will add the product "Eggs" into the ingredients
	 * map If the product already exists the new value will be added to the old
	 * one
	 */
	public void addEggs(double number) {
		if (ingredients.containsKey("Eggs")) {
			double temp = ingredients.remove("Eggs");
			ingredients.put("Eggs", temp + number);
		} else {
			ingredients.put("Eggs", number);
		}
	}

	/**
	 * This method removes eggs from the list in the fridge
	 * 
	 */
	public void removeEggs(double number) {
		double temp = ingredients.remove("Eggs");
		ingredients.put("Eggs", temp - number);

	}

	/**
	 * Adds milk into the fridge, if there is already milk inside the fridge the
	 * new value will be added to the old one
	 * 
	 */
	public void addMilk(double number) {
		if (ingredients.containsKey("Milk")) {
			double temp = ingredients.remove("Milk");
			ingredients.put("Milk", temp + number);
		} else {
			ingredients.put("Milk", number);
		}
	}

	/**
	 * Removes milk from the fridge
	 */
	public void removeMilk(double number) {
		double temp = ingredients.remove("Milk");
		ingredients.put("Milk", temp - number);
	}
	
	/**
	 * Adds cheese to the fridge, if there is already cheese inside the fridge the
	 * new value will be added to the old one
	 */
	public void addCheese(double number){
		if(ingredients.containsKey("Cheese")){
			double temp=ingredients.remove("Cheese");
			ingredients.put("Cheese", temp+number);
		} else {
			ingredients.put("Cheese", number);
		}
	}
	/**
	 * Removes cheese from the fridge;
	 */
	public void removeCheese(double number) {
		double temp = ingredients.remove("Cheese");
		ingredients.put("Cheese", temp - number);
	}
	
	/**
	 * Adds meat to the fridge, if there is already cheese inside the fridge the
	 * new value will be added to the old one
	 */
	public void addMeat(double number){
		if(ingredients.containsKey("Meat")){
			double temp=ingredients.remove("Meat");
			ingredients.put("Meat", temp+number);
		} else {
			ingredients.put("Meat", number);
		}
	}
	/**
	 * Removes Meat from the fridge;
	 */
	public void removeMeat(double number) {
		double temp = ingredients.remove("Meat");
		ingredients.put("Meat", temp - number);
	}
	
}