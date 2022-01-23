package day20Homework;

public class Problem16 {
	public static void main(String[] args) {

		Problem16 obj = new Problem16();
		String myString1 = obj.concatString("Java", "awesome");
		System.out.println(myString1);

		String myString2 = obj.concatString("food", "door");
		System.out.println(myString2);

		String myString3 = obj.concatString("java", "training");
		System.out.println(myString3);

	}

	String concatString(String strOne, String strTwo) {

		String result = " ";

		String newString1 = strOne.concat(strTwo);
		String newString2 = strOne.substring(0, strOne.length() - 1).concat(strTwo.substring(0, strTwo.length()));

		if (strOne.charAt(strOne.length() - 1) == (strTwo.charAt(0))) {

			result = newString2;
		} else {

			result = newString1;
		}

		return result;
	}
}