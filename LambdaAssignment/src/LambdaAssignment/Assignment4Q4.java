package LambdaAssignment;

import java.util.ArrayList;

@FunctionalInterface
interface MyLambda {
	public ArrayList<String> Remove(ArrayList<String> m);
}

public class Assignment4Q4 {
	public ArrayList<String> removeOddLength(ArrayList<String> employeeList, MyLambda l) {
		return l.Remove(employeeList);
	}

	public static void main(String[] args) {
		Assignment4Q4 obj = new Assignment4Q4();
		ArrayList<String> ListOFStrings = new ArrayList<String>();
		ListOFStrings.add("Shikha");
		ListOFStrings.add("Shivani");
		ListOFStrings.add("Shivani2");
		ListOFStrings.add("Ram");
		ListOFStrings.add("Rama");
		MyLambda l = (V) -> {
			for (int i = 0; i < V.size(); i++) {
				if (!((V.get(i).length()) % 2 == 0)) {
					V.remove(V.get(i));
				}
			}
			return V;
		};
		ArrayList<String> ListOFStrings2 = obj.removeOddLength(ListOFStrings, l);
		for (String s : ListOFStrings2) {
			System.out.println(s);
		}
	}
}
