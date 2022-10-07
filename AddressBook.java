package com.addressbook;

import java.util.Scanner;
public class AddressBook {

	public static void main(String[] args) {
//		first use case
		AddressBook addressBook = new AddressBook();
		addressBook.createContact();
		
	}
	
	public void createContact() {
		Person person = new Person();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first name:");
		String Fname = scanner.next();
		person.setFname(Fname);

		System.out.println("Enter the last name:");
		String Lname = scanner.next();
		person.setLname(Lname);

		System.out.println("Enter the Phone number");
		Long phonenumber = scanner.nextLong();
		person.setPhonenumber(phonenumber);

		System.out.println("Enetr he city");
		String city = scanner.next();
		person.setCity(city);

		System.out.println("Enter the State");
		String state = scanner.next();
		person.setState(state);

		System.out.println("Enter the Zip code");
		Long Zip = scanner.nextLong();
		person.setZip(Zip);

		System.out.println("Enter the E-mail");
		String email = scanner.next();
		person.setEmail(email);

		System.out.println(person);

		scanner.close();

	}

}
