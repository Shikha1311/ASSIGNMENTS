class SingletonInheritanceCheck {
	static SingletonInheritanceCheck obj = new SingletonInheritanceCheck();

	private SingletonInheritanceCheck() {
	}

	static SingletonInheritanceCheck getInstance() {
		return obj;
	}

}

public class Assignment2Q1 {
	public static void main(String[] args) {
		SingletonInheritanceCheck obj2 = SingletonInheritanceCheck.getInstance();
		// Both the print statement will print same hash value as there are one instance
		// of the class
		System.out.println(SingletonInheritanceCheck.obj);
		System.out.println(obj2);

	}
}
