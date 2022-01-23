package day20Homework;

public class Problem11 {
	public static void main(String[] args) {
		
		//calling non-static into static - create an object
		
		Problem11 obj = new Problem11();
		
		String testOne = obj.threeEqual("Java Pro", 'P', 'B');
		System.out.println(testOne);
		
		String testtwo = obj.threeEqual("Lazy mode", 'm', 'C');
		System.out.println(testtwo);
		
		String testThree = obj.threeEqual("Training", 'T', ' ');
		System.out.println(testThree);
		
	}

	protected String threeEqual(String str, char oldChar, char newChar) {
		String result = "";
		
		String newString = str.replace(oldChar, newChar);
		result = newString;
		
		return result;
	}
	
}
