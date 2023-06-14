package com.pinaki.corespring.springbasics.games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pokemon implements GamingConsole{
	
public void up() {
		
		System.out.println("Dutch");
	}
	
	public void down() {
		System.out.println("Roll");
	}
	
	public void left() {
		System.out.println("Go Back");
	}
	
	public void right() {
		System.out.println("Attack");
	}
}
