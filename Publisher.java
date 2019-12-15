import java.util.ArrayList;

public class Publisher extends Person{
	
private String Name_of_book;
private int Number_of_books;
private String Language;
private String Place;
private Authors[] authors;
private int ISBN;
private double Price;
private String Editions;

private ArrayList <String> Name_of_books= new ArrayList <String> () ;
private ArrayList <String> Number_of_books= new ArrayList <String> () ;
private ArrayList <String> Langugage= new ArrayList <String> () ;
private ArrayList <int> ISBN= new ArrayList <int> () ;
private ArrayList <String> Price= new ArrayList <String> () ;
private ArrayList <String> Editions= new ArrayList <String> () ;

public Publisher(String name_of_book, int number_of_books, String language, String place, Authors[] authors, int iSBN,
double price, String editions,String name, int phone, String email, Address[] address) {
	super(name, phone, email, address);
	Name_of_book = name_of_book;
	Number_of_books = number_of_books;
	Language = language;
	Place = place;
	this.authors = authors;
	ISBN = iSBN;
	Price = price;
	Editions = editions;
}

public String getName_of_book() {
	return Name_of_book;
}

public void setName_of_book(String name_of_book) {
	Name_of_book = name_of_book;
}

public int getNumber_of_books() {
	return Number_of_books;
}

public void setNumber_of_books(int number_of_books) {
	Number_of_books = number_of_books;
}

public String getLanguage() {
	return Language;
}

public void setLanguage(String language) {
	Language = language;
}

public String getPlace() {
	return Place;
}

public void setPlace(String place) {
	Place = place;
}

public Authors[] getAuthors() {
	return authors;
}

public void setAuthors(Authors[] authors) {
	this.authors = authors;
}

public int getISBN() {
	return ISBN;
}

public void setISBN(int iSBN) {
	ISBN = iSBN;
}

public double getPrice() {
	return Price;
}

public void setPrice(double price) {
	Price = price;
}

public String getEditions() {
	return Editions;
}

public void setEditions(String editions) {
	Editions = editions;
}

}