package day19Homework;

public class Problem3 {

	public static void main(String[] args) {

		isEqualLength("Pro", "Ali");
		isEqualLength("java", "LearNinG");
		isEqualLength("java training", "java");
		
	}

	public static void isEqualLength(String strOne, String strTwo) {
		
		if (strOne.length() == strTwo.length()) {
			
			String newString = strOne.concat(strTwo);
			int newStringLength = strOne.concat(strTwo).length();
			System.out.println(newString + " " + newStringLength);
			
		} else if (strOne.length()>strTwo.length()){
			
			System.out.println(strOne.toUpperCase() + " " + strOne.length());
			
		} else if (strOne.length()<strTwo.length()) {
			
			System.out.println(strTwo.toLowerCase() + " " + strTwo.length());

		}
	}
}
