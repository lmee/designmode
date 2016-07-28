package com.jieer;

public class Game {
	
	private HeroState heroState;
	
	private SenceState senceState;

	public HeroState getHeroState() {
		return heroState;
	}

	public void setHeroState(HeroState heroState) {
		this.heroState = heroState;
	}

	public SenceState getSenceState() {
		return senceState;
	}

	public void setSenceState(SenceState senceState) {
		this.senceState = senceState;
	}
	
	public GameMemento createMemento(){
		
		return new GameMemento( heroState, senceState);
	}
	
	public void restoreGame(GameMemento memento){
		this.setHeroState(memento.getHeroState());
		this.setSenceState(memento.getSenceState());
	}
	
	public void showGameInfo(){
		System.out.println("HP-->"+heroState.getHP()+";\n MP-->"+heroState.getMP());
		System.out.println("Coin-->"+senceState.getCoin()+";\n wood-->"+senceState.getWood());
	}

}
