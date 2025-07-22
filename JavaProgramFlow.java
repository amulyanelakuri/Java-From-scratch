public class JavaProgramFlow {
	//static variable
	static int var;
	//Non- static variable
	int instaVar;
	//static block
	static {
		System.out.println("Static block will be executed....");
		var = 34;
		System.out.println("Static variable is " + var);
	//Non-static block
	}
	{
		instaVar = 23;
		System.out.println("Non-static block will be executed...");
		System.out.println("static Variable:" + var);
		System.out.println("Instance Variable:" + instaVar);
	}
//Constructor
	public JavaProgramFlow() {
		super();
		System.out.println("Constructor will be executed...");
		var = 98;
		instaVar = 34;
		
	}

     //static method
	public static void setVar() {
	
		System.out.println("Static method will be exectued: " + var);
	}
    //non static method
	public void setInstaVar() {
		
		System.out.println("Instance method will be executed:" + instaVar);
	}
	
	public static void main(String[] args) {
		
		JavaProgramFlow jp = new JavaProgramFlow();
		jp.setVar();
		jp.setInstaVar();
		
	}
}