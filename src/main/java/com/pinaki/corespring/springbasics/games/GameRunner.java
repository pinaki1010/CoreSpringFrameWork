package com.pinaki.corespring.springbasics.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole gamingConsole;
	
	public GameRunner(@Qualifier("MarioQualifier")GamingConsole gamingConsole) {
		this.gamingConsole=gamingConsole;
	}

	

	public void run() {
		
		System.out.println("Game running");
		gamingConsole.up();
		gamingConsole.down();
		gamingConsole.left();
		gamingConsole.right();
		
	}

}
