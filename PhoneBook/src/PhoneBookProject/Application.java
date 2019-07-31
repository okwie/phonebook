package PhoneBookProject;

import java.util.Scanner;

public class Application {
	static Scanner in = new Scanner(System.in);
	static String [] arr= new String[] {};

	public static void main(String[] args) {
		main();

	}
	
	public static void main() {
		System.out.println("Enter a number:" + "\n1. Add Contact: " + "\n2. Delete Contact: " + "\n3. Update Contact: " + "\n4. Search by First Name: ");
		
		String options = in.nextLine();
		
		switch (options) {
		case "1":
			addContact();
			
			
		}
		
		
	}
	public static void addContact() {
		System.out.println("Enter Contact Information: ");
		String input = in.nextLine();
		
		String[] splited = input.split(",");
		String street = splited[1];
		String city = splited[2];
		String state = splited[3];
		String zip = splited[4];
		String phoneNumber = splited[5];
		String name = splited[0];
		String[] fullName= name.split(" ");
		String firstName= fullName[0];
		String lastName= fullName[1];
		
		Address address = new Address(street, city, state, zip);
		Person person = new Person(firstName, lastName, phoneNumber, address);
		String [] arr= new String[]{firstName, lastName, phoneNumber, address.getCity(),};
		
		
		
		System.out.println(arr[0] + " " + arr[1] + "," + arr[2] + "," + arr[3]);
		main();
	}
	public static void findBy() {
		String input = in.nextLine();
		for (int i = 0; i < arr.length; i++) {
			
		}
		
	}

}
