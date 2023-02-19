package Stream_Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Trader implements Comparable<Trader> {
	private String name;
	private String city;

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public int compareTo(Trader o) {
		if (this.name.equalsIgnoreCase(o.name))
			return -1;
		else
			return 1;
	}

}

public class Assignment5Q9 {
	public static List<String> printUniqueCities(List<Trader> traders) {
		return (List<String>) traders.stream().map(V -> V.getCity()).distinct().collect(Collectors.toList());
	}

	public static List<Trader> tradersFromPuneSortByName(List<Trader> traders) {
		return traders.stream().filter(V -> V.getCity().equals("Pune")).sorted().collect(Collectors.toList());

	}

	public static List<String> allTrader3Names(List<Trader> traders) {
		return (List<String>) traders.stream().map(V -> V.getName()).sorted().collect(Collectors.toList());

	}

	public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) {
		return (ArrayList<Trader>) traders.stream().filter(V -> V.getCity().equals("Indore"))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		ArrayList<Trader> a = new ArrayList<Trader>();
		a.add(new Trader("Ram", "Pune"));
		a.add(new Trader("Sam", "Indore"));
		a.add(new Trader("Tom", "Indore"));
		a.add(new Trader("Mom", "Pune"));
		a.add(new Trader("Tam", "Pune"));
		System.out.println("All unique city names......");
		List<String> s4 = Assignment5Q9.printUniqueCities(a);
		for (String x : s4)
			System.out.println(x);
		System.out.println("Traders based on pune in sorted order by name.....");
		List<Trader> s3 = Assignment5Q9.tradersFromPuneSortByName(a);
		for (int i = 0; i < s3.size(); i++)
			System.out.println(s3.get(i).getName());
		System.out.println("All traders’ names sorted alphabetically......");
		List<String> s1 = Assignment5Q9.allTrader3Names(a);
		for (String x : s1)
			System.out.println(x);
		System.out.println("Traders based on indore.....");
		ArrayList<Trader> s = Assignment5Q9.areAnyTradersFromIndore(a);
		for (int i = 0; i < s.size(); i++)
			System.out.println(s.get(i).getName());
	}
}
