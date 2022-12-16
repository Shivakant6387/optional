package org.example;

import java.util.Optional;

public class OptionalEX7 {
    public static void main(String[] args) {
        String[]str=new String[10];
        Optional<String>optional=Optional.ofNullable(str[5]);
        if (optional.isPresent()){
            String Uppercase=str[5].toUpperCase();
            System.out.println(Uppercase);
        }
        else
            System.out.println("String value is not  present");
    }
}
