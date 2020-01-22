package pl.przydan.springDemo._4_Java_SpringNoXMLConfig.coach;

import org.springframework.beans.factory.annotation.Value;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.fortune.FortuneService;

public class BadmintonCoach implements Coach {

    private FortuneService fortune;
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    public BadmintonCoach(FortuneService fortuneService) {
        this.fortune = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit the rocket!";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
