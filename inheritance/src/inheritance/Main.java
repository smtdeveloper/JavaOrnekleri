package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer samet = new IndividualCustomer();
		samet.customerNumber ="12345";
		
		CorporateCustomer HepsiBurada = new CorporateCustomer();
		HepsiBurada.customerNumber="96332";
		
		SendikaCustomer sendika01 = new SendikaCustomer();
		sendika01.customerNumber = "15963";
		
		
		CustomerManager customerManager = new CustomerManager();
		
		
		Customer[] customers = { samet, HepsiBurada , sendika01 };
		
		
		customerManager.addMultiple(customers);
	}

}
