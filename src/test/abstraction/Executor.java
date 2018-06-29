package test.abstraction;

import java.util.Arrays;
import java.util.List;

/**
 * @author 212607214
 * @Date 2/27/2018
 */
public class Executor {
    List<PlayerInfo> players;

    public Executor(PlayerInfo... players){
        this.players = Arrays.asList(players);
        execute();
    }

    public void execute(){
        players.forEach(player  -> {
            player.viewProfile();
            player.checkImplementation();
        });
    }
}
