package test.abstraction;

import test.abstraction.PersonalInfo;
import test.abstraction.Player;

/**
 * @author 212607214
 * @Date 2/27/2018
 */
public abstract class PlayerInfo implements Player {
    private PersonalInfo personalInfo;

    public PlayerInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
        createProfile();
    }

    private void createProfile() {
        play();
        profile();
    }

    public void viewProfile() {
        System.out.println();
        System.out.println("Player Name: " + personalInfo.getName());
        System.out.println("Age: " + personalInfo.getAge());
        System.out.println("Playing Roles: " + personalInfo.getPlayingRole());
        System.out.println("Plying Teams: ");
        personalInfo.getPlayingTeams().stream().forEach(team -> {
            System.out.print(team);
            System.out.print(",");
        });
        System.out.println();
    }
}
