package org.example;

import java.util.Optional;

public class OptionalEX9 {
    public static void main(String[] args) {
        Optional<String>opt=Optional.of("Ramesh");
        System.out.println(opt.isPresent());
        System.out.println(opt.get());
    }
}
