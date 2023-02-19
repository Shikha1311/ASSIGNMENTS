import java.util.Scanner;

class SiCi {
	public double simpleInterest(double principalAmount, int time, double interestRate) {
		double d = (principalAmount * time * interestRate) / 100;
		return d;
	}

	public double compoundInterest(double principalAmount, int time, double interestRate) {
		double d = principalAmount * (Math.pow((1 + interestRate / 100), time)) - principalAmount;
		return d;
	}
}

public class Assignment1Q3 {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter principle amount: ");
		double principalAmount = kb.nextDouble();
		System.out.println("Enter time in years: ");
		int time = kb.nextInt();
		System.out.println("Enter rate of interest: ");
		double interestRate = kb.nextDouble();
		SiCi obj = new SiCi();
		System.out.println("simple interest is: " + obj.simpleInterest(principalAmount, time, interestRate));
		System.out.println("compound interest is: " + obj.compoundInterest(principalAmount, time, interestRate));
		kb.close();
	}
}
