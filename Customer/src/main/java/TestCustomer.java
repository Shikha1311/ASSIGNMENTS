import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {
public static void main(String[] args) {
	ApplicationContext Context=new ClassPathXmlApplicationContext("Customer.xml");
	Customer C=(Customer) Context.getBean("customer");
	C.details();
}
}
