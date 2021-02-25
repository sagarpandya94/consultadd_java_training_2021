package task6;

public class exe4Rectangle {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(5);
		Rectangle r2 = new Rectangle(5,4);
		
		System.out.println("No para:" + r.calculateArea());
		System.out.println("1 para:" + r1.calculateArea());
		System.out.println("2 para:" + r2.calculateArea());
	}
}

class Rectangle{
	int length,breath,area;
	
	Rectangle(){
		this.length=0;
		this.breath=0;
	}
	
	Rectangle(int a){
		this.length=this.breath=a;
	}
	
	Rectangle(int a, int b){
		this.length=a;
		this.breath=b;
	}
	
	int calculateArea() {
		area = length*breath;
		return area;
	}
}
