package com.kodilla.quotes.controller;

import com.kodilla.quotes.model.Quote;
import com.kodilla.quotes.service.QuoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quote")
public class QuoteController {
    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/random")
    public Quote getRandom(){
        return quoteService.getRandomQuote();
    }

    @GetMapping
    public Quote getRandom(@RequestParam Integer id){
        return quoteService.getQuoteByIndex(id);
    }

    @GetMapping("/health")
    public String health(){
        return "OK";
    }
}
