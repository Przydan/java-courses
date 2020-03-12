package pl.przydan.AOP_app._9_around_advice_exceptions_handling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.przydan.AOP_app._9_around_advice_exceptions_handling.config.AppConfig;
import pl.przydan.AOP_app._9_around_advice_exceptions_handling.service.TrafficFortuneService;

import java.util.logging.Logger;

public class AOP_app_around_advice_exception_handling {
    private static Logger logger = Logger.getLogger(AOP_app_around_advice_exception_handling.class.getName());

    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // get the bean from sprig container
        TrafficFortuneService trafficFortuneService
                = context.getBean("trafficFortuneService", TrafficFortuneService.class);

        logger.info("Main program: AroundAdvice");

        boolean tripWire = true;
        String data = trafficFortuneService.getFortune(tripWire);

        logger.info("My fortune is: " + data);

        logger.info("Finished.");

        // close the context
        context.close();
    }
}
