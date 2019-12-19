
import java.util.Date;
public class Admin extends Person {
private int ID;
private int BirthDate;
public Admin(int iD, int birthDate,String name, int phone, String email, Address[] address) {
	super(name, phone, email, address);
	ID = iD;
	BirthDate = birthDate;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public int getBirthDate() {
	return BirthDate;
}
public void setBirthDate(int birthDate) {
	BirthDate = birthDate;
}
public void Add_Member(){ 
}
public void remove_Member(){ 
}
}