package ru.geekbrains.seminars.seminars.Seminar4.Classwork;

import java.util.Deque;
import java.util.LinkedList;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("simplifyPath(\"/home/\") = " + simplifyPath("/home/"));
        System.out.println("simplifyPath(\"/../\") = " + simplifyPath("/../"));
        System.out.println("simplifyPath(\"/home//foo/\") = " + simplifyPath("/home//foo/"));
        System.out.println("simplifyPath(\"home/d/../s\") = " + simplifyPath("home/d/../s"));
    }

    public static String simplifyPath(String path){
        Deque<String> dq = new LinkedList<>();
        String[] subPath = path.split("/");
        for (String s : subPath) {
            if ("..".equals(s)){
                if (!dq.isEmpty()){
                    dq.pollLast();
                }
            } else if (!".".equals(s) && !"".equals(s)){
                dq.add(s);
            }
        }
        if (dq.isEmpty()) return "/";
        StringBuilder res = new StringBuilder();
        while (!dq.isEmpty()){
            res.append("/").append(dq.pop());
        }
        return res.toString();
    }
}
