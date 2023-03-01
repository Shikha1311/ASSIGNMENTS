
public class Customer {
private int customerId;
private String customerName;
private String customerContact;
private Address address;


public Customer(int customerId, String customerName, String customerContact, Address address) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerContact = customerContact;
	this.address = address;
}

public int getCustomerId() {
	return customerId;
}

public String getCustomerName() {
	return customerName;
}

public String getCustomerContact() {
	return customerContact;
}
public Address getAddress() {
	return address;
}

public void details()
{
	System.out.println("CustomerId : "+getCustomerId());
	System.out.println("CustomerName : "+getCustomerName());
	System.out.println("CustomerContact : "+getCustomerContact());
	System.out.println("CustomerAddress : "+getAddress().getStreet()+" "+getAddress().getCity()
			+" "+getAddress().getState()+" "+getAddress().getZip()+" "+getAddress().getCountry());
}
}
