package main.myLessons.allLessons;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        List<String> ourStringList = new ArrayList<>();
        ourStringList.add("I");
        ourStringList.add("love");
        ourStringList.add("Java");
        ourStringList.add("I");
        ourStringList.add("love");
        ourStringList.add("coffee");
        ourStringList.add("Java");
        ourStringList.add("island");
        ourStringList.add("coffee");

        System.out.println(ourStringList);

        List<String> uniqueList = new ArrayList<>();
        for (int i = 0; i < ourStringList.size(); i++) {
            if (!uniqueList.contains(ourStringList.get(i))){
                uniqueList.add(ourStringList.get(i));
            }
        }
        System.out.println(uniqueList);

        Set<String> uniqueSet = new HashSet<>(ourStringList);
        System.out.println(uniqueSet);

        Set<String> uniqueSet2 = new HashSet<>();

        for (int i = 0; i < ourStringList.size(); i++) {
            uniqueSet2.add(ourStringList.get(i));
        }
        System.out.println(uniqueSet2);
    }
}
