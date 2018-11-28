package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("abcd".replaceAll("(a)(?<x>b)(c)(?<y>d)","$1$2$3$4"));
        System.out.println("abcd".replaceAll("(a)(?<x>b)(c)(?<y>d)","$1${x}$3${y}"));

    }
}
