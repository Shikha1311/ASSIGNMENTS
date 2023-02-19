import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment3Q3 {
	public static void traverseReverse(ArrayList aList) {
		ListIterator<Integer> literator = aList.listIterator(aList.size());
		while (literator.hasPrevious())
			System.out.println(literator.previous());
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		Assignment3Q3.traverseReverse(list);
	}
}