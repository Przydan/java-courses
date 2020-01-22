package pl.przydan.springDemo._2_BeanScope_XML;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.przydan.springDemo._2_BeanScope_XML.Coach.Coach;

public class BeanLifecycleScopeDemoApp {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("pl/przydan/springDemo/_2_BeanScope_XML/beanLifeCycle-applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach1", Coach.class);

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
