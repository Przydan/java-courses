package pl.przydan.springDemo._1_helloSpring_XML.coach;


import pl.przydan.springDemo._1_helloSpring_XML.fortune.FortuneService;

public class CarCoach implements Coach {

    // Define a private field for the dependency
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    // Define a constructor for DI
    public CarCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public CarCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Track all day";
    }

    @Override
    public String getDailyFortune() {
        return "Drift competition: " + fortuneService.getFortune();
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
