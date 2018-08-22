package BabyNamesNumberChecker;

import java.util.HashMap;

/**
 * @author 212607214
 * @Date 8/14/2018
 */
public class CheckerDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> lettersValue = new HashMap<>();
        lettersValue.put("A",1);
        lettersValue.put("B",2);
        lettersValue.put("C",3);
        lettersValue.put("D",4);
        lettersValue.put("E",5);
        lettersValue.put("F",8);
        lettersValue.put("G",3);
        lettersValue.put("H",5);
        lettersValue.put("I",1);
        lettersValue.put("J",1);
        lettersValue.put("K",2);
        lettersValue.put("L",3);
        lettersValue.put("M",4);
        lettersValue.put("N",5);
        lettersValue.put("O",7);
        lettersValue.put("P",8);
        lettersValue.put("Q",1);
        lettersValue.put("R",2);
        lettersValue.put("S",3);
        lettersValue.put("T",4);
        lettersValue.put("U",6);
        lettersValue.put("V",6);
        lettersValue.put("W",6);
        lettersValue.put("X",5);
        lettersValue.put("Y",1);
        lettersValue.put("Z",7);

        String name = "Sivageeth";
        String[] letters = name.split("");
        int total =0;
        for(String letter:letters){
            System.out.println(letter);
            total += lettersValue.get(letter.toUpperCase());
        }
        System.out.println("Number is: "+total);
        System.out.println();
    }
}
