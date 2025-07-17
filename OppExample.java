
    public class OppExample {
	int id;
	String name;
	String course;
	char gender;
	int section;
	
	public void study() {
		System.out.println(course + " is learn well it get to help you well..");
		
	}
	public void pg() {
		System.out.println(name+" is passionte on his career");
	}
	public static void main(String[] args) {
		OppExample oe = new OppExample();
		
		oe.id = 123;
		System.out.println(oe.name = "Arjun");
		oe.course = "CSE";
		oe.gender = 'M';
		oe.section = 4;
		
		oe.study();
		oe.pg();
	}

}
    

