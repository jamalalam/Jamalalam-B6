package day19Homework;

public class Problem1 {

	public static void main(String[] args) {
		
		boolean myResult1 = isEqual("sdet", "SDET");
		System.out.println(myResult1);
		
		boolean myResult2 = isEqual("testing", "testing");
		System.out.println(myResult2);
		
		boolean myResult3 = isEqual("java", "java");
		System.out.println(myResult3);
		
		boolean myResult4 = isEqual("java", "java Programming");
		System.out.println(myResult4);

	}

	 static boolean isEqual(String strOne, String strTwo) {
		boolean result = false;

		if ( strOne.equals(strTwo)) {
			
			result = true;
		}
		
		return result;

	}
}
