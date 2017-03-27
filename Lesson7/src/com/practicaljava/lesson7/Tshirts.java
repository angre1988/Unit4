package com.practicaljava.lesson7;

public class Tshirts extends Goods {
	
	public Tshirts(String name){super(name);
	}
	public boolean increasePay(int percent) {
		if(percent < INCREASE_CAP){
			System.out.println("Increasing discount " + percent + "%. "+ getName());
			return true;
		} else {
			System.out.println("Sorry, can't give discount " + INCREASE_CAP + "%. "+ getName());
			return false;
		}
		
		
	}
}
