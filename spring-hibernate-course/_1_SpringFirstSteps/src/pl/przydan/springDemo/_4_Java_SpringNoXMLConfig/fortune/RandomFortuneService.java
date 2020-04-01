package pl.przydan.springDemo._4_Java_SpringNoXMLConfig.fortune;


import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private static final List<String> FORTUNES =
            Arrays.asList("Today is your normal day!",
                    "Today is your bad day!",
                    "Today is your good day!",
                    "Beware of the wolf in sheep's clothing",
                    "The journey is reward");


    @Override
    public String getFortune() {
        System.out.println(">> method: random hard-coded fortunes");
        return FORTUNES.get(new Random().nextInt(FORTUNES.size()));
    }
}