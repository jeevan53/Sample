package Jeevan;

class Employee {
	
	String firstName;
	String lastName;
	int empId;
	
	public Employee(String firstName, String lastName, int empId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId + "]";
	}
	
	
}

public class simpleHashTable {
	
	private Employee[] hashtable;
	
	public simpleHashTable() {
		hashtable = new Employee[10];
	}
	
	public int hashed(String key) {
		return key.length() % hashtable.length;
	}
	public void put(String key, Employee employee) {
		int hashedKey = hashed(key);
		if(hashtable[hashedKey]!=null) {
			System.out.println("Sorry element is already present at position "+hashedKey+" no insertion done for key : "+key);
		}
		hashtable[hashedKey] = employee;
	}
	
	public Employee get(String key) {
		int hashedKey = hashed(key);
		return hashtable[hashedKey];
	}
	
	public void printHashTable() {
		for(int i = 0;i<hashtable.length;i++) {
			System.out.println(hashtable[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee jeevan = new Employee("Jeevan", "Kumar",101);
		Employee venumadhav = new Employee("Venu","madhav", 23);
		   Employee madhavsiva = new Employee("madhav","siva", 25);
		   Employee sivakeshavn = new Employee("siva","keshavn", 27);
		   Employee keshavram = new Employee("keshav","ram", 29);
		   Employee ramvenu = new Employee("ram","venu", 31);
		   simpleHashTable ht = new simpleHashTable();
		   ht.put("jeevan", jeevan);
		   ht.put("madhav", venumadhav);
		   ht.put("siva", madhavsiva);
		   ht.put("keshavn", sivakeshavn);
		   ht.put("ram", keshavram);
		   ht.put("venu", ramvenu);
		   ht.printHashTable();
		   System.out.println();
		   System.out.println(ht.get("madhav"));
		   System.out.println(ht.get("ram"));
	}

}
