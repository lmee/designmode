package com.jieer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Mediator mediator = new ConcreteMediator();
			Purchaser purchaser = new Purchaser(mediator);
			Vendor vendor = new Vendor(mediator);
			purchaser.buyHouse();
			System.out.println("-------------Æ¯ÁÁµÄ·Ö¸îÏß----------------");
			vendor.sellHouse();
	}

}
