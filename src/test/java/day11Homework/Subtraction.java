package day11Homework;

public class Subtraction {
	
	public static void main(String[] args) {
		
		int diffTotal1 = difference21(19);
		System.out.println(diffTotal1);
		
		int diffTotal2 = difference21(10);
		System.out.println(diffTotal2);
		
		int diffTotal3 = difference21(30);
		System.out.println(diffTotal3);
		
		int diffTotal4 = difference21(21);
		System.out.println(diffTotal4);
	}

	public static int difference21(int number) {
		int result = 0;
		
		if (number <= 21) {
			
			result = number - 21;
			
		} else {
			
			result = 2*(number - 21);
		}
		
		
		return result;
	}
}
