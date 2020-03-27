package pl.przydan.springDemo._3_JavaAnnotations.fortune;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "It is your lucky day!";
    }
}
