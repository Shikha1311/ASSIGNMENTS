package Practice;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;
public class Student {

  private String fname;
  private String lname;
  private int age;
  @NotEmpty(message="not null")
  private List<String> lang;
  private Address A;
  
  
public Address getA() {
	return A;
}
public void setA(Address a) {
	A = a;
}
public List<String> getLang() {
	return lang;
}
public void setLang(List<String> lang) {
	this.lang = lang;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [fname=" + fname + ", lname=" + lname + ", age=" + age + ", lang=" + lang + ", A=" + A.toString() + "]";
}
 
}
