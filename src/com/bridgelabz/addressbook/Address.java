package com.bridgelabz.addressbook;

import java.util.Scanner;


public class Address {
	Contact obj =new Contact();
	Scanner sc=new Scanner(System.in);
	void addContact() {
		System.out.println("Enter The First Name");
		obj.setFirstName(sc.next());
		System.out.println("Enter The Last Name");
		obj.setLastName(sc.next());
		System.out.println("Enter the city ");
		obj.setCity(sc.next());
		System.out.println("Enter the state ");
		obj.setState(sc.next());
		System.out.println("Enter the Zip ");
		obj.setZip(sc.next());
		System.out.println("Enter the PhoneNumber ");
		obj.setPhoneNumber(sc.next());
		System.out.println("Enter the EmailId ");
		obj.setEmailId(sc.next());

	}
	void show() {
		System.out.println("Name"+obj.getFirstName());
		System.out.println("LastName"+obj.getLastName());
		System.out.println(" City "+obj.getCity() );
		System.out.println("state "+obj.getState());
		System.out.println("Zip "+obj.getZip());
		System.out.println("PhoneNumber"+obj.getPhoneNumber());
		System.out.println("EmailID "+obj.getEmailId());

	}
}
