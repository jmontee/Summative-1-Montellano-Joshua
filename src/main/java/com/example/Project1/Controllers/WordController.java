package com.example.Project1.Controllers;

import com.example.Project1.Models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {

    private List<Definition> words = new ArrayList<>();

    public WordController(){
        words.add(new Definition().setId(1).setWord("programmer").setDefinition("a person who writes computer programs."));
        words.add(new Definition().setId(2).setWord("professor").setDefinition("a teacher of the highest rank in a college or university."));
        words.add(new Definition().setId(3).setWord("computer").setDefinition("an electronic device for storing and processing data," +
                " typically in binary form, according to instructions given to it in a variable program."));
        words.add(new Definition().setId(4).setWord("judge").setDefinition("a public official appointed to decide cases in a court of law."));
        words.add(new Definition().setId(5).setWord("investment").setDefinition("the action or process of investing money for profit or material result."));
        words.add(new Definition().setId(6).setWord("university").setDefinition("an educational institution designed for instruction, examination, or both, " +
                "of students in many branches of advanced learning, conferring degrees in various faculties, and often embodying colleges and similar institutions."));
        words.add(new Definition().setId(7).setWord("capital").setDefinition("the most important city or town of a country or region, usually its seat of government" +
                " and administrative center."));
        words.add(new Definition().setId(8).setWord("economics").setDefinition("the branch of knowledge concerned with the production," +
                " consumption, and transfer of wealth."));
        words.add(new Definition().setId(9).setWord("math").setDefinition("mathematics"));
        words.add(new Definition().setId(10).setWord("lawyer").setDefinition("a person who practices or studies law; an attorney or a counselor."));
    }

    @GetMapping("/word")
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getWord(){
        Random random = new Random();

        //This will get a random word between 0 and words.size() exclusive
        return words.get(random.nextInt(words.size()));
    }

}
