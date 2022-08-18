package inherit;

public class Main {

	public static void main(String[] args) {
		Customer lee = new Customer();
		lee.setCustomerID(10101);
		lee.setCustomerName("이순신");
		lee.bonunsPoint = 1000;
		System.out.println(lee.showCustomerInfo());
		VIPcustomer KIM = new VIPcustomer();
		KIM.setCustomerID(10111);
		KIM.setCustomerName("장보고");
		KIM.bonunsPoint = 10000;
		System.out.println(KIM.showCustomerInfo());

	}

}
