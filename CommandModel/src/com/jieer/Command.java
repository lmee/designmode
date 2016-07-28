package com.jieer;

public abstract class Command {
	
	protected Appliance tv;
	
	public Command(Appliance tv){
		this.tv = tv;
	}

	protected abstract void execute();
}
