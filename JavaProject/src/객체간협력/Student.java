package 객체간협력;

public class Student {
	private String studentName;
	private int grade;
	private int money;
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -=1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -=1500;	
	}
	public void showinfo() {
		System.out.println(studentName + "님의 남은 돈은 : " + money + "원");
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
