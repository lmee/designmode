package com.jieer;

public class SenceState implements Cloneable {
	
	private int coin;
	
	private int wood;
	
	private String mapName;
	
	public SenceState(int coin,int wood,String mapName){
		this.coin = coin;
		this.wood = wood;
		this.mapName = mapName;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int getWood() {
		return wood;
	}

	public void setWood(int wood) {
		this.wood = wood;
	}

	public String getMapName() {
		return mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}
	
	
	@Override
	protected SenceState clone() {
		// TODO Auto-generated method stub
		try {
			return (SenceState)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
