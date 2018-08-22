package javaCollections;

import java.util.Comparator;

/**
 * @author 212607214
 * @Date 8/6/2018
 */
public class ObjectValuesComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.equals(a2) ? 0 : 1;
    }
}
