import java.util.Scanner;

class TaxAmount {
	public double calculateTaxAmount(int ctc) {

		if (ctc >= 181001 && ctc <= 300000) {
			return (double) (ctc * 10) / 100;
		} else if (ctc >= 300001 && ctc <= 500000) {
			return (double) (ctc * 20) / 100;
		} else if (ctc >= 500001 && ctc <= 1000000) {
			return (double) (ctc * 30) / 100;
		} else {
			return 0.0;
		}
	}
}

public class Assignment1Q5 {
	public static void main(String[] args) {
		TaxAmount obj = new TaxAmount();
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your ctc in Rs: ");
		int ctc = kb.nextInt();
		System.out.println("Tax to be paid: " + obj.calculateTaxAmount(ctc));
		kb.close();
	}
}
