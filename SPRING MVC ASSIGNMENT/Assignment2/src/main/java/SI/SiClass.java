package SI;

public class SiClass {
 private double principle;
 private double time;
 private double rate;
public double getPrinciple() {
	return principle;
}
public void setPrinciple(double principle) {
	this.principle = principle;
}
public double getTime() {
	return time;
}
public void setTime(double time) {
	this.time = time;
}
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
public double Interest()
{
	return (getTime()*getRate()*getPrinciple())/100;
}
@Override
public String toString() {
	return "Simple interest of Rs. " + principle + ", in  Time " + time + ",and in  Rate " + rate + " is :";
}

}
