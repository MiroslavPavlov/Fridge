package diner.recipes; // // In this case we will create a new object for every single recepie, wouldn't it be better if we put all of the
                       // recepies in some kind of a Map and set the ID of the map to be a String with the products of the recepie and the value of the map
                       //a String with the recepie itself
                    

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
	static Recipe createRecipe(String[] ingredients , double[] amount, String name){ // didn't we decided that we should add the amound later?
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
