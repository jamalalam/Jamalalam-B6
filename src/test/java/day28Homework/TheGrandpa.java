package day28Homework;

public class TheGrandpa { // class cannot be private

	private String country;
	private String city;

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCity(String city) { // set method should be public
		this.city = city;
	}

	public String getCity() { // get method should be public
		return city;
	}

	public void  display() {
		
		System.out.println("Country: " + country);
		System.out.println("City: " + city);
		addNum(11,4); //separate parameters by ,
	}

	public int addNum(int a, int b) { //remove ; private changed to public for accessibility
		
		int result = 0; // return type missmatch
		
		result = a+b;
		
		return result;
	}
	
}