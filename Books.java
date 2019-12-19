import java.awt.print.Book;
import java.util.ArrayList;
public class Books {
	private String Name_of_books;
	private int ISBN;
	private Category[] category;
	private String Editions;
	private String Language;
	private ArrayList <String> name_of_books= new ArrayList <String> () ;
	private ArrayList <String> editions= new ArrayList <String> () ;
	private ArrayList <String> language= new ArrayList <String> () ;

	public Books(String name_of_books, int iSBN, Category[] category, String editions, String language) {
		super();
		Name_of_books = name_of_books;
		ISBN = iSBN;
		this.category = category;
		Editions = editions;
		Language = language;
	}

    Books() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	public String getName_of_books() {
		return Name_of_books;
	}
	public void setName_of_books(String name_of_books) {
		Name_of_books = name_of_books;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
        public Category[] getCategory() {
		return category;
	}
	public void setCategory(Category[] category) {
		this.category = category;
	}
	public String getEditions() {
		return Editions;
	}
	public void setEditions(String editions) {
		Editions = editions;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
        public void printInfo(){
        System.out.println("-----------------------------------------");
        System.out.println("\n The Details Are: \n");
        System.out.println("Name_Of_Books : " + name_of_books + "\n");
        System.out.println("ISBN : " + ISBN + "\n");
        System.out.println("Editions : " + Editions + "\n");
        System.out.println("Language : " + Language + "\n");
        System.out.println("Category : " + category + "\n");
    }

    void setISBN(String ISBN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
}