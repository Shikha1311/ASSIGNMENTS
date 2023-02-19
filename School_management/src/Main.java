import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Teacher marry = new Teacher(1, "marry", 5000);
		Teacher larry = new Teacher(2, "larry", 5000);
		Student Shikha = new Student(2, "shikha", 3);
		Student shivani = new Student(2, "Shivani", 4);
		List<Teacher> listt = new ArrayList();
		listt.add(larry);
		listt.add(marry);
		List<Student> lists = new ArrayList();
		lists.add(Shikha);
		lists.add(shivani);
		School abc = new School(listt, lists);
		Shikha.payFees(50000);
		shivani.payFees(100000);
		System.out.println("Total money earned by abc school is: Rs " + abc.getTotalMoneyEarned());
		marry.recievedSalary(50000);
		System.out
				.println("abc has spent moeny on salary of " + marry.getName() + " is: Rs " + abc.getTotalMoneySpent());
		larry.recievedSalary(60000);
		System.out
				.println("abc has spent moeny on salary of " + larry.getName() + " is: Rs " + abc.getTotalMoneySpent());
	}
}
