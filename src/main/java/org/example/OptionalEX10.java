package org.example;

import java.util.Optional;

public class OptionalEX10 {
    public static void main(String[] args) {
        Optional<String>optEmpty=Optional.empty();
        System.out.println(optEmpty.isPresent());
        String name="Ramesh";
        Optional.of(name);
    }
}
