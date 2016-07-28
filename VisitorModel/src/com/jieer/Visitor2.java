package com.jieer;

public class Visitor2 implements Visitor {

	@Override
	public void visit(Master friend) {
		// TODO Auto-generated method stub
		System.out.println(friend.getSecurty());
	}

}
