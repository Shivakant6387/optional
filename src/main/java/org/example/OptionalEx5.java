package org.example;

import java.util.Optional;

public class OptionalEx5 {
    public static void main(String[] args) {
        String[]str2=new String[10];
        str2[5]="Java optional class";
        Optional<String>checkNull=Optional.ofNullable(str2[5]);
        checkNull.ifPresent(System.out::println);

        System.out.println(checkNull.get());
        System.out.println(str2[5].toUpperCase());
    }
}
