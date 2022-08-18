package project;

public class Bank {
	private String accuntNum;
	private String name;
	private String pwd;
	private int balace;
	
	
	
	
	
	public Bank(String accuntNum, String name, String pwd, int balace) {
		this.accuntNum = accuntNum;
		this.name = name;
		this.pwd = pwd;
		this.balace = balace;
	}
	public String getAccuntNum() {
		return accuntNum;
	}
	public void setAccuntNum(String accuntNum) {
		this.accuntNum = accuntNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getBalace() {
		return balace;
	}
	public void setBalace(int balace) {
		this.balace += balace;
	}

}
