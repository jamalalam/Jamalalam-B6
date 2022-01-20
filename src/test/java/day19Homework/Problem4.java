package day19Homework;

public class Problem4 {

	public static void main(String[] args) {

		Problem4 obj = new Problem4();

		String myString1 = obj.toUpper("Pro");
		System.out.println(myString1);

		// HW has an error here. This will return JAVA not LEARNING as shown on HW
		String myString2 = obj.toUpper("java");
		System.out.println(myString2);

		String myString3 = obj.toUpper("java training");
		System.out.println(myString3);

	}

	String toUpper(String strOne) {
		String result = strOne.toUpperCase();

		return result;
	}
}
