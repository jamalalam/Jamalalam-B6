package day8Homework;

public class Average_while {

	public static void main (String args []) {
		
		float i = 20.0f;
		float total = 0.0f;
		int n = 10;
		
		while ( i <=30) {
			
		 total= total + i;	
		 i++;
		 
		}
		
		System.out.println("Average for numbers 20 - 30 is " + (total/n));
		
	}
}
