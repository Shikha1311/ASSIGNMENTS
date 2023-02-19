package Stream_Assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Fruit {
	private String name;
	private int calories;
	private int price;
	private String color;

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public int getCalories() {
		return calories;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return name + " " + calories + " " + price + " " + color;
	}

}

public class Assignment5Q1 {

	public static ArrayList<Fruit> reverseSort(ArrayList<Fruit> fruits) {
		return (ArrayList<Fruit>) fruits.stream().filter(V -> V.getCalories() < 100)
				.sorted(Comparator.comparingInt(Fruit::getPrice).reversed()).collect(Collectors.toList());

	}

	public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) {

		return (ArrayList<Fruit>) fruits.stream().sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());
	}

	public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits) {
		return (ArrayList<Fruit>) fruits.stream().filter(V -> V.getColor().equalsIgnoreCase("red"))
				.sorted(Comparator.comparingInt(Fruit::getPrice)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		ArrayList<Fruit> a = new ArrayList<Fruit>();
		a.add(new Fruit("Mango", 10, 50, "yellow"));
		a.add(new Fruit("Apple", 20, 60, "Red"));
		a.add(new Fruit("Banana", 300, 70, "yellow"));
		a.add(new Fruit("Strawberry", 400, 80, "Red"));
		a.add(new Fruit("Watermelon", 50, 90, "Red"));
		System.out.println("Sorted list according to calorie in descending  order and calorie less then 100 ......");
		ArrayList<Fruit> a3 = Assignment5Q1.reverseSort(a);
		for (int i = 0; i < a3.size(); i++) {
			System.out.println(a3.get(i));
		}
		System.out.println("Sorted list according to color in ascending  order ......");
		ArrayList<Fruit> a1 = Assignment5Q1.sort(a);
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("Sorted list according to price and color is red......");
		ArrayList<Fruit> a2 = Assignment5Q1.filterRedSortPrice(a);
		for (int i = 0; i < a2.size(); i++) {
			System.out.println(a2.get(i));
		}
	}

}
