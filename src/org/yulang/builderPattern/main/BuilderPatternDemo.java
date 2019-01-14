package org.yulang.builderPattern.main;
/**
 * ������ģʽ�����ǲ���Ҫ��ע�ڲ�����ϸ�ڣ�������ع��췽�����Ϳ��Եõ���Ӧ��һ�׶���
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
