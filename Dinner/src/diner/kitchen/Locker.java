package diner.kitchen;

import java.util.Map;
import java.util.TreeMap;

//sure about the name though? 
public class Locker extends ProductKeeper {

	// super.listOfAllProducts= "salt, pepper, .. " ;
	// protected String listOfAllProducts="salt,pepper,viniger,oil,flouer, herbs
	// and spices";

	TreeMap<String, Double> ingredients = new TreeMap<String, Double>();

	public void openKeeper() {
		System.out.println("Locker is opened! ");
	}

	public void closeKeeper() {
		System.out.println("Locker is closed! ");
	}
	/**
	 * Returns an array of all the products that have bin added to the locker
	 * writing down only their String Names
	 */
	public String[] ingredientsStringsToArray(){
		String[] temp=new String[this.ingredients.size()];
		int i=0;
		for(Map.Entry<String, Double> entry : this.ingredients.entrySet()){
			temp[i]=entry.getKey();
			i++;
		}
		return temp;
	}
	/**
	 * Returns an array of the values of all the products that have bin added
	 * to the locker
	 */
	public double[] ingredientsValuesToArray(){
		double[] temp=new double[this.ingredients.size()];
		int i=0;
		for(Map.Entry<String, Double> entry : this.ingredients.entrySet()){
			temp[i]=entry.getValue();
			i++;
		}
		return temp;
	}
	
	/**
	 * Adds a general product into the refrigerator, if the product already
	 * exists the new amount will be added to the old one, uses String argument
	 * to ID the product and set it as a key, and a double number to use as
	 * value
	 */

	public void addProduct(String product, double value) {
		if (this.ingredients.containsKey(product)) {
			double temp = this.ingredients.remove(product);
			this.ingredients.put(product, temp + value);
		}
	}

	/**
	 * Removes a general product from the list of ingredients
	 */
	public void removeProduct(String product, double value) {
		if (this.ingredients.containsKey(product)) {
			double temp = this.ingredients.remove(product);
			this.ingredients.put(product, temp - value);
		}
	}

	/**
	 * This is a method that will add the product "Cooking oil" into the
	 * ingredients map If the product already exists the new value will be added
	 * to the old one
	 */
	public void addOil(double number) {
		if (this.ingredients.containsKey("Oil")) {
			double temp = ingredients.remove("Oil");
			this.ingredients.put("Oil", temp + number);
		} else {
			this.ingredients.put("Oil", number);
		}
	}

	/**
	 * This method removes Cooking oil from the list in the locker
	 * 
	 */
	public void removeOil(double number) {
		double temp = this.ingredients.remove("Oil");
		this.ingredients.put("Oil", temp - number);
		
	}

	/**
	 * Adds Flour into the locker, if there is already Flour inside the locker
	 * the new value will be added to the old one
	 * 
	 */
	public void addFlour(double number) {
		if (this.ingredients.containsKey("Flour")) {
			double temp = this.ingredients.remove("Flour");
			this.ingredients.put("Flour", temp + number);
		} else {
			this.ingredients.put("Flour", number);
		}
	}

	/**
	 * Removes Flour from the locker
	 */
	public void removeFlour(double number) {
		double temp = this.ingredients.remove("Flour");
		this.ingredients.put("Flour", temp - number);
	}

	/**
	 * Adds Vinegar to the locker, if there is already Vinegar inside the locker
	 * the new value will be added to the old one
	 */
	public void addVinegar(double number) {
		if (this.ingredients.containsKey("Vinegar")) {
			double temp = this.ingredients.remove("Vinegar");
			this.ingredients.put("Vinegar", temp + number);
		} else {
			this.ingredients.put("Vinegar", number);
		}
	}

	/**
	 * Removes Vinegar from the locker;
	 */
	public void removeCheese(double number) {
		double temp = this.ingredients.remove("Vinegar");
		this.ingredients.put("Vinegar", temp - number);
	}

	/**
	 * Adds Pepper to the locker, if there is already cheese inside the locker
	 * the new value will be added to the old one
	 */
	public void addPepper(double number) {
		if (this.ingredients.containsKey("Pepper")) {
			double temp = this.ingredients.remove("Pepper");
			this.ingredients.put("Pepper", temp + number);
		} else {
			this.ingredients.put("Meat", number);
		}
	}

	/**
	 * Removes Pepper from the locker;
	 */
	public void removePepper(double number) {
		double temp = this.ingredients.remove("Pepper");
		this.ingredients.put("Pepper", temp - number);
	}

}
