package task6;

public class exe3StudentOverloading {
	public static void main(String[] args) {
		Student s = new Student("Sagar");
		Student s1 = new Student();
	}
}

class Student{
	String name;
	
	Student(String s){
		this.name = s;
		System.out.println("Name is:"+ this.name);
	}
	
	Student(){
		this.name="unknown";
		System.out.println("Name is:"+ this.name);
	}
}
