package day8Homework;

public class Hurricane {
	public static void main(String[] args) {
		
	
	
	
	for (int windSpeed=20;  windSpeed<=194; windSpeed++) {
		
		if (windSpeed>=74 && windSpeed<=95) {
			System.out.println("Category 1 Hurricane: " + windSpeed + " MPH");
		} else if (windSpeed>=105 && windSpeed<=110) {
			System.out.println("Category 2 Hurricane: " + windSpeed + " MPH");
		} else if(windSpeed>=120 && windSpeed<=130) {
			System.out.println("Category 3 Hurricane: " + windSpeed + " MPH");
		} else if(windSpeed>=140 && windSpeed<=155) {
			System.out.println("Category 4 Hurricane: " + windSpeed + " MPH");	
		} else if (windSpeed>=165 && windSpeed<=194) {
			System.out.println("Category 5 Hurricane: " + windSpeed + " MPH");	
		} else {
			System.out.println("Does not Qualify as a Hurricane: " + windSpeed + " MPH");	
			

		}
	

		}
	}
}
