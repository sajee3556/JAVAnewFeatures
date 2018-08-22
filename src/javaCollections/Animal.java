package javaCollections;

/**
 * @author 212607214
 * @Date 8/6/2018
 */
public class Animal {
    private String name;
    private int age;
    private String ability;
    private String owner;
    private String version;
    public Animal(String name,int age,String ability,String owner ){
        this.name = name;
        this.age = age;
        this.ability = ability;
        this.owner = owner;
    }

    public Animal(String name,int age,String ability,String owner,String version){
        this.name = name;
        this.age = age;
        this.ability = ability;
        this.owner = owner;
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

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

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (getAge() != animal.getAge()) return false;
        if (getName() != null ? !getName().equals(animal.getName()) : animal.getName() != null) return false;
        if (getAbility() != null ? !getAbility().equals(animal.getAbility()) : animal.getAbility() != null)
            return false;
        return getOwner() != null ? getOwner().equals(animal.getOwner()) : animal.getOwner() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        result = 31 * result + (getAbility() != null ? getAbility().hashCode() : 0);
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        return result;
    }
}
