package com.practicaljava.lesson7;

public class Shoes extends Goods {

	public Shoes(String name){
		super(name);
	}

	public void increasePay(int percent) {
			System.out.println("Set discount " + percent + "%. "+ getName());

	}
}
