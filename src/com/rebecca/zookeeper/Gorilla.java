package com.rebecca.zookeeper;

public class Gorilla extends Mammal {

	public Gorilla() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void throwSomething(){
		int energy = this.getEnergyLevel()-5; 
		this.setEnergyLevel(energy); 
	}
	
	public void eatBananas(){
		int energy = this.getEnergyLevel()+10; 
		this.setEnergyLevel(energy);
	}
	
	public void climb() {
		int energy = this.getEnergyLevel()-10; 
		this.setEnergyLevel(energy);
	}
}