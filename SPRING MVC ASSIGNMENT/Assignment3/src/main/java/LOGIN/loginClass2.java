package LOGIN;

public class loginClass2 {
  private String email;
  private loginClass L;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public loginClass getL() {
	return L;
}
public void setL(loginClass l) {
	L = l;
}
@Override
public String toString() {
	return L.toString();
}
  
}
