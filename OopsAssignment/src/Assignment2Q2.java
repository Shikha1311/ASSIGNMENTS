import java.util.ArrayList;

class Manager extends Assignment2Q2 {
	@Override
	public int getSalary(int salary) {
		int incentive = 5000 + salary;
		return incentive;
	}
}

class Labour extends Assignment2Q2 {
	@Override
	public int getSalary(int salary) {
		int overtime = 500 + salary;
		return overtime;
	}
}

public class Assignment2Q2 {
	public int getSalary(int salary) {
		return salary;
	}

	public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries) {
		int sum = 0;
		for (int i : employeeSalaries)
			sum += i;
		return sum;
	}

	public static void main(String[] args) {
		int salary = 10000;
		ArrayList<Integer> l = new ArrayList<Integer>();
		Assignment2Q2 e = new Manager();
		System.out.println(e.getSalary(salary));
		l.add(e.getSalary(salary));
		l.add(e.getSalary(salary));
		l.add(e.getSalary(salary));
		e = new Labour();
		System.out.println(e.getSalary(salary));
		l.add(e.getSalary(salary));
		l.add(e.getSalary(salary));
		l.add(e.getSalary(salary));
		System.out.println(e.totalEmployeesSalary(l));
	}
}
