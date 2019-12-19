
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
    public void printInfo()
    {
        System.out.println("-----------------------------------------");
        System.out.println("\n The Details Are: \n");
        System.out.println("Name: " + Name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + Email);
        System.out.println("Address : " + address + "\n");
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
}public void Create_ID() {
    System.out.println(" Please Create ID ");
}
}
