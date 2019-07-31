package PhoneBookProject;


public class Person {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	Person next;
	public int length;
	
	public void contact() {
		
	}
	
	public Person(String firstName, String lastName, String phoneNumber, Address address) {
		this.firstName = firstName;
		this.lastName=lastName;
		this.phoneNumber=phoneNumber;
		this.address=address;
		next = null;
		
	}
	Person(){
        firstName = "";
        lastName = "";
        phoneNumber = "";
        Address address;
        
	}

	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address=address;
	}
	public String toString() {
		return "First name: " + this.firstName + "\nLast name: " + this.lastName + "\nPhone Number:" + this.phoneNumber + "\nStreet Address: " + this.address.getStreet() 
		+ "\nCity: " + this.address.getCity() + "\nState: " + this.address.getState()+ "\nZipcode: " + this.address.getZip();
	}
	private int entries = 0;
    Person[] contents;
    public void initEntries (int e) {
    	contents = new Person[e];
    	for (int i = 0;i<contents.length;i++) {
    		contents[i] = new Person();
    	}
    }
    public int getEntries(){
        return contents.length;
    }
    
    public void add(String firstName, String lastName, String phoneNumber, Address address){
        if (entries<contents.length){
        contents[entries] = new Person(firstName, lastName, phoneNumber, address);
        entries++;
        }
        else System.out.println("Error: book is full");
    }
	
	
	
	
	

}
