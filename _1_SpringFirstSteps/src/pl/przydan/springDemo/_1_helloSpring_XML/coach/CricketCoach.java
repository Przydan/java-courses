package pl.przydan.springDemo._1_helloSpring_XML.coach;

import pl.przydan.springDemo._1_helloSpring_XML.fortune.FortuneService;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    // create no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCouch: inside no-arg constructor. ");
    }

    // create setter method to DI
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCouch: inside setter method. ");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit the ball!";
    }

    @Override
    public String getDailyFortune() {
        return "You won! " + fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}