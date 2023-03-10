package PraticeDemo2;

public class clg {
 private String name;
 private String state;
 private int pin;
 
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "clg name=" + name + ", state=" + state + ", pin=" + pin + " .";
}
 
 
}
