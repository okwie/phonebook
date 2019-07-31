package PhoneBookProject;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class CallObjects {

	
	static Person headP;
	private static Person[] arr;
	private static int arraySize;
	
	public void Call(int maxArraySize)
	{
	arr = new Person[maxArraySize];
	arraySize =0;
	}

	public static void main(String[] args) throws IOException {
		//Person [] arr= new Person[] {};
		
		
		main();

	}
	
	public static void main() throws IOException{
		System.out.println("Enter a number:" + "\n1. Add Contact: " + "\n2. Delete Contact: " + "\n3. Update Contact: " + "\n4. Search by First Name: ");
		Scanner in = new Scanner(System.in);
		String options = in.nextLine();
		
		//add do while
		switch (options) {
		case "1":
		//System.out.println("Enter Contact Information: ");
		//String input = in.nextLine();
		
		
			addContact();
			
			break;	
		case "4":
			System.out.println("Search by name: ");	
			findBy();
			break;
		}
		
			
		
		
	}
		/*public static Person[] expandArray(Person [] person) {
		
		Person[] targetArray = new Person[person.length + 1];
		
		for (int i =0; i < person.length; i++) {
			if (person[i] == null) {
				targetArray[i]=person[i];
			}
			else if (person[i] != null) {
				targetArray[i]=person[i];
			}
		}
		
		
		
		return targetArray;
		
	}*/
	public static void addContact()throws IOException {
		System.out.println("Enter Contact Information: ");
		Scanner in = new Scanner(System.in);
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
		Person p1= new Person(firstName, lastName, phoneNumber, address);
		
		
		//arr[0].add(firstName, lastName, phoneNumber, address);
		int length = 5;
		Person[] personArray =new Person[] {};
		Person [] newArray = new Person[] {};
//		//newArray = Arrays.copyOf(personArray, personArray.length +1);
		for (int i = 0; i < length; i++) {
		if (personArray[i] == null) {
//				//expandArray(personArray);
				personArray[i]=p1;
			}
//			else if (personArray[i]!=p1) {
//				newArray = Arrays.copyOf(personArray, personArray.length +1);
//				newArray[i + 1] = p1;
//			}
		}
		System.out.println(Arrays.toString(personArray));
		//System.out.println(Arrays.toString(personArray));
		main();
		
			
	} 
		
	
		
	
	public static void findBy() throws IOException {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		for(Person person : arr) {
			if(person.getFirstName().equals(input)) {
				System.out.println(person);
			}
			main();
		}
		/*for (int i = 0; i < input.indexOf(1); i++) {
			if (input.equals(person))) {
				System.out.print(arr[i]);
				
			}
		}*/
		
	}

}


