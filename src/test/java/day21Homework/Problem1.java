package day21Homework;


public class Problem1 {

	public static void main(String[] args) {

		Problem1 obj = new Problem1();

		String myString1 = obj.toUpper("Pro");
		System.out.println(myString1);

		String myString2 = obj.toUpper("java");
		System.out.println(myString2);

		String myString3 = obj.toUpper(null);
		System.out.println(myString3);
		/*
		 * if (myString3 != null) { System.out.println("The String value is null");
		 * 
		 * } else { System.out.println(myString3); }
		 */

	}

	String toUpper(String strOne) {
		String result = null;
		
		if (strOne != null) {
			result = strOne.toUpperCase();
		}
		
		return result;
	}
}
