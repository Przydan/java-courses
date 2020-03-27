package pl.przydan.springDemo._3_JavaAnnotations.fortune;

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
        return FORTUNES.get(new Random().nextInt(FORTUNES.size()));
    }
}