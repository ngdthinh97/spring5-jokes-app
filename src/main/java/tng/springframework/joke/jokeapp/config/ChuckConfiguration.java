package tng.springframework.joke.jokeapp.config;


import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration  replace by chuck-configuration.xml file
public class ChuckConfiguration {
	
	//@Bean replace by chuck-configuration.xml file
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
