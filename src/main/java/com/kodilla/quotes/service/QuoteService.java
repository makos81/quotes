package com.kodilla.quotes.service;

import com.kodilla.quotes.model.Quote;
import com.kodilla.quotes.repository.QuoteRepository;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class QuoteService {
    private static final int MAX_QUOTES = 25;
    private final QuoteRepository quoteRepository;
    private final Random random = new Random();

    public QuoteService(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    public Quote getRandomQuote() {
        return quoteRepository.findById((long) random.nextInt(MAX_QUOTES) + 1).orElse(null);
    }

    public Quote getQuoteByIndex(Integer id) {
        return quoteRepository.findById(id.longValue()).orElse(null);
    }

}
