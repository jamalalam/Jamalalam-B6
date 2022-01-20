package day19Homework;

public class Problem7 {
	
	public static void main(String[] args) {
		
		// calling non-static to static in same class - create a class object and then use objectName.methodName
		Problem7 obj = new Problem7();
		
		String name1 = obj.helloTo("Denis");
		System.out.println(name1);
		
		String name2 = obj.helloTo("Malek");
		System.out.println(name2);
		
		String name3 = obj.helloTo("Sara");
		System.out.println(name3);
		
	}

	String helloTo(String strOne) {
		
		String greeting = "Hello ";
		
		String result = greeting + strOne; 
		
		return result;
	}
	
}
