import java.util.ArrayList;
import java.util.Date;
public class Members extends Person {
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

    Members() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
         public void printInfo()
    {
        System.out.println("-----------------------------------------");
        System.out.println("\n The Details Are: \n");
        System.out.println("Gender : " + Gender + "\n");
        System.out.println("ID : " + ID + "\n");
        System.out.println("Birthdate : " + Birthdate + "\n");
      
    }
         
	public void Buy_Book() {
        }

	public void Borrow_Book(){ 
	}
        }