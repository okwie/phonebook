package PhoneBookProject;

import java.util.Arrays;
import java.util.Scanner;

public class DummyApp {
	
	Person headP;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		String option = in.nextLine();
		System.out.println("1. Add Contact" + "\n2. Delete Contact" + "\n3. Search");
		
		switch (option) {
		
		case "1":
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
			
			
		
		}
			
		
		
		
		
	}
	
	public void addContact(String firstName, String lastName, String phoneNumber, Address address) {
		Person p = new Person(firstName, lastName, phoneNumber, address);
		if (headP == null) {
			headP = p;
			return;
		}
		Person temp = headP;
		for(;temp.next != null;temp=temp.next) {	
		}
		temp.next=p;
	}
	
	
	
	

}
