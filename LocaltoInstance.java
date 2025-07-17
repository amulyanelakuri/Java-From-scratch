public class LocaltoInstance {
	int a = 30; //Instance Variable with assign value
	int b ; // Instance variable without assign value
	
	
	public void method() {
		int x = 12; //Local variable with assign value
		int y; // instance variable without assign value
		System.out.println(a); //30
		System.out.println(b); //0
		//System.out.println(y); //error
	}
	
	
	public static void main (String[] args) {
		LocaltoInstance li = new LocaltoInstance();
		// instance variable are accessible throughout the class
		System.out.println(li.a); //error
		System.out.println(li.b); // null
		
		li.method();
		//local variables cannot access outside their method
		//System.out.println(x);
		//System.out.println(y); //error
	}

}