package com.demo.observermodel;

import java.util.ArrayList;

public class SubjectInstance implements Subject{
	
	private ArrayList<Observer> observers;

	public SubjectInstance(){
		observers=new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		observers.remove(o);
	}
	
	public void notifyObservers(){
		for(int i=0;i<observers.size();i++){
			observers.get(i).update();
		}
	}
}
