package com.pinaki.corespring.springbasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pinaki.corespring.springbasics.games.GameRunner;
import com.pinaki.corespring.springbasics.games.GamingConsole;
import com.pinaki.corespring.springbasics.games.Mario;
import com.pinaki.corespring.springbasics.games.Pokemon;

@Configuration
@ComponentScan("com.pinaki.corespring.springbasics.games")
public class App1rRunnerMain {
	
	

	public static void main(String[] args) {
   var context = new AnnotationConfigApplicationContext(App1rRunnerMain.class);
   context.getBean(GamingConsole.class).up();
   context.getBean(GameRunner.class).run();
		

	}

}
