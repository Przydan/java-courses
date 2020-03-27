package pl.przydan.springDemo._1_helloSpring_XML;


import pl.przydan.springDemo._1_helloSpring_XML.coach.CarCoach;
import pl.przydan.springDemo._1_helloSpring_XML.coach.Coach;

public class MyApp {

    public static void main(String[] args) {

        // create the object
        Coach theCoach = new CarCoach();
        // use the object
        System.out.println(theCoach.getDailyWorkout());

    }
}