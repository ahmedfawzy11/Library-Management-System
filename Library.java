import java.util.ArrayList;
public class Library {
    private Address[] address;
    private int  Number_of_books;
    private double Price;
    private Books[] books;
	public Library(Address[] address, int number_of_books, double price, Books[] books) {
		super();
		this.address = address;
		Number_of_books = number_of_books;
		Price = price;
		this.books = books;
	}
	public Address[] getAddress() {
		return address;
	}
	public void setAddress(Address[] address) {
		this.address = address;
	}
	public int getNumber_of_books() {
		return Number_of_books;
	}
	public void setNumber_of_books(int number_of_books) {
		Number_of_books = number_of_books;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public Books[] getBooks() {
		return books;
	}
	public void setBooks(Books[] books) {
		this.books = books;
	}
    
}