import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
	private String name;
	private int height;
	private double weight;

	public Person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public int compareTo(Person o) {
		if (this.weight < o.weight)
			return -1;
		else if (this.weight > o.weight)
			return 1;
		else if (this.height < o.height)
			return -1;
		else if (this.height > o.height)
			return 1;
		else
			return 0;

	}

}

public class Assignment3Q1 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Shikha1", 3, 54.4));
		list.add(new Person("Shikha2", 5, 54.4));
		list.add(new Person("Shikha3", 4, 45.4));
		System.out.println("Before sorting..............");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " " + list.get(i).getHeight() + " " + list.get(i).getWeight());
		}

		Collections.sort(list);
		System.out.println("Before sorting..............");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " " + list.get(i).getHeight() + " " + list.get(i).getWeight());
		}

	}
}