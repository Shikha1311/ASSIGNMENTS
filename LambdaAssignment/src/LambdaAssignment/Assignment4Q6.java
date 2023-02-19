package LambdaAssignment;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface MyLambda3 {
	public List<String> convert(List<String> list);
}

public class Assignment4Q6 {
	public static void main(String[] args) {
		List<String> L = new ArrayList<>();
		Assignment4Q6 obj = new Assignment4Q6();
		L.add("shikha");
		L.add("shivani");
		L.add("deepa");
		MyLambda3 l = (V) -> {
			for (int i = 0; i < V.size(); i++) {
				String s = V.get(i).substring(0, 1).toUpperCase() + V.get(i).substring(1);
				V.remove(i);
				V.add(i, s);
			}
			return V;
		};
		ArrayList<String> L2 = (ArrayList<String>) obj.convertToUpperCase(L, l);
		for (String s : L2) {
			System.out.println(s);
		}

	}

	public List<String> convertToUpperCase(List<String> list, MyLambda3 m) {
		return m.convert(list);
	}
}