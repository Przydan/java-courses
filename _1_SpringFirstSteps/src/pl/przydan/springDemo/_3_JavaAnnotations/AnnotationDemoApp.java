package pl.przydan.springDemo._3_JavaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.przydan.springDemo._3_JavaAnnotations.coach.Coach;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // Read the Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("pl/przydan/springDemo/_3_JavaAnnotations/annotation-applicationContext.xml");

        // Retrieve bean from Spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach fightCoach = context.getBean("judoCoach", Coach.class);

        // My methods
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());
        
        System.out.println(fightCoach.getDailyWorkout());
        System.out.println(fightCoach.getDailyFortune());


        // Close context
        context.close();
    }
}
