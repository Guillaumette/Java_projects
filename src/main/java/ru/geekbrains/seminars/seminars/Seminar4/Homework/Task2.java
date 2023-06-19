package ru.geekbrains.seminars.seminars.Seminar4.Homework;

import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("isValid(\"()\") = " + isValid("()"));
        System.out.println("isValid(\"()[]{}\") = " + isValid("()[]{}"));
        System.out.println("isValid(\"(]\") = " + isValid("(]"));
        System.out.println("isValid(\"{[]}\") = " + isValid("{[]}"));
        System.out.println("isValid(\"\") = " + isValid(""));
        System.out.println("isValid(\"([)]\") = " + isValid("([)]"));
    }

    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for (Character c : s.toCharArray()) {
            switch (c){
                case '(':
                case '[':
                case '{':
                    st.push(c);
                    break;
                case ')':
                    if (st.isEmpty() || st.pop() != '(') return false;
                    break;
                case ']':
                    if (st.isEmpty() || st.pop() != '[') return false;
                    break;
                case '}':
                    if (st.isEmpty() || st.pop() != '{') return false;
                    break;
            }
        }
        return st.isEmpty();
    }
}
