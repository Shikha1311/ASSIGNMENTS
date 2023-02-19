package LambdaAssignment;

import java.util.HashMap;

@FunctionalInterface
interface MyLambda4 {
	StringBuilder convertKeyValueToString(HashMap<String, Integer> map);
}

public class Assignment4Q7 {
	public static void main(String[] args) {
		Assignment4Q7 obj = new Assignment4Q7();
		HashMap<String, Integer> fullName = new HashMap<String, Integer>();
		fullName.put("Shikha", 20);
		fullName.put("Shivani", 21);
		fullName.put("Shreya", 22);
		MyLambda4 l = (V) -> {
			StringBuilder s = new StringBuilder();
			s.append(V.entrySet());
			return s;
		};
		System.out.println(obj.convertKeyValueToString(fullName, l));
	}

	public StringBuilder convertKeyValueToString(HashMap<String, Integer> map, MyLambda4 l) {
		return l.convertKeyValueToString(map);
	}
}
