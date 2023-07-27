package com.learn.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	private Heart heart;

	public Human() {
		
	}
	

	public Human(Heart heart) {
		super();
		this.heart = heart;
		System.out.println("constructor invoked....");
	}

	public Heart getHeart() {
		return heart;
	}

	@Autowired
	@Qualifier(value = "octopus  Heart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void pumpingHeart() {
		heart.pumping();
	}
}
