package com.pinaki.corespring.springbasics.games;

import org.springframework.stereotype.Component;

@Component
public class Mario implements GamingConsole{
	
	public void up() {
		
		System.out.println("JUMP");
	}
	
	public void down() {
		System.out.println("Go into Hole");
	}
	
	public void left() {
		System.out.println("Go Back");
	}
	
	public void right() {
		System.out.println("Accelarate");
	}
}
