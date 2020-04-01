package pl.przydan.springDemo._3_JavaAnnotations.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.przydan.springDemo._3_JavaAnnotations.fortune.FortuneService;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("dbFortuneService")
    private FortuneService fortune;

    public TennisCoach() {
    }

    //    @Autowired
//    public TennisCoach(FortuneService fortune) {
//        System.out.println(">> inside constructor injection method");
//        this.fortune = fortune;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practise your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }
}
