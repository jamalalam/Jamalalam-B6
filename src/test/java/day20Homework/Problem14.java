package day20Homework;

public class Problem14 {
	
	public static void main(String[] args) {
		
		
		String result1 = getSubStr("java training", 2, 6);
		System.out.println(result1);
		
		String result2 = getSubStr("Software Development Engineer in TEST", 11, 23);
		System.out.println(result2);

		String result3 = getSubStr("Software Development Engineer in TEST", 21, 29); 
		System.out.println(result3);
		
		
	}

	public static String getSubStr(String str, int startingindex, int endingIndex) {
		String result = "";
		
		result = str.substring(startingindex, endingIndex);
		
		return result;
	}
}
