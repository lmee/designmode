package com.jieer;

public class TV implements Appliance{

	@Override
	public void open() {
		System.out.println("Open the TV !");
	}

	@Override
	public void close() {
		System.out.println("Close The TV");
	}
}
