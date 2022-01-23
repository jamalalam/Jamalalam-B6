package day20Homework;

public class Problem15 {

	public static void main(String[] args) {
		
		String test1 = removeSpace("  Java Training    ");
		System.out.println(test1);
		
		String test2 = removeSpace("    I like to practice    ");
		System.out.println(test2);
		
		
	}

	public static String removeSpace(String strOne) {
		String result = "";

		result = strOne.trim();
		
		return result;
	}
}
