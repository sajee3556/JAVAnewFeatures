package test.abstraction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212607214
 * @Date 2/27/2018
 */
public class PersonalInfo {
    private String name;
    private int age;
    private List<String > playingTeams = new ArrayList();
    private String playingRole;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getPlayingTeams() {
        return playingTeams;
    }

    public void setPlayingTeams(List<String> playingTeams) {
        this.playingTeams = playingTeams;
    }

    public String getPlayingRole() {
        return playingRole;
    }

    public void setPlayingRole(String playingRole) {
        this.playingRole = playingRole;
    }

    private PersonalInfo(PersonalInfoBuilder personalInfoBuilder){
                this.name = personalInfoBuilder.name;
                this.age = personalInfoBuilder.age;
                this.playingRole = personalInfoBuilder.playingRole;
                this.playingTeams = personalInfoBuilder.playingTeams;
    }

    public static class PersonalInfoBuilder{
        private String name;
        private int age;
        private String playingRole;
        private List<String> playingTeams;


        public PersonalInfoBuilder setPlayingRole(String playingRole) {
            this.playingRole = playingRole;
            return this;
        }

        public PersonalInfoBuilder setPlayingTeams(List<String> playingTeams) {
            this.playingTeams = playingTeams;
            return this;
        }

        public PersonalInfoBuilder(String name, int age){
            this.name = name;
            this.age = age;
        }

        public PersonalInfo build(){
            return new PersonalInfo(this);
        }
    }
}
