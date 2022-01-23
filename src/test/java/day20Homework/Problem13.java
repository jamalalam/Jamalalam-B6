package day20Homework;

public class Problem13 {
	
	public static void main(String[] args) {
		
		Problem13 obj = new Problem13();
		
		boolean myResult1 = obj.isStartWith("java training", "ing");
		System.out.println(myResult1);
		
		boolean myResult2 = obj.isStartWith("java training", "ja");
		System.out.println(myResult2);
		
		boolean myResult3 = obj.isStartWith("java training", "java");
		System.out.println(myResult3);
		
		boolean myResult4 = obj.isStartWith("java training", "train");
		System.out.println(myResult4);
	}

	boolean isStartWith(String strOne, String strTwo){
		boolean result = false;
		
		result = strOne.startsWith(strTwo);
		
		return result;
	}
	
}
