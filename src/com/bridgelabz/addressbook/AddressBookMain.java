package com.bridgelabz.addressbook;


public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcme to the Address Book System");
		//Address Class Object for Contact Management

		Address address=new Address();
		//Variable for user Choice
		int choice;


		//Show Menu for user to Select Operation on AddressBook
		do {
			System.out.println("1. Add New Contact\n2. Edit Contact\n3. Delete Contact" + "\n4. Display Contact\n5. Exit");
			System.out.println("Enter Choise: ");
			choice = address.sc.nextInt();

			switch (choice) {
			case 1:
				address.addContact();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				address.show();
				break;
			case 5:
				System.out.println("Thank You for Using Address Book.");
				break;
			default:
				System.out.println("Please Select between 1 to 5 only.");
				break;
			}
		}while( choice != 5 );

	}
}

