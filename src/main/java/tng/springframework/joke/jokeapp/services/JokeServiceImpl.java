package tng.springframework.joke.jokeapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{
	
	private final ChuckNorrisQuotes chuckNorrisquotes;
	
	public JokeServiceImpl() {
		// TODO Auto-generated constructor stub
		this.chuckNorrisquotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return chuckNorrisquotes.getRandomQuote();
	}
}
