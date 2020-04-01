package pl.przydan.springDemo._4_Java_SpringNoXMLConfig.coach;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.fortune.FortuneService;

@Component
public class TennisCoach implements Coach {

    private final FortuneService fortune;

    public TennisCoach(@Qualifier("dbFortuneService") FortuneService fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Practise your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }
}
