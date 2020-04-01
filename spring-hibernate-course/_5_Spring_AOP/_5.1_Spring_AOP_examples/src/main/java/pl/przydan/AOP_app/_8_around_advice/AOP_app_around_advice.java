package pl.przydan.AOP_app._8_around_advice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.przydan.AOP_app._8_around_advice.config.AppConfig;
import pl.przydan.AOP_app._8_around_advice.service.TrafficFortuneService;

import java.util.logging.Logger;

public class AOP_app_around_advice {
    private static Logger logger = Logger.getLogger(AOP_app_around_advice.class.getName());

    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // get the bean from sprig container
        TrafficFortuneService trafficFortuneService
                = context.getBean("trafficFortuneService", TrafficFortuneService.class);

        logger.info("Main program: AroundAdvice");

        String data = trafficFortuneService.getFortune();

        logger.info("My fortune is: " + data);

        logger.info("Finished.");

        // close the context
        context.close();
    }
}
