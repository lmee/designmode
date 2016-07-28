package com.jieer;

public class ConcreteMediator implements Mediator {
	
	private String purchaseMoney =null;
	
	private String vendorMoney = null;

	@Override
	public void execute(Colleague colleague) {
		if(colleague instanceof Purchaser){
			searchHouse();
			contactVendor();
			purchaseMoney = ((Purchaser)colleague).getMoney();
		}else if(colleague instanceof Vendor){
			searchBuyer();
			contactBuyer();
			vendorMoney=((Vendor)colleague).getNeedMoney();
		}
		if(purchaseMoney.equals(vendorMoney)){
			exchange();
		}
	}
	
	private void searchHouse(){
		System.out.println("Mediator are searching all house resource!!");
	}
	
	private void searchBuyer(){
		System.out.println("Mediator are searching all Purchaser resource!!");
	}
	
	private void contactBuyer(){
		System.out.println("Hi Purchaser,I'm mediator, I know that you want a house ,please have a look this.");
	}
	
	private void contactVendor(){
		System.out.println("Hi Vendor,I'm mediator, I help you to find a buyer,please have a look .");
	}
	
	private void exchange(){
		System.out.println("congratulation£¡it's a good transaction.");
	}

}
