package javaCollections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212607214
 * @Date 8/6/2018
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        Animal a1= new Animal("X1",1,"Y1","z1");
        Animal a2= new Animal("X2",2,"Y2","z2");
        Animal a3= new Animal("X3",3,"Y3","z3");
        Animal a4= new Animal("X4",4,"Y4","z4");
        Animal a5= new Animal("X5",5,"Y5","z5");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(a1);
        animalList.add(a2);
        animalList.add(a3);
        animalList.add(a4);
        animalList.add(a5);

        Animal b1= new Animal("X1",1,null,"z1");
        System.out.println("Equals ? "+b1.equals(a1));
        System.out.println("Equals ? "+b1.equals(a2));
        System.out.println();

        Animal c1= new Animal("X1",1,"Y1","z1", "1.0");
        Animal c2= new Animal("X1",1,"Y1","z1", "2.0");
        System.out.println("Equals ? "+c1.equals(a1));
        System.out.println("Equals ? "+c1.equals(c2));
        System.out.println();

        String equipNum = null;
        System.out.println( );
        System.out.println("format: "+String.format("%06d",Integer.parseInt(equipNum)));
        System.out.println( );
    }
}
