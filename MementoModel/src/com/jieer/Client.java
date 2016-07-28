package com.jieer;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		game.setHeroState(new HeroState(100,100,new Date()));
		game.setSenceState(new SenceState(9999099,89898989,"CS"));
		GameMemento mGame = game.createMemento();
		MementoStore mc = new MementoStore();
		mc.setGameMemento(mGame);
		game.showGameInfo();
		System.out.println("-----------Ư���ķָ���-----------------");
		
		game.getHeroState().setHP(50);
		
		game.getSenceState().setCoin(1000);
		
		System.out.println("�Һÿ�������Ҫ�ָ�֮ǰ��״̬��������");
		game.showGameInfo();
		System.out.println("-----------Ư���ķָ���-----------------");
		game.restoreGame(mc.getGameMemento());
		game.showGameInfo();
	}

}
