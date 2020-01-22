package pl.przydan.springDemo._2_BeanScope_XML;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.przydan.springDemo._2_BeanScope_XML.Coach.Coach;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("pl/przydan/springDemo/_2_BeanScope_XML/beanScope-applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach1", Coach.class);
        Coach alpha_theCoach = context.getBean("myCoach1", Coach.class);

        // Check if they are the same
        boolean result = (theCoach == alpha_theCoach);

        // Printing the results
        System.out.println("\nPointing to the same object:  " + result);

        System.out.println("\nObject references :  " + theCoach + "\n and " + alpha_theCoach);

        context.close();
    }
}
