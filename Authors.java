import java.util.Date;

public class Authors extends Person {
	
private Publisher[] publisher;
private Category[] category;
private int Birthdate;

public Authors(Publisher[] publisher,Category[] category, int birthdate) {
	
super(name, phone, email, address);
this.publisher = publisher;
this,category =  category;
Birthdate = birthdate;
}

public Publisher[] getPublisher() {
	return publisher;
}

public void setPublisher(Publisher[] publisher) {
	this.publisher = publisher;
}

public Category[] getCategory() {
	return category;
}

public void setCategory(Category[] category) {
	this.category = category;
}

public int getBirthdate() {
	return Birthdate;
}

public void setBirthdate(int birthdate) {
	Birthdate = birthdate;
}

}