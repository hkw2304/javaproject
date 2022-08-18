package inherit;

public class VIPcustomer extends Customer{
	private int agentID;
	
	public VIPcustomer() {
		setCustomerGrade("VIP");
		setBonusRatio(0.05);
	} 

}
