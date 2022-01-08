package day9Homework;

public class BrokenCodeTwo {

	public  static void main (String[] args) { //fix the spelling of void, put it before static and capitalize S in string
		float tempOne = 84.7f; //datatype changed from int to float because of decimal and added f at the end of the number
		float tempTwo = 66.0f; //datatype changed from int to float for consistency
		
		String result;
		if (tempOne <= 0 && tempTwo >= 100) { // remove one & remove "" from 100; switched places for = and > to make it >=
			result = "true";// true and false need to be in double quotes because they are strings
		}  else if (tempOne >= 100 && tempTwo <= 0) { // switch places for = and > to make it >= ; revise if else to else if and remove ; after the parenthesis
			result = "true"; // true and false need to be in double quotes because they are strings
		} else {
			result = "false"; // true and false need to be in double quotes because they are strings
		}
		
		System.out.println(result);
		
		String season = "Monday"; 

		switch (season) { // switch only needs string name not a boolean  
		case "fall": // fall should be in double quotes as it is a String and replace ; with : at the end
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");			
			 
		case "spring": // replace s with an appropriate String like "spring" and replace ; with : at the end
			System.out.println("Recovering from cold weather");			
			break;
		case "summer": //replace ; with : at the end
			System.out.println("Toooo hot");			
			 
		default://replace ; with : at the end
			System.out.println("Season does not exist!");	
		}
		
		
		for(int i=0; i <10; i++){// F in for and I in int should be lowercase and intitialize the variable with i = 0 
									// replace , after 10 with ; and remove ; after the parenthesis
				
			
			if (i == 5) { // remove the extra closing parenthesis and ; at the end
				System.out.println("I equals to 5"); // add ; at the end of the statement
			} else { // else does not need () so remove them 
				System.out.println("I does not equal to 5"); // String needs to be in double quotes; also for consistency and logic, the statement was
															// revised to I does not equal to 
			}
		}

}

}



