package PhoneBookProject;

public class ExpandArray {
	private Person person;

	public static Person[] expandArray(Person [] person) {
		
		Person[] targetArray = new Person[person.length + 1];
		
		for (int i =0; i < person.length; i++) {
			targetArray[i]=person[i];
		}
		
		
		
		return targetArray;
		
	}
	
	
}
