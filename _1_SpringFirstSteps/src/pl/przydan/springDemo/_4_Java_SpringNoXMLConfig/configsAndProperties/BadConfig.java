package pl.przydan.springDemo._4_Java_SpringNoXMLConfig.configsAndProperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.coach.BadmintonCoach;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.coach.Coach;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.fortune.BadFortuneService;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.fortune.FortuneService;

@Configuration
@PropertySource("classpath:pl/przydan/springDemo/_4_Java_SpringNoXMLConfig/configsAndProperties/bad.properties")
public class BadConfig {

    @Bean
    public FortuneService badFortune() {
        return new BadFortuneService();
    }

    @Bean
    public Coach badmintonCoach() {
        return new BadmintonCoach(badFortune());
    }
}
