import java.util.Scanner;

class Student {
	private int subjectA, subjectB, subjectC;

	public Student(int subjectA, int subjectB, int subjectC) {
		this.subjectA = subjectA;
		this.subjectB = subjectB;
		this.subjectC = subjectC;
	}

	public int studentsTotalMarksInAllSubjects(Student[] students) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += (students[i].subjectA + students[i].subjectB + students[i].subjectC);
		}
		return sum;
	}

	public double studentsAverageMarksInAllSubjects(Student[] students) {
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			ans += ((students[i].subjectA + students[i].subjectB + students[i].subjectC) / 3);
		}
		return ans;
	}

	public int[] subjectWiseMarks(Student[] students, String subjectName) {
		String s = "subjectA";
		String s2 = "subjectB";
		if (s.equalsIgnoreCase(subjectName)) {
			int arr[] = { students[0].subjectA, students[1].subjectA, students[2].subjectA };
			return arr;
		} else if (s2.equalsIgnoreCase(subjectName)) {
			int arr[] = { students[0].subjectB, students[1].subjectB, students[2].subjectB };
			return arr;
		} else {
			int arr[] = { students[0].subjectC, students[1].subjectC, students[2].subjectC };
			return arr;
		}
	}

	public int subjectATotalByStudents(int[] marks) {
		int sum = 0;
		for (int i = 0; i < marks.length; i++)
			sum += marks[i];
		return sum;

	}

	public int subjectBTotalByStudents(int[] marks) {
		int sum = 0;
		for (int i = 0; i < marks.length; i++)
			sum += marks[i];
		return sum;

	}

	public int subjectCTotalByStudents(int[] marks) {
		int sum = 0;
		for (int i = 0; i < marks.length; i++)
			sum += marks[i];
		return sum;

	}

	public double subjectAAverageByStudents(int[] marks) {
		int sum = 0;
		for (int i = 0; i < marks.length; i++)
			sum += marks[i];
		return sum / 3;
	}

	public double subjectBAverageByStudents(int[] marks) {
		int sum = 0;
		for (int i = 0; i < marks.length; i++)
			sum += marks[i];
		return sum / 3;
	}

	public double subjectCAverageByStudents(int[] marks) {
		int sum = 0;
		for (int i = 0; i < marks.length; i++)
			sum += marks[i];
		return sum / 3;
	}
}

public class Assignment1Q9 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter marks of Student 1:");
		Student obj1 = new Student(kb.nextInt(), kb.nextInt(), kb.nextInt());
		System.out.println("Enter marks of Student 2:");
		Student obj2 = new Student(kb.nextInt(), kb.nextInt(), kb.nextInt());
		System.out.println("Enter marks of Student 3:");
		Student obj3 = new Student(kb.nextInt(), kb.nextInt(), kb.nextInt());
		Student obj[] = { obj1, obj2, obj3 };
		System.out.println(
				"Total marks of all the students in all subjects " + obj[0].studentsTotalMarksInAllSubjects(obj));
		System.out.println(
				"Average marks of all the students in all subjects " + obj[0].studentsTotalMarksInAllSubjects(obj));
		int mark1[] = obj[0].subjectWiseMarks(obj, "subjecta");
		int mark2[] = obj[0].subjectWiseMarks(obj, "subjectb");
		int mark3[] = obj[0].subjectWiseMarks(obj, "subjectc");
		System.out.println("Total marks scored by students in subject A: " + obj[0].subjectATotalByStudents(mark1));
		System.out.println("Total marks scored by students in subject B: " + obj[0].subjectATotalByStudents(mark2));
		System.out.println("Total marks scored by students in subject C: " + obj[0].subjectATotalByStudents(mark3));
		System.out.println("Average marks scored by students in subject A: " + obj[0].subjectATotalByStudents(mark1));
		System.out.println("Average marks scored by students in subject B: " + obj[0].subjectATotalByStudents(mark2));
		System.out.println("Average marks scored by students in subject C: " + obj[0].subjectATotalByStudents(mark3));
		kb.close();
	}
}
