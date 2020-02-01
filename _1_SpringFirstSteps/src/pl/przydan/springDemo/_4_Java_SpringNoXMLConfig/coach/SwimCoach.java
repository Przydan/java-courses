package pl.przydan.springDemo._4_Java_SpringNoXMLConfig.coach;

import org.springframework.beans.factory.annotation.Value;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.fortune.FortuneService;

public class SwimCoach implements Coach {

    private final FortuneService fortune;
    @Value("${foo.email}")
    private String email;
    @Value(value = "JAVA USERS GROUP")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortune = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
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

    @Override
    public String toString() {
        return "SwimCoach{" +
                "email='" + email + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
