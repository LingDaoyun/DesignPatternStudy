package org.yulang.builderPattern.main;

import org.yulang.builderPattern.impl.ChickenBurger;
import org.yulang.builderPattern.impl.Coke;
import org.yulang.builderPattern.impl.Pepsi;
import org.yulang.builderPattern.impl.VegBurger;

public class MealBuilder {
public Meal prepareVegMeal() {
	Meal meal = new Meal();
	meal.addItem(new VegBurger());
	meal.addItem(new  Coke());
	return meal;
}
public Meal prepareNonMeal() {
	Meal meal = new Meal();
	meal.addItem(new ChickenBurger());
	meal.addItem(new Pepsi() );
	return meal;
}
}
