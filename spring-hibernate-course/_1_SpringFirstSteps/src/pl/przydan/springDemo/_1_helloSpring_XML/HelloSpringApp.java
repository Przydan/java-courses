package pl.przydan.springDemo._1_helloSpring_XML;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.przydan.springDemo._1_helloSpring_XML.coach.Coach;
import pl.przydan.springDemo._1_helloSpring_XML.coach.CricketCoach;

public class HelloSpringApp {

    public static void main(String[] args) {
        // Load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("pl/przydan/springDemo/_1_helloSpring_XML/applicationContext.xml");

        // Retrieve bean from spring container
        var theCoach = context.getBean("myCoach4", CricketCoach.class);
        var theCoach2 = context.getBean("myCoach2", Coach.class);

        // Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());


        // Let's call our new method for fortune
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        System.out.println("__________________");
        System.out.println(theCoach2.getDailyWorkout());
        System.out.println(theCoach2.getDailyFortune());

        // Close the context
        context.close();
    }
}
