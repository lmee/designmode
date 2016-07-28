package com.jieer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master master =new ZhangSan();
		master.accept(new Visitor1());
		master.accept(new Visitor2());
	}

}
