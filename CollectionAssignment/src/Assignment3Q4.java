import java.util.ArrayList;
import java.util.HashMap;

class DateClass implements Comparable<DateClass> {
	private int date;
	private int month;
	private int year;

	public DateClass(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public int getDate() {
		return date;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	@Override
	public int compareTo(DateClass o) {
		if (this.year != o.getYear() && this.date == o.date && this.month == o.month)
			return 0;
		else
			return -1;
	}

}

public class Assignment3Q4 {

	public String getEmployee(HashMap<DateClass, String> dob, String employeeName) {
		ArrayList<DateClass> l = new ArrayList<DateClass>(dob.keySet());
		for (int i = 0; i < l.size(); i++) {
			for (int j = 0; j < l.size(); j++) {
				if (l.get(i).getDate() == l.get(j).getDate() && l.get(i).getMonth() == l.get(j).getMonth()
						&& l.get(i).getYear() != l.get(j).getYear()) {
					return dob.get(i);
				}
			}

		}
		String S = "Invalid";
		return S;
	}

	public static void main(String[] args) {
		HashMap<DateClass, String> h = new HashMap<DateClass, String>();
		h.put(new DateClass(13, 11, 2000), "Shikha");
		h.put(new DateClass(13, 11, 2000), "Shikha");
		h.put(new DateClass(13, 11, 2000), "Shikha");
		h.put(new DateClass(13, 11, 2000), "Shikha");
		Assignment3Q4 obj = new Assignment3Q4();
	}
}
