package broken.abstraction1;

public class RestaurantDemo {

	public static void main(String[] args) { // remove extra semicolon, string needs to be spelled with capital s

		Restaurant obj1 = new FastFood(); // we can't create an object of an abstract class
		obj1.location();
		System.out.println(obj1.DISCOUNT);

		FastFood obj2 = new FastFood(); // restaurant -Spelling error
		System.out.println(obj2.getInfo());
		obj2.setInfo("Information");

		FastFood obj3 = new FastFood(); // remove arguments

		System.out.println(obj3.DISCOUNT); // DISCOUNT value can't be reassigned, because it has the final keyword

		obj3.dinnerMenu(); // remove the print command
		obj3.lunchMenu(); // remove the print command

		System.out.println();

	}

}