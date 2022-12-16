package org.example;

import java.util.Optional;

public class OptionalEX11 {
    private static void ifPresentOptionalAPI(){
        String name="Ramesh";
        if(name!=null){
            System.out.println(name.length());
        }
        Optional<String>opt=Optional.of("Ramesh");
        opt.ifPresent(s -> System.out.println(s.length()));
    }
    public static void main(String[] args) {
        ifPresentOptionalAPI();
    }

}
