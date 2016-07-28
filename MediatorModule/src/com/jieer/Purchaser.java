package com.jieer;

public class Purchaser extends Colleague {
	
	public Purchaser(Mediator mediator) {
		super(mediator);
	}

	public void buyHouse() {
		System.out.println("Hi Mediator, I'm Purchaser,I want a new hourse");
		this.mediator.execute(this);
	}
	
	public String getMoney(){
		return "100W";
	}
}
