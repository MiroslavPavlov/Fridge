package diner.recipes; // Аз си го представях, че всички рецепти са в един Мап и ключа им е продуктите, а валюто им е самата рецепта. 
                       // И понеже ние ще ги въвеждаме на ръка предварително, има ли нужда от такива методи? Така за всяка рецепта ще създаваме нов обект.
                    

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
