package task4;

public class exe1ShortestWord {
	public static void main(String[] args) {
		String str = "This is the sentence";
		String strArray[] = str.split(" ");
		String shortestWord = strArray[0];
		for(String a: strArray) {
			if(a.length() < shortestWord.length())
				shortestWord = a;
		}
		System.out.println("Shortest word is:" + shortestWord);
	}
}
