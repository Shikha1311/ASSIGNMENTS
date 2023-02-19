abstract class Shape5 {
	abstract public String draw();
}

class Rectangle5 extends Shape5 {
	@Override
	public String draw() {
		String s = "Inside Rectangle....";
		return s;
	}
}

class Line5 extends Shape5 {
	@Override
	public String draw() {
		String s = "Inside Line....";
		return s;

	}
}

class Cube5 extends Shape5 {
	@Override
	public String draw() {
		String s = "Inside Cube....";
		return s;
	}
}

public class Assignment2Q5 {
	public static void main(String[] args) {
		Shape5 s = new Rectangle5();
		System.out.println(s.draw());
		s = new Line5();
		System.out.println(s.draw());
		s = new Cube5();
		System.out.println(s.draw());

	}

}
