package banking;

import javax.validation.constraints.Size;

public class USER {
@Size(min=1, max=2)
private String accountno;
private String balance;
public String getAccountno() {
	return accountno;
}
public void setAccountno(String accountno) {
	this.accountno = accountno;
}
public String getBalance() {
	return balance;
}
public void setBalance(String balance) {
	this.balance = balance;
}

}
