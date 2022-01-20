package day19Homework;

public class Problem5 {

	public static void main(String[] args) {
		
		//we have to create an object first before calling the method.
		//the reason is that we are calling a non-static method into a static
		Problem5 obj = new Problem5();
		
		String myString1 = obj.toLower("espn");
		System.out.println(myString1);
		
		String myString2 = obj.toLower("SOCCER");
		System.out.println(myString2);
		
		String myString3 = obj.toLower("STRING CLASS");
		System.out.println(myString3);
		

	}

	String toLower(String strOne) {
		String result = strOne.toLowerCase();

		return result;
	}
}
