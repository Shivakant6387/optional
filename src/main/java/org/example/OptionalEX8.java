package org.example;

import java.util.Optional;

public class OptionalEX8 {
    public static void main(String[] args) {
        Optional<String> gender=Optional.of("Male");
        String answer="Yes";
        String  answer2=null;
        System.out.println("Non Empty optional"+gender);
        System.out.println("Non empty optional"+gender.get());
        System.out.println("Empty optional"+Optional.empty());
        System.out.println("ofNullable on non empty"+Optional.ofNullable(answer));
        System.out.println("OfNullable on Empty optional"+Optional.ofNullable(answer2));
        System.out.println("OfNullable"+Optional.of(answer2));
    }
}
