package 생성자;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person();
		// Person() = 생성자
		personLee.name = "김유신";
		personLee.height = 74.2;
		personLee.weight = 74.2;
		System.out.println(personLee.name);
		
		Person personKim = new Person("이순신", 41.6, 85.6);
		System.out.println(personKim.name);

	}

}
