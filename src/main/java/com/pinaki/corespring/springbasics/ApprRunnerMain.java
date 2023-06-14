package com.pinaki.corespring.springbasics;

import com.pinaki.corespring.springbasics.games.GameRunner;
import com.pinaki.corespring.springbasics.games.Mario;
import com.pinaki.corespring.springbasics.games.Pokemon;

public class ApprRunnerMain {

	public static void main(String[] args) {
		
		
		var pokemon = new Pokemon();
		var mario = new Mario();
		//Tightly Coupled for every other game we need to change constructor
		//So we need to make interface GamingConsole
		var game = new GameRunner(pokemon);
		game.run();

	}

}
