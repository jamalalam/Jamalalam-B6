package day20Homework;

public class Problem12 {
	
	public static void main(String[] args) {
		
		replaceStr("I cannot do it", "cannot", "can");
		replaceStr("Tomorrow", "Tomorrow", "Today");
		
	}

	public static void replaceStr(String strOne, String oldStr, String newStr) {
		
		String newString = strOne.replaceAll(oldStr, newStr);
		System.out.println(newString);
		
	}
}
