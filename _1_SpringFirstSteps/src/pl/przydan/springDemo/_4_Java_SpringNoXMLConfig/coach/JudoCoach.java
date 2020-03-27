package pl.przydan.springDemo._4_Java_SpringNoXMLConfig.coach;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.fortune.FortuneService;

@Component
public class JudoCoach implements Coach {

    private final FortuneService fortune;

    public JudoCoach(@Qualifier("happyFortuneService") FortuneService fortune) {

        this.fortune = fortune;
    }


    @Override
    public String getDailyWorkout() {
        return "Punch in the face!";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }

}
