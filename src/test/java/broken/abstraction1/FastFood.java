package broken.abstraction1;

public class FastFood extends Restaurant { // Restaurant should be extended as it's a class not interface
	private String info; //added to give access through set and get methods

	public FastFood() { //immediate parent class should be invoked because it is parameterized
		super("Cava", 4, 10);

	}

	public void location() { // static removed to be overriden
		System.out.println("Reston VA");
	}

	@Override
	public void setOperationTime() {
		System.out.println("24/7");
	}

	@Override
	public void specialMenu() {
		System.out.println("Food");
	}

	@Override
	public void lunchMenu() { // missing access modifier, and match parameter to parent class method
		System.out.println("Time");
	}

	@Override
	public void breakfastMenu() { // method need, access modifier and return type need to match parent class
									// method
		System.out.println("Not serving...");
	}

	@Override
	public void dinnerMenu() {// method need, access modifier and return type need to match parent class
								// method
		System.out.println("7PM-10PM");
	}

	public void display() {

		// DISCOUNT = 30.00; // DISCOUNT value can't be reassigned. it has the
		// non-access modifier of final

		luckyNumber = 22; // luckyNumber is of datatype int

		waitTime = 0; // waitTime is of datatype int

		// System.out.println(rating()); // we need to provide the implementation of the
		// method rating
	}

	@Override
	void rating() {
		System.out.println("Top Rate");
	}

	public String getInfo() { // abstract methods not allowed in concrete class; return type for get method
								// changed to String
		return info;
	}

	public void setInfo(String info) { // set method param and body missing
		this.info = info;
	}

}