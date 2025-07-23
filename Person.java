public class Person {
	String name;
	int age;
	
	public void method() {
		System.out.println("Name of the Person is: " + name+" and is the " + age);
	}

	public static void main (String[] args) {
		Person p = new Person();
		p.name = "Arjun";
		p.age = 25;
		p.method();
		
		Student se = new Student();
		se.name = "Amulya";
		se.age = 20;
		se.studentID = "5L8";
		se.method();
	}
	
}

class Student extends Person {
	String studentID ;
	public void method() {
		System.out.println("hello I am " + name + " and iam just " + age + " and my id is "+ studentID);
	}	
}