package test.abstraction;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 212607214
 * @Date 2/27/2018
 */
public class AbstractionDemo {
    public static void main(String[] args) {
        PersonalInfo kusal = new PersonalInfo.PersonalInfoBuilder("Kusal Mendis", 22)
                .setPlayingRole("Opening Batsman")
                .setPlayingTeams(Arrays.asList("SriLanka National Side", "NCC", "SLPL")).build();
        Player.homeTeam("SL");

        PersonalInfo messi = new PersonalInfo.PersonalInfoBuilder("Lional Messi", 29)
                .setPlayingRole("Forward Player")
                .setPlayingTeams(Arrays.asList("Argentina", "Barcelona")).build();
        Player.homeTeam("Argentina");

        new Executor(new CricketPlayer(kusal),new FootballPlayer(messi));

    }
}
