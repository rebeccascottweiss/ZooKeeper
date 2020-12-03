package com.rebecca.zookeeper;

public class Mammal {
	private int energyLevel; 
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public Mammal() {
		this.energyLevel = 100; 
	}; 
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel; 
	}; 
	
	
}
