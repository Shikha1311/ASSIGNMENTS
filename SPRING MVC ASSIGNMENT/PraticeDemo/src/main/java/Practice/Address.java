package Practice;

public class Address {
   private String state;
   private int pin;
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
@Override
public String toString() {
	return "Address [state=" + state + ", pin=" + pin + "]";
}
   
}
