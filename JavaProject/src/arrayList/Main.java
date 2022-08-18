package arrayList;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Subject> subject = new ArrayList<>();
		subject.add(new Subject("현기원1" , 70, 80));
		subject.add(new Subject("현기원2" , 71, 81));
		
		for(Subject s : subject) {
			System.out.println(s.getName());
			System.out.println(s.getKor());
			System.out.println(s.getMath());
			s.setTotal();
			System.out.println(s.getTotal());
		}
		
	}
}
