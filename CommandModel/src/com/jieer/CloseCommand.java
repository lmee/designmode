package com.jieer;

public class CloseCommand extends Command {
	
	public CloseCommand(Appliance tv) {
		super(tv);
	}

	@Override
	public void execute() {
		tv.close();
	}

}
