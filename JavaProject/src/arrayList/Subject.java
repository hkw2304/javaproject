package arrayList;

public class Subject {
	private String name;
	private int kor;
	private int math;
	private int total = 0;
	
	
	public Subject(String name, int kor, int math) {
		this.name = name;
		this.kor = kor;
		this.math = math;
	}



	public int getTotal() {
		return total;
	}



	public void setTotal() {
		this.total = kor + math;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
}
