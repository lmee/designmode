package com.jieer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appliance tv =new TV();
		Command open = new OpenCommand(tv);
		Command close = new CloseCommand(tv);
		RemoteControl rc = new RemoteControl(open,close);
		rc.turnOpen();
		rc.turnClose();
	}

}
