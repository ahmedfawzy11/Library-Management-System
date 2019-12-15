import java.util.ArrayList;

public class Person {
	
private String Name;
private int phone;
private String Email;
private  Address[] address;

public Person() {
}

public Person(String name, int phone, String email, Address[] address) {
	super();
	Name = name;
	this.phone = phone;
	Email = email;
	this.address = address;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getPhone() {
	return phone;
}

public void setPhone(int phone) {
	this.phone = phone;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public Address[] getAddress() {
	return address;
}

public void setAddress(Address[] address) {
	this.address = address;
}

public void Sign_Up( sign_up){ person.sign(sign_up); 
}

public void Sign_In(Book sign_in){ person.sign(sign_in); 
}

}