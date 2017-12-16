package com.maki.springbootjokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
class ChuckNorrisJokeService implements JokeService {
    private final ChuckNorrisQuotes quotes;

    public ChuckNorrisJokeService() {
        this.quotes = new ChuckNorrisQuotes();
    }

    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
