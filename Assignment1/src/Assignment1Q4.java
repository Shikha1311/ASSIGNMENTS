import java.util.Scanner;

class ResultDeclaration {
	public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
		double ans = subject1Marks + subject2Marks + subject3Marks;
		if (ans > 60) {
			String S = "Passed";
			return S;
		} else if ((subject1Marks + subject2Marks) > 60 || (subject2Marks + subject3Marks) > 60
				|| (subject3Marks + subject1Marks) > 60) {
			String S = "Promoted";
			return S;
		} else if (subject1Marks > 60 || subject2Marks > 60 || subject3Marks > 60 || ans < 60) {
			String S = "Failed";
			return S;
		} else {
			String S = "";
			return S;
		}
	}
}

public class Assignment1Q4 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter subject 1 Marks :");
		double subject1Marks = kb.nextDouble();
		System.out.println("Enter subject 2 Marks :");
		double subject2Marks = kb.nextDouble();
		System.out.println("Enter subject 3 Marks :");
		double subject3Marks = kb.nextDouble();
		ResultDeclaration obj = new ResultDeclaration();
		System.out.println("Result is: " + obj.declareResults(subject1Marks, subject2Marks, subject3Marks));
		kb.close();
	}
}
