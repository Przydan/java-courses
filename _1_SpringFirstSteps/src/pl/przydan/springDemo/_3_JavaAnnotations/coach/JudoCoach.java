package pl.przydan.springDemo._3_JavaAnnotations.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.przydan.springDemo._3_JavaAnnotations.fortune.FortuneService;

@Component
public class JudoCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortune;

//    @Autowired
    public JudoCoach() {
        System.out.println(">> inside setter injection method");
    }

//    public JudoCoach(FortuneService fortune) {
//        this.fortune = fortune;
//    }

    @Override
    public String getDailyWorkout() {
        return "Your are the Power! ";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }

//    @Autowired
//    public void setFortune(FortuneService fortune) {
//        this.fortune = fortune;
//    }
}
