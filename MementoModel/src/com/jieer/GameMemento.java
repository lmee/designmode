package com.jieer;

public class GameMemento {
	
	private HeroState heroState;
	
	private SenceState senceState;
	
	
	public GameMemento(HeroState heroState,SenceState senceState){
		this.heroState = heroState.clone();
		this.senceState = senceState.clone();
	}
	
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

}
