import java.util.ArrayList;
import java.util.Date;

public class Members extends Person {

}
private String Gender;
private String Jop_title;
private int ID;
private int Birthdate;

public Members(String gender, String jop_title, int iD, int birthdate,String name, int phone, String email, Address[] address) {
super(name, phone, email, address);

Gender = gender;
Jop_title = jop_title;
ID = iD;
Birthdate = birthdate;
}

public String getGender() {
return Gender;
}

public void setGender(String gender) {
Gender = gender;
}

public String getJop_title() {
return Jop_title;
}

public void setJop_title(String jop_title) {
Jop_title = jop_title;
}

public int getID() {
return ID;
}

public void setID(int iD) {
ID = iD;
}

public int getBirthdate() {
return Birthdate;
}

public void setBirthdate(int birthdate) {
Birthdate = birthdate;
}

public void Buy_Book (Book Buy_book){ book.buy(book); 
}

public void Borrow_Book(Book borrow_book){ book.borrow(book); 
}

public void Search_Book(Book search_book){ book.search(book); 
}

public boolean Available_Book(Book available_book){
if(book.contains(book))
return true;
else 
return false;
}
