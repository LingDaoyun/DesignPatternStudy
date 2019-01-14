package org.yulang.builderPattern.main;
/**
 * 建造者模式，我们不需要关注内部构建细节，根据相关构造方法，就可以得到相应的一套对象
 * @author lsihao
 *
 */
public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vgMeal = mealBuilder.prepareVegMeal();
		vgMeal.showItems();
		Meal nonMeal = mealBuilder.prepareNonMeal();
		nonMeal.showItems();
	}
}
