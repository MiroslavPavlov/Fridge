package diner.recipes;

import java.util.TreeMap;

public class Recipe {

	private static int uniqueID = 1;
	
	private String name;
	private int id;
	private TreeMap<String, Double> receipe;
	
	
	private Recipe(String name) {
		this.name = name;
		this.id = uniqueID ++;
		this.receipe = new TreeMap<String, Double>();
	}
	static Recipe createRecipe(String[] ingredients , double[] amount, String name){
		if(ingredients.length == amount.length){
			Recipe r = new Recipe(name);
			for(int i = 0 ; i < ingredients.length ; i ++){
				r.receipe.put(ingredients[i], amount[i]);
			}
			return r;
		}
		System.out.println("invalit list with ingrediants!");
		return null;
	}
	
}
