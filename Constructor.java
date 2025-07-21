//constuctor is special method in java.
//it used to initialize the objects
public class Constructor {
	String name;
	int id;
	String department;
	public Constructor(String n, int i, String d) {
		name = n;
		id = i;
		department = d;	
	}
	public void method() {
		System.out.println("Name: " +name);
		System.out.println("Id: " +id);
		System.out.println("Department: " +department);
	}
	public static void main(String[] args) {
		Constructor c = new Constructor("Arjun", 101,"CSE");
		Constructor c1 = new Constructor("Vijay", 102,"CsIt");
		Constructor c3 = new Constructor("Amulya", 103,"ECE");
		
		c.method();
		c1.method();
		c3.method();
	}

}

