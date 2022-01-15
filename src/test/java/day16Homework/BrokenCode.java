package day16Homework;
public class BrokenCode {
public static void main(String[] args) { //main spelling
		
		addTwoNumbers(2,4); // only two params accepted as shown in the method
		// addTwoNumbers is a void method. it does not need a new variable. Just call the method
		//System.out.println(addResult); // does not need print. it is already in the method body
				
		for(int i = 0; i <= 10; i++){ // remove the two ; and extra ) change , to ; add < before 10 and  
			System.out.println("Count " + i); // change _ to . after System. change = to + for appending
		}
		
		String newFavNumber1 = whoseFavNumber(23); // only one param is accepted. need to create a new variable
		System.out.println(newFavNumber1);
		String newFavNumber2 = whoseFavNumber(3);	// only one param is accepted, add ; at end
		System.out.println(newFavNumber2);
		String newFavNumber3 = whoseFavNumber(1); // only one param is accepted
		System.out.println(newFavNumber3);
				
		myName("John Cena"); // does not need new variable. directly call the method
} //missing }
	public static void myName(String name) {
		System.out.println("My name is " + name);
	}

	public static void addTwoNumbers(int numOne, int numTwo) { // switch void and static places. need a comma between
																// params. delete the ; after )
		int result = numOne + numTwo;

		System.out.println(numOne + " + " + numTwo + " = " + result);

		//return result; // void methods do not need returns
	}

	public static String whoseFavNumber(int i) { // dont initialize the parameter and remove the extra )
		String result = null; // this datatype should match return type above; String default values is null

		if (i == 1) { // remove ; after ) put a double ==
			result = "Brook"; // missing double quotes a } is also missing. added to next line
		} else if (i == 2 || i == 4) { // i cannot be 4 twice, deleted
			result = "Dannia"; // double quotes and result should be lowercase
		} else if (i == 3) { //missing {
			; // spelling of else
		result = "Helen";
	}	else {
			result = "my favorite number"; // String needs to be in double quotes
	} // was missing }

	return result; // missing return result
} // extra } deleted

}
