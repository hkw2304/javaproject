package arrarlist2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		Student s = new Student(1, name);
		
		System.out.print("과목 : ");
		String subject = sc.next();
		System.out.print(subject + "점수 : ");
		int num = sc.nextInt();
		s.addSubject(subject, num);
		s.addSubject("수학", 90);
		s.showStudentInfo();

	}

}
