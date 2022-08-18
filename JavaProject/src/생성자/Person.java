package 생성자;

import 생성자.Person;

public class Person {
	String name;
	double height;
	double weight;
	//오버로드
	 public Person() {
		
	}
	
	public Person(String pname) {
		this.name = pname;
	}

	public Person(String name, double height, double weight) {
		
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	
}
