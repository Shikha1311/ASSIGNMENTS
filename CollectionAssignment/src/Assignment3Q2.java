import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment3Q2 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> linkedHashSet1 = Assignment3Q2.ordered(linkedHashSet);
		System.out.println("Ordered set ..............");
		linkedHashSet1.forEach(i -> System.out.println(i));
		HashSet<Integer> hashSet = new HashSet<Integer>();
		HashSet<Integer> hashSet1 = Assignment3Q2.unordered(hashSet);
		System.out.println("Unordered set ..............");
		hashSet1.forEach(i -> System.out.println(i));

	}

	public static LinkedHashSet<Integer> ordered(LinkedHashSet<Integer> linkedHashSet) {
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(40);
		linkedHashSet.add(50);
		return linkedHashSet;
	}

	public static HashSet<Integer> unordered(HashSet<Integer> hashSet) {
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		hashSet.add(50);
		return hashSet;
	}

}
