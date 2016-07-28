package com.jieer;

public class ZhangSan implements Master {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	@Override
	public String getSecurty() {
		// TODO Auto-generated method stub
		return "My foot is very stink...hhah";
	}

}
