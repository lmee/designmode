package com.jieer;

public class OpenCommand extends Command {
	
	public OpenCommand(Appliance tv) {
		super(tv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		tv.open();
	}

}
