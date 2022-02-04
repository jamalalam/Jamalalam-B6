package day28Homework;

public class FunDemo {
	
	public static void main(String[] args) {
		
		//The Grandpa Object	
		TheGrandpa grandpaObj = new TheGrandpa();
				
		//grandpaObj.country = "USA";	access through set method like underneath	
		grandpaObj.setCountry("USA");	
		System.out.println(grandpaObj.getCountry()); //missing () after getCountry
		
		grandpaObj.addNum(2,5);
		grandpaObj.display(); // display doesnt take a parameter
		
	
		

	
		
	 
		
		//TheDad object
		
		TheDad dadObj = new TheDad();
		dadObj.setAge(66); // change TheGrandpa to TheDad
		System.out.println(dadObj.getAge());
		dadObj.setAge(12);
		//int theAge = dadObj.setAge(33);		
		System.out.println(dadObj.getAge()); //remove true
		//dadObj.favNum(7);
		dadObj.setCountry("Canada"); //remove string name
		System.out.println(dadObj.getCountry());
		
		
		//TheSon object 
		TheSon sonObj = new TheSon();
		
		sonObj.setGrade('A'); //char needed as a param
		
		sonObj.getGrade(); // no param for get method. redundant line of code
		System.out.println(sonObj.getGrade()); 
		
		sonObj.addNum(3, 5);
		
		sonObj.setCity("Reston"); //assign city as a param
		// int result = dadObj.favNumWho(7); // this method doesn't existing in theDad or Thegrandpa or theson class
		System.out.println(sonObj.getCity());
		
		sonObj.trapZone(); // trapZone was made public to retrieve the method
		
		//boolean isMeOkay = sonObj.moreTrap("no more please); //moreTrap takes a char as a param, fixed below
		sonObj.moreTrap('Y');
		System.out.println("Yes :)"); 
	}

}