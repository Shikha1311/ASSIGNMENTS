import java.util.Scanner;

class ArmstrongOrNot {
	public boolean armstrongCheck(int num) {
		String s = String.valueOf(num);
		int len = s.length();
		int ans = 0;
		int num1 = num;
		while (num1 != 0) {
			ans += (int) Math.pow(num1 % 10, len);
			num1 /= 10;
		}
		if (ans == num)
			return true;
		else
			return false;
	}
}

public class Assignment1Q1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArmstrongOrNot s = new ArmstrongOrNot();
		if (s.armstrongCheck(n))
			System.out.println("ArmStrong No.");
		else
			System.out.println("Not Armstrong No");
		int n2 = kb.nextInt();
		if (s.armstrongCheck(n2))
			System.out.println("ArmStrong No.");
		else
			System.out.println("Not Armstrong No");
		kb.close();
	}
}