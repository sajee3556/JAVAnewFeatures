package test.abstraction;

/**
 * @author 212607214
 * @Date 2/27/2018
 */
public class FootballPlayer extends PlayerInfo {

    public FootballPlayer(PersonalInfo personalInfo) {
        super(personalInfo);
    }

    @Override
    public void play() {
        System.out.println();
        System.out.println("Shoot free kick");
    }

    @Override
    public void profile() {
        System.out.println("he smashed 6 goals in last three appearances");
    }

    @Override
    public void checkImplementation() {
        System.out.println("Default as Foot ball Player");
    }
}
