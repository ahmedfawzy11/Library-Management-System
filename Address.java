import java.util.Arrays;
public class Address {
private String Country;
private String City;
private String Street;
private int Bulding;
private int Apartment;
public Address(String country, String city, String street, int bulding, int apartment) {
	super();
	Country = country;
	City = city;
	Street = street;
	Bulding = bulding;
	Apartment = apartment;
}	
public String getCountry() {
	
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public int getBulding() {
	return Bulding;
}
public void setBulding(int bulding) {
	Bulding = bulding;
}
public int getApartment() {
	return Apartment;
}
public void setApartment(int apartment) {
	Apartment = apartment;
}


}