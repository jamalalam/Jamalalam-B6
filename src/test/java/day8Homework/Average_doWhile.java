package day8Homework;

public class Average_doWhile {
	public static void main (String args []) {
		
		float i = 20.0f;
		float total = 0.0f;
		int n = 10;
		
		do {
		total+= i;
		 i++;
		} while (i <=30);
		
		System.out.println("Average for numbers 20 - 30 is " + (total/n));
	}
}
