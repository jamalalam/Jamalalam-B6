package day8Homework;

public class CozaLozaWoza_while {

	public static void main(String[] args) {

		int i = 1;
		while (i<=36) {
			if (i%3==0 && i%5==0) {
				System.out.println("CozaLoza");
				i++;
				
				
			} else if (i%3==0) {
				System.out.println("Coza");
				i++;
				
			} else if (i%5==0) {
				System.out.println("Loza");
				i++;

			} else if (i%7==0) {
				System.out.println("Woza");
				i++;

			} else {
				System.out.println(i);
				i++;
			}
		}
		}
	}

