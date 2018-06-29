package test.abstraction;

/**
 * @author 212607214
 * @Date 2/27/2018
 */
public class CricketPlayer extends PlayerInfo {

    public CricketPlayer(PersonalInfo personalInfo) {
        super(personalInfo);
    }

    @Override
    public void play() {
        System.out.println();
        System.out.println("he is down the ground and hit a huge sixes");
    }

    @Override
    public void profile() {
        System.out.println("he scored 6 centuries in last 8 innings"); //statics
    }

}
