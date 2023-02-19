import java.util.Scanner;

class Login {
	String userId = "Ajay", password = "password";
	static int count = 1;

	public String loginUser(String user, String pass) {
		if (userId.equals(user) && password.equals(pass)) {
			String S = "Welcome Ajay";
			return S;
		} else if (count == 3) {
			String S = "You have entered wrong credentials 3 times\nContact Admin";
			count = 1;
			return S;
		} else {
			String S = "You have entered wrong credentials ,please enter the right credentials.";
			count += 1;
			return S;
		}
	}

}

public class Assignment1Q6 {
	public static void main(String[] args) {
		String S1 = "Welcome Ajay";
		Scanner kb = new Scanner(System.in);
		Login obj = new Login();
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter name:");
			String Name = kb.next();
			System.out.println("Enter password:");
			String Password = kb.next();
			String s = obj.loginUser(Name, Password);
			if (s.equals(S1)) {
				System.out.println(s);
				break;
			} else
				System.out.println(s);
			kb.close();
		}
	}
}