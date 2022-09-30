package com.example.Project1.Controllers;

import com.example.Project1.Models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
   private List<Quote> quotes = new ArrayList<>();

   public QuoteController(){
       quotes.add(new Quote().setId(1).setAuthor("Gandalf").setQuote("All we have to decide is what to do with the time" +
               " that is given us."));
       quotes.add(new Quote().setId(2).setAuthor("Dalinar Kholin").setQuote("The most important step a man can take. It's" +
               " not the first one, is it?\n" +
               "It's the next one. Always the next step, Dalinar."));
       quotes.add(new Quote().setId(3).setAuthor("Winnie the Pooh").setQuote("How lucky am I to have something that makes" +
               " saying goodbye so hard"));
       quotes.add(new Quote().setId(4).setAuthor("Darth Vader").setQuote("No. I am your father"));
       quotes.add(new Quote().setId(5).setAuthor("Luke Skywalker").setQuote("Never. I'll never turn to the dark side." +
               " You've failed, Your Highness. I am a Jedi, like my father before me."));
       quotes.add(new Quote().setId(6).setAuthor("Spock").setQuote("I have been – and always shall be – your friend."));
       quotes.add(new Quote().setId(7).setAuthor("Tony Stark").setQuote("I am Iron Man."));
       quotes.add(new Quote().setId(8).setAuthor("Tyrion Lannister").setQuote("Never forget what you are. The rest of " +
               "the world will not. Wear it like armour, and it can never be used to hurt you."));
       quotes.add(new Quote().setId(9).setAuthor("Gandalf").setQuote("I will not say: do not weep; for not all tears are an evil."));
       quotes.add(new Quote().setId(10).setAuthor("Thorin Oakenshield").setQuote("If more of us valued food and cheer and song above" +
               " hoarded gold, it would be a merrier world."));

   }

    @GetMapping("/quote")
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote(){
        Random random = new Random();
        //This will get a random quote between 0 and quotes.size() exclusive
        return quotes.get(random.nextInt(quotes.size()));
    }
}
