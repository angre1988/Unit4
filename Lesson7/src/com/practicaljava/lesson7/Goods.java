package com.practicaljava.lesson7;

abstract public class Goods {
	private String name;
	
	final int INCREASE_CAP = 20;
	
	public Goods(String name){
		this.name=name;
}

	public String getName(){
		return "Brand is " + name;
	}

	public void setDiscount(){
		   System.out.println("Set discount to " + name);
	}

	 }


