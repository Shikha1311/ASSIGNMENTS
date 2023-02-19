import java.util.Hashtable;

class Employee {
	private String name;
	private int id;

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	@Override
	public String toString() {
		return name + " " + id;
	}

}

public class Assignment3Q5 {
	public static void main(String[] args) {
		Hashtable<Employee, String> t = new Hashtable<Employee, String>();
		t.put(new Employee(), "One");
		t.put(new Employee(), "Two");
		t.put(new Employee(), "Three");
		t.put(new Employee(), "Four");
		t.put(new Employee(), "Five");
		// Here we have duplicate keys hence it is over writing the value of key with
		// the new value
		System.out.println(t.size());
		System.out.println(t.entrySet());
	}
}
