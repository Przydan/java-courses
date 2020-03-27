package pl.przydan.springDemo._4_Java_SpringNoXMLConfig.configsAndProperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.coach.Coach;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.coach.SwimCoach;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.fortune.FortuneService;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.fortune.RandomFortuneService;

@Configuration
@ComponentScan(value = "pl.przydan.springDemo._4_Java_SpringNoXMLConfig")
@PropertySource("classpath:pl/przydan/springDemo/_4_Java_SpringNoXMLConfig/configsAndProperties/sport.properties")
public class SportConfig {

    @Bean
    public FortuneService rndFortuneService() {
        return new RandomFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(rndFortuneService());
    }

}
