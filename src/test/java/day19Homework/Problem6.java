package day19Homework;

public class Problem6 {

	public static void main(String[] args) {
		
		//calling static into static in same class - call the method directly by name
		
		String myString1 = combineStr("day", "ONE", "work", "HOURS");
		System.out.println(myString1);
		
		String myString2 = combineStr("week", "weekend", "monday", "Tuesday");
		System.out.println(myString2);
	
		String myString3 = combineStr("restoN", "vA", "baltiMORE", "MD");
		System.out.println(myString3);

		String myString4 = combineStr("java", "is", "fun", "LEARNING");
		System.out.println(myString4);
	}
	
	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		
		//to break it down, creating two new Strings and then concatenating them together for result
		String newString1 = ((strOne).toUpperCase()).concat((strTwo).toLowerCase());
		String newString2 = ((strThree).toUpperCase()).concat((strFour).toLowerCase());

		String result = newString1.concat(newString2);
		return result;
	}
}
