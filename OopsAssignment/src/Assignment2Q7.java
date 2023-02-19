import java.util.Scanner;

abstract class DesertItem {
	static int TotalCandies = 0;
	static int TotalCookies = 0;
	static int TotalIceCreams = 0;

	abstract public int getCost();
}

class Candy extends DesertItem {
	public int addCandies(int candies) {
		DesertItem.TotalCandies += candies;
		System.out.println(candies + " candies has been  added.");
		return DesertItem.TotalCandies;
	}

	@Override
	public int getCost() {
		return 10;
	}
}

class Cookie extends DesertItem {
	public int addCookies(int cookies) {
		DesertItem.TotalCookies += cookies;
		System.out.println(cookies + " cookies has been  added.");
		return DesertItem.TotalCookies;
	}

	public int getCost() {
		return 5;
	}

}

class IceCream extends DesertItem {
	public int addIceCreams(int IceCreams) {
		DesertItem.TotalIceCreams += IceCreams;
		System.out.println(IceCreams + " IceCream has been  added.");
		return DesertItem.TotalIceCreams;
	}

	@Override
	public int getCost() {
		return 100;
	}
}

public class Assignment2Q7 {
	public static void main(String[] args) {
		Assignment2Q7 obj = new Assignment2Q7();
		Scanner kb = new Scanner(System.in);
		obj.selectRoles();
		String s = kb.next();
		obj.roles(s);
		if (s.equalsIgnoreCase("owner")) {
			obj.addItems();
			int n = kb.nextInt();
			obj.addItemsOperation(n);
		} else {
			obj.placeOrder();
			int n = kb.nextInt();
			obj.placeOrderOperation(n);
		}
		kb.close();
	}

	private void selectRoles() {
		System.out.println("Select your role by selecting 1 or 2:\n 1. Owner.\n 2.Customer.");

	}

	private void roles(String role) {
		if (role.equalsIgnoreCase("Owner"))
			System.out.println("You can add items.");
		else
			System.out.println("You can buy items.");
	}

	private void addItems() {
		System.out.println(
				"You can add following items:\n1. Candies\n2. Cookies\n3. IceCreams\n Enter your choice 1 or 2 or 3-");
	}

	private void addItemsOperation(int choice) {
		if (choice == 1) {
			System.out.println("Enter no. of candies to be added:");
			Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			Candy c = new Candy();
			c.addCandies(n);
			kb.close();

		} else if (choice == 2) {
			System.out.println("Enter no. of candies to be added:");
			Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			Cookie c = new Cookie();
			c.addCookies(n);
			kb.close();

		}
		if (choice == 3) {
			System.out.println("Enter no. of candies to be added:");
			Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			IceCream c = new IceCream();
			c.addIceCreams(n);
			kb.close();

		}
	}

	private void placeOrder() {
		System.out.println(
				"You can place order of following items:\n1. Candies\n2. Cookies\n3. IceCreams\n Enter your choice 1 or 2 or 3");

	}

	private void placeOrderOperation(int choice) {
		if (choice == 1) {
			DesertItem D = new Candy();
			System.out.println("1 candy will cost " + D.getCost() + " dollars In Rs. " + 70 * D.getCost());

		} else if (choice == 2) {
			DesertItem D = new Cookie();
			System.out.println("1 candy will cost " + D.getCost() + " euro In Rs. " + 70 * D.getCost());

		}
		if (choice == 3) {
			DesertItem D = new IceCream();
			System.out.println("1 icecream will cost Rs. " + D.getCost());

		}
	}
}