package com.jieer;

public class Vendor extends Colleague {
	
	public Vendor(Mediator mediator) {
		super(mediator);
	}

	public void sellHouse(){
		System.out.println("Hi mediator ,I'm vendor,I want to sell my house!");
		this.mediator.execute(this);
	}

	public String getNeedMoney(){
		return "100W";
	}
}
