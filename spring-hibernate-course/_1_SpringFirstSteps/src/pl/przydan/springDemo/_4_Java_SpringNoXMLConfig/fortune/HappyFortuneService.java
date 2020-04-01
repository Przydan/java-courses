package pl.przydan.springDemo._4_Java_SpringNoXMLConfig.fortune;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        System.out.println(">> method: only happy fortune ;) ");
        return "It is your lucky day!";
    }
}
