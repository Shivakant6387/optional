package org.example;

import java.util.Optional;

public class OptionalEX3 {
    public static void main(String[] args) {
        String []str=new String[5];
        str[3]="Hello I am here";
        Optional<String >optionalS=Optional.of(str[3]);
        System.out.println(optionalS.get());
        System.out.println(optionalS.hashCode());
        System.out.println(optionalS.isPresent());
    }
}
