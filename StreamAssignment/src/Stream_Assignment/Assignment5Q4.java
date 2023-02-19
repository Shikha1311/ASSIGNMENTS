package Stream_Assignment;
class Trader {
    private String name;
    private String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
    
}

class Transaction {
    private Trader trader;
    private int year;
    private int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public int getYear() {
		return year;
	}
	public int getValue() {
		return value;
	}
    
}
public class Assignment5Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {}

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {}
    public static int highestTransaction(List<Transaction> transactions){}

    public static int smallestTransaction(List<Transaction> transactions){}

    public static void main(String[] args) 
    {
    	
    }
}
