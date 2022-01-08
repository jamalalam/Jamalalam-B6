package day8Homework;

public class ForLoop_1_32 {

	public static void main(String[] args) {
		
		for (int i = 1; i<=32; i++) {
			if (i%2==0 && (i>=2 && i<=5)){
				System.out.println("Even number 2-5");
			} else if (i%2==0 && (i>=6 && i<=20)) {
				System.out.println("Even number 6-20");

			} else if (i%2==1 && (i>=15 && i<=20)) {
				System.out.println("Odd number 15-20");

			} else {
				System.out.println(i);

			}
		}
	}
}
