package pl.przydan.springDemo._4_Java_SpringNoXMLConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.coach.BadmintonCoach;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.coach.Coach;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.coach.SwimCoach;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.configsAndProperties.BadConfig;
import pl.przydan.springDemo._4_Java_SpringNoXMLConfig.configsAndProperties.SportConfig;

import static java.lang.System.out;

public class Java_SpringNoXMLDemoApp {
    public static void main(String[] args) {
        // Read the Spring configuration java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);
        AnnotationConfigApplicationContext context2 =
                new AnnotationConfigApplicationContext(BadConfig.class);

        // Retrieve bean from Spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach fightCoach = context.getBean("judoCoach", Coach.class);
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        BadmintonCoach badCoach = context2.getBean("badmintonCoach", BadmintonCoach.class);

        // My methods
        out.println("##############################");
        out.println(tennisCoach.getDailyWorkout());
        out.println(tennisCoach.getDailyFortune());

        out.println("##############################");
        out.println(fightCoach.getDailyWorkout());
        out.println(fightCoach.getDailyFortune());

        out.println("##############################");
        out.println("email: " + swimCoach.getEmail());
        out.println("team: " + swimCoach.getTeam());
        out.println(swimCoach.getDailyWorkout());
        out.println(swimCoach.getDailyFortune());

        out.println("##############################");
        out.println("email: " + badCoach.getEmail());
        out.println("team: " + badCoach.getTeam());
        out.println(badCoach.getDailyWorkout());
        out.println(badCoach.getDailyFortune());

        out.println("##############################");

        // Close context
        context.close();
        context2.close();
    }
}
