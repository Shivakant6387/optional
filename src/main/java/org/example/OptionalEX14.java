package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEX14 {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("a","b","c","d");
        Optional<String>result=stringList.stream().filter(s->s.length()==1).findFirst();
        if (result.isPresent()){
            System.out.println(result.get());
        }
    }
}
