package org.example;

import java.util.Optional;

public class OptionalEx2 {
    public static void main(String[] args) {
        String []strings=new String[5];
        strings[2]="Geeks classes are coming soon";
        Optional<String>optionalS=Optional.empty();
        System.out.println(optionalS);
        Optional<String>value=Optional.of(strings[2]);
        System.out.println(value);
    }
}
