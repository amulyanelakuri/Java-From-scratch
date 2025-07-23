public class Inheri {
	String name ;
	void eat() {
		System.out.println(name+" is eating ");
	}
	void fly() {
		System.out.println(name+ " is flying ");
	}
 
	public static class Eagle extends Inheri{
	
}
	public static class Sparrow extends Inheri{
		
	}   
	public static class MountainEagle extends Eagle{
		
	}
	public static class SerpantEagle extends Eagle{
		
	}
	public static class NonvegSparrow extends Sparrow{
		
	}
	public static class VegSparrow extends Sparrow{
		
	}

	public static void main(String[] args) {
		Inheri i = new Inheri();
		
		i.name= "Garuda";
		i.eat();
		i.fly();
		
		Eagle e = new Eagle();
		e.name= "spokyii";
		e.eat();
		e.fly();
		
		Sparrow s = new Sparrow();
		s.name= "janulu";
		s.eat();
		s.fly();
		
		MountainEagle m = new MountainEagle();
		m.name= "chaduru";
		m.eat();
		m.fly();
		
		SerpantEagle se = new SerpantEagle();
		se.name= "meghali";
		se.eat();
		se.fly();
		
		NonvegSparrow n = new NonvegSparrow();
		n.name= "rama";
		n.eat();
		n.fly();
		
		VegSparrow v = new VegSparrow();
		v.name= "parow";
		v.eat();
		v.fly();
		
	}

}