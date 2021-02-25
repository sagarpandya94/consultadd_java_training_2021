package task6;

public class exe5SavingBox {
	public static void main(String[] args) {
		SavingBox s = new SavingBox();
		SavingBox s1 = new SavingBox(5);
		SavingBox s2 = new SavingBox(2);
		SavingBox s3 = new SavingBox(10);
	}
}

class SavingBox{
	static int count=0;
	int amt = 50;
	SavingBox(){
		System.out.println("Saving box object without parameter created");
	}
	
	SavingBox(int a){
		this.amt+=a;
		System.out.println("New amount:"+this.amt);
		System.out.println("Transaction number:"+count);
		count++;
	}
}