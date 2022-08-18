package arrarlist2;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectlist;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectlist = new ArrayList<>();
	}
	
	public void addSubject(String name, int score)
	{
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectlist.add(subject);
	}
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectlist) {
			System.out.println("학생 : " + studentName + "의" + s.getName() + "과목 성적은"
					+ s.getScorePoint() + "점 입니다.");
			total += s.getScorePoint();
		}
		System.out.println("총점 : " + total);
	}

	
}
