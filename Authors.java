import java.util.Date;
public class Authors extends Person {
private Publisher[] publisher;
private Category[] category;
private int Birth_of_Date;
public Authors(Publisher[] publisher, int birth_of_Date,String name, int phone, String email, Address[] address,Category[] category) {
	super(name, phone, email, address);
	this.publisher = publisher;
	Birth_of_Date = birth_of_Date;
}
public Publisher[] getPublisher() {
	return publisher;
}
public void setPublisher(Publisher[] publisher) {
	this.publisher = publisher;
}
public int getBirth_of_Date() {
	return Birth_of_Date;
}
public void setBirth_of_Date(int birth_of_Date) {
	Birth_of_Date = birth_of_Date;
}
public Category[] getCategory() {
	return category;
}

public void setCategory(Category[] category) {
	this.category = category;
}


}