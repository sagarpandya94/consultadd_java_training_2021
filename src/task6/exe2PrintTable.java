package task6;

public class exe2PrintTable {
	public static void main(String[] args) {
		System.out.println("Name"+ " " + "Year" + " " + "Address");
		
		Employee e=new Employee("Sagar",1994,"San Francisco");
		Employee e1=new Employee("Sachin",1987,"Mumbai");
		Employee e2=new Employee("Ronaldo",1998,"Madrid");
	}

}

class Employee{
	String name, address;
	int year;
	
	Employee(String a, int b, String c){
		this.name=a;
		this.address=c;
		this.year=b;
		
		System.out.println(this.name + " " + this.year + " " + this.address);
	}
}

