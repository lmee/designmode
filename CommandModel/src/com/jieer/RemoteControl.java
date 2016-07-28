package com.jieer;

public class RemoteControl {
	
	private Command open;
	private Command close;
	
	public RemoteControl(Command open,Command close){
		this.open = open;
		this.close = close;
	}

	public void turnOpen(){
		open.execute();
	}
	
	public void turnClose(){
		close.execute();
	}
}
