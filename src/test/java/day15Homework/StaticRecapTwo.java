package day15Homework;

public class StaticRecapTwo {

	// static method
	public static void getInfo() {

		//TODO call [isJavaFun] variable and assign value = true
		/// calling static from a different class - use className.variableName
		StaticRecapOne.isJavaFun = true;

		//TODO call [totalAmount] variable and assign value = 1111
		StaticRecapOne.totalAmount = 1111;

		//TODO print value of variable [isJavaFun]
		System.out.println(StaticRecapOne.isJavaFun);
		
		//TODO print value of variable [totalAmount]
		System.out.println(StaticRecapOne.totalAmount);

		//TODO call method [addNum()]
		StaticRecapOne.addNum(0, 0);
 

	}

	// non-static method
	public void statusUpdate() {

		//TODO call [month] variable and assign value = "January"
		/// calling instance from a different class - create a new object, then call using objectName/variableName
		StaticRecapOne obj = new StaticRecapOne();
		obj.month = "January";

		//TODO call [iLikeJava] variable and assign value = "Java is life"
		/// calling instance from a different class - already have a new obj, use objectName/variableName
		obj.iLikeJava = "Java is life";
		

		//TODO print value of variable [month]
		System.out.println(obj.month);

		//TODO print value of variable [iLikeJava]
		System.out.println(obj.iLikeJava);
		
		//TODO call method [getCountry()]
		obj.getCountry();


	}

	public static void main(String[] args) {
		 

		//TODO call method [getInfo()]
		/// same class - call directly by name
		getInfo();
	}
}