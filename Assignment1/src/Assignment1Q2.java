class ArmstrongNumBetweenRange {

	public int[] armstrongNumbersInRange(int min, int max) {
		int arr1[] = new int[50];
		int j = 0;
		for (int i = min; i <= max; i++) {
			String s = String.valueOf(i);
			int len = s.length();
			int ans = 0;
			int num1 = i;
			while (num1 != 0) {
				ans += (int) Math.pow(num1 % 10, len);
				num1 /= 10;
			}
			if (ans == i) {
				arr1[j] = i;
				j++;
			}
		}
		return arr1;
	}
}

public class Assignment1Q2 {
	public static void main(String[] args) {
		int min = 100;
		int max = 999;
		ArmstrongNumBetweenRange a = new ArmstrongNumBetweenRange();
		int[] arr = a.armstrongNumbersInRange(min, max);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				break;
			System.out.println(arr[i]);
		}
	}

}
