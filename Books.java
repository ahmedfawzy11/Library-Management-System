
public class Books {
	
private String Name_of_books;
private int ISBN;
private Category[] category;
private String Editions;
private String Language;

private ArrayList <String> Name_of_books= new ArrayList <String> () ;
private ArrayList <int> ISBN= new ArrayList <int> () ;
private ArrayList <String> Editions= new ArrayList <String> () ;
private ArrayList <String> Langugage= new ArrayList <String> () ;

public Books(String name_of_books, int iSBN, Category[] category, String editions, String language) {
super();

Name_of_books = name_of_books;
ISBN = iSBN;
this.category = category;
Editions = editions;
Language = language;

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

}