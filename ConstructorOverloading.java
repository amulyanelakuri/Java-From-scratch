// constructor overloading in java two or more constructors in java.
// but each constructor have different set parameters.
public class ConstructorOverloading {
	String item;
	int count;
	boolean hasWant ;
	//default constructor
	public ConstructorOverloading () {
		System.out.println("Good Morning...");
	}
	//Parameterized constructor with one parameter
	public ConstructorOverloading(String item) {
		this.item = item;
		count = 23;
		hasWant = true;
	}
	//constructor 2: with 2 parameters
	public ConstructorOverloading(String item,int count) {
		this.item = item;
		this.count = count;
		hasWant = true;		
	}
	//method for the constructor
	public void method() {
		System.out.println("Name of the Item: " +item);
		System.out.println("No of the Item: " + count);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading co3 = new ConstructorOverloading(); // for default
		ConstructorOverloading co = new ConstructorOverloading("Coffe Powder"); // for one parameter
		ConstructorOverloading co1 = new ConstructorOverloading("Tea Powder",234400); // for 2 parameter
		
		co.method();
		co1.method();
		co3.method();
		
	}

}

