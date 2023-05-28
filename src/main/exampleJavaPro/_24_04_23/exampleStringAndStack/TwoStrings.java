package main.exampleJavaPro._24_04_23.exampleStringAndStack;

import java.util.Stack;

//: Реализовать систему, которая проверяет правильность расстановки скобок в строке.
// Необходимо использовать коллекцию Stack в Java для реализации алгоритма.
//"()"; // Правильное расположение скобок
// "([{}])"; Правильное расположение скобок
// String input3 = "({[]})"; // Правильное расположение скобок
// String input4 = "({[})"; // Неправильное расположение скобок
public class TwoStrings {
    public static boolean check(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if ((ch == ')' && stack.peek() == '(') ||
                        (ch == '}' && stack.peek() == '{') ||
                        (ch == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "()";
        String input2 = "([{}])";
        String input3 = "({[]})";
        String input4 = "({[})";

        System.out.println(check(input1)); // true
        System.out.println(check(input2)); // true
        System.out.println(check(input3)); // true
        System.out.println(check(input4)); // false
    }
}
