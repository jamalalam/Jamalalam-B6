package day28Homework;

public class TheDad  extends TheGrandpa { //extends keyword

	private int age;

	public void setAge(int age) {
		this.age = age; //this keyword missing
	}
	
	public int getAge() {
		return age; //get method should return 
	}

 
	public void randomNum() {
		int number [] = {1,43,65,8,68,23,98,12,12,45,7,0,99, 34,11,54}; // curly braces and remove non ints
		
		
		
		for(int i =0; i < number.length; i++) { //int i and remove ;
			
			System.out.println(number[i]); //i should be in [] for array
			
		}	
	}
	
	
}