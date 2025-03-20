package main;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<Food> cookedFoods = new ArrayList<Food>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Food> getCookedFoods() {
		return cookedFoods;
	}

	public void setCookedFoods(ArrayList<Food> cookedFoods) {
		this.cookedFoods = cookedFoods;
	}

	public Chef(String name) {
		this.name = name;
		
	}
	
	public void addCookedFood(Food food) {
		this.cookedFoods.add(food);
	}
	
	public void showCookHistory() {
		System.out.printf("%s's Cooking History:\n", this.name);
		for (Food food : this.cookedFoods) {
			System.out.printf("   - %s\n", food.getName());
		}
	}

}
