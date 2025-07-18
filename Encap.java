public class Encap {
    private int id  = 12;
	private String name;
	private int marks;
	
	public int method1() {
		return id;
	}
	public void method2(String name) {
		if(name.length()!= 0) {
			System.out.println(name+ " a valid");
		}
		else {
			System.out.println(name + " not Valid");
		}
	}
    public static void main(String[] args) {
		Encap e = new Encap();
		e.method2("Arjun");
		//e.id=12;
		
		System.out.println(e.method1()+" is valid");
	}
    
}
