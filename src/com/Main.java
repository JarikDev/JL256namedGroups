package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("abc".replaceAll("(?<Aletter>a)","${Aletter}-"));// (?P<name>group) (?P-name)

        Pattern p= Pattern.compile("<(?<tag>[A-Z][A-Z0-9]*)[^>]*>.*?</\\k<tag>>");
        Matcher m=p.matcher("This is <EM>first</EM> test");
        while (m.find()){
            System.out.println(m.start()+" "+m.group()+" ");
        }
        System.out.println(" ");

        System.out.println("abcd".replaceAll("(a)(?<x>b)(c)(?<y>d)","$1$2$3$3"));
        System.out.println("abcd".replaceAll("(a)(?<x>b)(c)(?<y>d)","$1${x}$3${y}"));

    }
}
