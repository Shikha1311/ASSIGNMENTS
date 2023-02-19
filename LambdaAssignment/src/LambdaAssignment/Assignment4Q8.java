package LambdaAssignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment4Q8 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		});
		thread.run();
	}
}
