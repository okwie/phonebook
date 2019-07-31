package PhoneBookProject;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
public class PhoneBookApp {

	
	private static int entries=0;
	private static Person[] contents;
	
	
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);		
		int option = in.nextInt();
		switch (option) {
		case 1: System.out.println("Add entry");
		String input = in.nextLine();
		
		String[] splitted = input.split(",");
		String street = splitted[1];
		String city = splitted[2];
		String state = splitted[3];
		String zip = splitted[4];
		String phoneNumber = splitted[5];
		String name = splitted[0];
		String[] fullName= name.split(" ");
		String firstName= fullName[0];
		String lastName= fullName[1];
		
		Address address = new Address(street, city, state, zip);
		contents[entries].add(firstName, lastName, phoneNumber, address);
		}
		
	}

}
