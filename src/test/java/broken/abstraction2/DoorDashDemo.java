package broken.abstraction2;

public class DoorDashDemo {

	public static void main(String[] args) {
		
		//DoorDash obj1 = new DoorDash("John", 123);	// we can't instantiate an interface 	
		//Healthy obj2 = new Healthy();
			
		Subway obj3 = new Subway("Name", 30);// fix spelling mistake, add arguments 
		obj3.setPrice(22.22); // unless we change the object name, we can't access the non overridden methods in Subway class
		
		
		Subway obj4 = new Subway("Subway", 30);	// subway and chipotle classes do not have a parent child relationship // Subway object created
		obj4.fee();
		
		Chipotle obj5 = new Chipotle();// MyChoice and chipotle classes do not have a parent child relationship
		obj5.setPrice(11);
				
		//Subway obj5 = new Subway("MD",22); //repeated
		
		//obj4.amount = 22; // amount and name are final. they cannot be reassigned
		//obj4.name = "MD"; // 
		
		System.out.println(obj5.amount);
		System.out.println(obj5.name);
		
		
	}
		

}