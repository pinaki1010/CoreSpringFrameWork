package com.pinaki.corespring.springbasics.games;

public class GameRunner {
	GamingConsole gamingConsole;
	
	public GameRunner(GamingConsole gamingConsole) {
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
