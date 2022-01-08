package day10Homework;

public class Problem2 {
	public static void main(String[] args) {
		
		getGender('f');
		getGender('F');
		getGender('m');
		getGender('M');


	}
	public static void getGender(char gender) {
		switch (gender) {

		case 'M':
		case 'm':
			System.out.println("Male");
			break;
		case 'F':
		case 'f':
			System.out.println("Female");	
			
		}
	}
}
