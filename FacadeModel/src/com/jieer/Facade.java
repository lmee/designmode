package com.jieer;

public class Facade {
	
	private ModuleA ma = new ModuleA();
	
	private ModuleB mb = new ModuleB();
	
	public void invokeByOutorA(){
		ma.invokeByOuter();
	}

	public void invokeByOutorB(){
		mb.invokeByOuter();
	}
}
