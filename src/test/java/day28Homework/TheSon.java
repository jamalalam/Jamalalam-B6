package day28Homework;

public class TheSon extends TheDad { // extends

	private char grade;

	public final boolean IS_JAVA_FUN = true; // we have to initialize the variable because it's final
	public final String MY_STATE = "VA";

	public void setGrade(char grade) { // remove ;
		this.grade = grade;
	}

	public char getGrade() {
		return grade; //return grade
	}

	public void trapZone() { //made public for visibility 
		char myGrade = 'B';

		int myFavNumber = 77; // these variables need to be initialized 
		System.out.println("My FavNumber" + myFavNumber);

		String teamName = "Team B";
		System.out.println("My Team Name: " + teamName);

		String schoolName = "GMU";
		System.out.println("My School Name: " + schoolName);

		grade = myGrade; 
		System.out.println("My Grade: " + grade);

		// age = 12; // age is an encapsulated private variable. it should be accessed using the set/get methods 
		//System.out.println("My age " + age);
		
		//TheDad obj = new TheDad(); not needed
		setAge(50);
		System.out.println(getAge());
		
		setCountry("USA");
		System.out.println(getCountry());
		//country = "USA"; // age is an encapsulated private variable. it should be accessed using the set/get methods 
		//System.out.println("Country :" + country);

		//IS_JAVA_FUN = "Yes"; // boolean is true or false. regardless, IS_JAVA_FUN is final and cannot be reassigned a value

	}

	public void moreTrap(char grade) {
		this.grade = grade; //this keyword

		//MY_STATE = "CA"; final variable cannot be reassigned

		setCountry("USA"); // new String variable not needed, access directly because TheSon class is inheriting TheDad
		getCountry();

		setCity("Reston");
		System.out.println(getCity());

		setAge(12);
		System.out.println(getAge()); //get method returns not assign values

		
		addNum(3,4);

		display();

		trapZone();

	}

}