package basicToday._27_03_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Palindrome {

    public static void main(String[] args) {
        String s = "ASSDDSSA";
        String d = "HELLO";

        List<Character> characters = new ArrayList<>();

        for (char ch : s.toCharArray()){
            characters.add(ch);
        }

        Iterator<Character> word = characters.iterator();
        System.out.println(characters);
    }

}
