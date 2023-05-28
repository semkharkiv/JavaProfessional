package main.myLessons.allLessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExam {
    private static String B = "ride";

    public static void main(String[] args) {
        canFormWord(listRandomChar(),B);
    }

    private static List<Character> listRandomChar() {
        List<Character> charList = new ArrayList<>();

        for (char c = 'a';c<='z';c++){
            charList.add(c);
        }
        Collections.shuffle(charList);
        ArrayList<Character> A = new ArrayList<>(charList.subList(0,12));
        System.out.println(A);
        return A;
    }

    private static boolean canFormWord(List<Character> A, String B) {
        List<Character> copyA = new ArrayList<>(A);
        String copyB = new String(B);
        Collections.sort(A);

        for (int i = 0; i < copyB.length(); i++) {
            char c = copyB.charAt(i);

        int index = Collections.binarySearch(copyA,c);
        if (index<0){
            System.out.println("Невозможно составить слово");
            return false;
        }
        copyA.remove(index);
        }
        System.out.println("Из списка А можно составить слово B");
        return true;
    }
}
