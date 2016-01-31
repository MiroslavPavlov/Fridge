package diner.recipes;

import java.util.HashSet;

public class Book {

private  HashSet<Recipe> recipesBook;

	public HashSet<Recipe> getRecipesBook() {
	return recipesBook;
}

	public Book() {
		this.recipesBook = new HashSet<Recipe>();
	}
	
	void addRecipe(String[] ingredients, double[] amount, String name){
		this.recipesBook.add(Recipe.createRecipe(ingredients, amount, name));
	}
	
}
