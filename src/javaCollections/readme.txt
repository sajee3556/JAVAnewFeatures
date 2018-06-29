/*
 * List, Set and Map are the interfaces which implements Collection interface.


1) Duplicity: List allows duplicate elements. Any number of duplicate elements can be inserted into the list without affecting
    the same existing values and their indexes.
    Set doesn’t allow duplicates. Set and all of the classes which implements Set interface should have unique elements.
    Map stored the elements as key & value pair. Map doesn’t allow duplicate keys while it allows duplicate values.

2) Null values: List allows any number of null values.
    Set allows single null value at most.
    Map can have single null key at most and any number of null values.

3) Order: List and all of its implementation classes maintains the insertion order.
    Set doesn’t maintain any order; still few of its classes sort the elements in an order such as LinkedHashSet maintains
    the elements in insertion order.
    Similar to Set Map also doesn’t stores the elements in an order, however few of its classes does the same.
     For e.g. TreeMap sorts the map in the ascending order of keys and LinkedHashMap sorts the elements in the insertion order,
      the order in which the elements got added to the LinkedHashMap

-Commonly used classes:
 List: ArrayList, LinkedList etc.
 Set: HashSet, LinkedHashSet, TreeSet, SortedSet etc.
 Map: HashMap, TreeMap, WeakHashMap, LinkedHashMap, IdentityHashMap etc.
