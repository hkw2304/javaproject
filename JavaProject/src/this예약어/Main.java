package this예약어;

public class Main {
	String name;
	int age;
	
	public Main() {
		this("현기원", 28);
	}
	
	public Main(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Main returnSelf() {
		return this;
	}

	public static void main(String[] args) {
		Main m = new Main();
		
		System.out.println(m.name);
		Main mm = m.returnSelf();
		System.out.println(mm.returnSelf());
		

	}

}
