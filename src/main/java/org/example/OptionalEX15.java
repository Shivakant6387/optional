package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class OptionalEX15 {
    public static void main(String[] args) {
        List<String>stringList= Arrays.asList("a","b","c","d");
        String s=stringList.stream().filter(s1 -> s1.length()==1).findFirst().map(Objects::toString).orElse(null);
        System.out.println(s);
    }
}
