package LambdaAssignment;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyLambda5 {
	public StringBuilder processWords(List<String> list);
}

public class Assignment4Q5 {
	List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

	public static void main(String[] args) {
		Assignment4Q5 obj = new Assignment4Q5();
		StringBuilder s = new StringBuilder();
		MyLambda5 L = (V) -> {
			for (int i = 0; i < V.size(); i++) {
				s.append(V.get(i).substring(0, 1).toUpperCase());
			}
			return s;
		};
		System.out.println(processWords(obj.list, L));
	}

	public static StringBuilder processWords(List<String> list, MyLambda5 l) {
		return l.processWords(list);
	}
}