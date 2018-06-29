package test.abstraction;

/**
 * @author 212607214
 * @Date 2/27/2018
 */
public interface Player {
    void play();

    void profile();

    static void homeTeam(String teamName){
        System.out.println("Home Team is: "+teamName);
    }

    default void checkImplementation(){
        System.out.println("This is Default method in interface");
    }
}
