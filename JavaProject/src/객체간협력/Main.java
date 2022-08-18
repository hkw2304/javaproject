package 객체간협력;

public class Main {

	public static void main(String[] args) {
		Student s = new Student("James", 5000);
		Student ss = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		s.takeBus(bus100);
		s.showinfo();
		bus100.showInfo();
		
		Subway subway = new Subway("2호선");
		ss.takeSubway(subway);
		ss.showinfo();
		subway.showInfo();

	}

}
