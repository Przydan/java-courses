package pl.przydan.springDemo._2_BeanScope_XML.Coach;

import pl.przydan.springDemo._1_helloSpring_XML.fortune.FortuneService;

public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	// define a constructor for DI

	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
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

	// add a init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside startup method. ");
	}
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside cleanup method. ");
	}
}
