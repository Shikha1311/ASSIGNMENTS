
// use for keep track of student
public class Student {
	private int id;
	private String name;
	private int grade;
	private int fees_paid;
	private int fees_total;

	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		fees_paid = 0;
		fees_total = 30000;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return fees_paid;
	}

	public void payFees(int fees) {
		this.fees_paid += fees;
		School.setTotalMoneyEarned(fees_paid);

	}

	public int getRemainingFees() {
		return fees_total - fees_paid;

	}

}
