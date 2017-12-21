package com.maki.springbootjokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
class ChuckNorrisJokeService implements JokeService {
    private final ChuckNorrisQuotes quotes;

    public ChuckNorrisJokeService(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
