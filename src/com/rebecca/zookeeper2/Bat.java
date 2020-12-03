package com.rebecca.zookeeper2;

import com.rebecca.zookeeper.Mammal;

public class Bat extends Mammal {
	
	public Bat() {
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("Screeeeeeeeeee"); 
		this.setEnergyLevel(this.getEnergyLevel()-50);
	}
	
	public void eatHumans() {
		System.out.println("Look out! Ahhhhh!");
		this.setEnergyLevel(this.getEnergyLevel()+25);
	}
	
	public void attackTown() {
		System.out.println("Burrrrrrrnnnnnniiiiinnnnnnggggg"); 
		this.setEnergyLevel(this.getEnergyLevel()-100);
	}

}
