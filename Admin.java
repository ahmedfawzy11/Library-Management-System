import java.util.ArrayList;
import java.util.Date;

public class Admin extends Person {
private int ID;
private int BirthDate;
private ArrayList <Members> memberes = new ArrayList <Members> () ;

public Admin(int iD, int birthDate,String name, int phone, String email, Address[] address) {
	
super(name, phone, email, address);
ID = iD;
BirthDate = birthdate;
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

public void setBirthdate(int birthdate) {
	Birthdate = birthdate;
}

}
public void Add_Member (Member new_member){ member.add(new_member); 
}

public void Remove_Member (Member remove_member){ 	member.remove(member); 
}

public boolean Find_Member(Members find_member){
if(members.contains(member))
return true;
else 
return false;
}

public void View_Member (Member view_member){ member.view(member); 
}

public void Add_Book(Book new_book){ book.add(new_book); 
}

public void Remove_Book (Book remove_book){ book.remove(book); 
}

public boolean Find_Book(Book find_book){
if(book.contains(book))
return true;
else 
return false;
}

public void View_Book (Book view_book){ book.view(book); 
}

}