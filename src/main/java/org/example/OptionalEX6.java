package org.example;

import java.util.Locale;
import java.util.Optional;

public class OptionalEX6 {
    public static void main(String[] args) {
        String[]str=new String[10];
        str[5]="Java class optional";
        Optional<String>checkNull=Optional.ofNullable(str[5]);
        if (checkNull.isPresent()){
            String UpperCase=str[5].toUpperCase();
            System.out.println(UpperCase);
        }
        else
            System.out.println("String value is not present");
    }
}
