package pl.przydan.springDemo._2_BeanScope_XML.fortune;

import pl.przydan.springDemo._1_helloSpring_XML.fortune.FortuneService;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private static final List<String> FORTUNES = Arrays.asList("Today is your normal day!",
            "Today is your bad day!",
            "Today is your good day!");

    @Override
    public String getFortune() {
        return getRandomFortune();
    }

    private String getRandomFortune() {
        Random rand = new Random();
        return FORTUNES.get(rand.nextInt(2));
    }
}