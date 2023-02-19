import java.util.List;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;

	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		this.totalMoneyEarned = 0;
		this.totalMoneySpent = 0;
	}

	public void setTeachers(Teacher teacher) {
		teachers.add(teacher);
	}

	public void setStudentss(Student student) {
		students.add(student);
	}

	public static void setTotalMoneyEarned(int totalmoneyEarned) {
		totalMoneyEarned += totalmoneyEarned;
	}

	public static void setTotalMoneySpent(int totalmoneySpent) {
		totalMoneySpent = totalmoneySpent;
	}

	public List<Teacher> getTeachers() {
		return this.teachers;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

}
