package com.jieer;

import java.util.Date;

public class HeroState implements Cloneable {
	private int HP;
	
	private int MP;
	
	private Date stateDate;
	
	public HeroState(int HP,int MP,Date stateDate){
		this.HP = HP;
		this.MP = MP;
		this.stateDate = stateDate;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int mP) {
		MP = mP;
	}

	public Date getStateDate() {
		return stateDate;
	}

	public void setStateDate(Date stateDate) {
		this.stateDate = stateDate;
	}
	
	@Override
	protected HeroState clone() {
		// TODO Auto-generated method stub
		try {
			return (HeroState)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
