import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;


public class Library_Management_System {
	private static Scanner in;

	public static void main(String[] args) throws IOException {
                String name;
		String Email;
		int Phone;
		int Birthdate ;
		String Gender;
		String Jobtitle ;
		int iD;
                String Country;
		String City;
		String Street;
		int Bulding;
		int Apartment;
		Scanner  in = new Scanner(System.in);
		Members member = new Members("male", "job", 555, 1990, "wdkwkj", 5645, "wkdjwk", null);
		Person  p=new Person(); 
		System.out.println("please enter your id");
		iD = in.nextInt();
		member.setID(iD);

		System.out.println("Please Enter Your Name");
		name = in.next();
		member.setName(name);

		System.out.println("Please Enter Your Email");
		Email = in.next();
		member.setEmail(Email);

		System.out.println("Please Enter Your Phone Number");
		Phone = in.nextInt();
		member.setPhone(Phone);

		System.out.println("Please Enter Your Birthdate");
		Birthdate = in.nextInt();
		member.setBirthdate(Birthdate);

		System.out.println("Please Enter Your Gender");
		Gender = in.next();
		member.setGender(Gender);

		System.out.println("please enter your address");
		System.out.println("please enter");
		System.out.println("Country");
		System.out.println("City");
		System.out.println("Street");
		System.out.println("Bulding");
		System.out.println("Apartment");
		
		Street = in.next();

		System.out.println("city");
		City = in.next();



		System.out.println("Please Enter Your Jobtitle");
		Jobtitle = in.next();
		member.setJop_title(Jobtitle);

		member.printInfo();
	
		System.out.println("Welcome To The Library");              

		FileWriter write = new FileWriter("Library Management System.text");
		try(BufferedWriter buf = new  BufferedWriter(write)) {
			buf.write("Library Management System");
		}
	        }
                }