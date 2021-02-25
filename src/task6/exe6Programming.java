package task6;

public class exe6Programming {
	public static void main(String[] args) {
		Programming p = new Programming();
		Programming p1 = new Programming("Java");
	}
}

class Programming{
	Programming(){
		System.out.println("I love programming languages");
	}
	
	Programming(String a){
		System.out.println("I love "+a);
	}
}
