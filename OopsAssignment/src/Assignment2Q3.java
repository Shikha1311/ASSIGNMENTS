import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
	int totalDeposits = 10000;
	int creditLimit = 2000;

	@Override
	public int getCash() {
		return totalDeposits + creditLimit;
	}
}

class SavingsAccount extends Assignment2Q3 {
	int totalDeposits = 10000;
	int fixedDepositAmount = 5000;

	@Override
	public int getCash() {
		return totalDeposits + fixedDepositAmount;

	}
}

public class Assignment2Q3 {
	public int totalCashInBank(ArrayList<Integer> cash) {
		int sum = 0;
		for (int i : cash)
			sum += i;
		return sum;
	}

	public int getCash() {
		return 0;
	}

	public static void main(String[] args) {
		Assignment2Q3 a = new CurrentAccount();
		ArrayList<Integer> l = new ArrayList<Integer>();
		System.out.println(a.getCash());
		l.add(a.getCash());
		l.add(a.getCash());
		l.add(a.getCash());
		a = new SavingsAccount();
		System.out.println(a.getCash());
		l.add(a.getCash());
		l.add(a.getCash());
		l.add(a.getCash());
		System.out.println(a.totalCashInBank(l));
	}
}
