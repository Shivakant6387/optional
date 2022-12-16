package org.example;

import java.util.Optional;

public class OptionalEx4 {
    public static void main(String[] args) {

        String[]str1=new String[10];
        str1[5]="Java optional class";
        Optional<String>isEmpty=Optional.empty();
        System.out.println(isEmpty);
//        Optional<String>value=Optional.ofNullable(str1[10]);
//        System.out.println(value);
        Optional<String>value2=Optional.of(str1[5]);
        System.out.println(value2);
        System.out.println("Filtered value "+value2.isPresent());
        System.out.println("Filtered value "+value2.filter(s -> s.equals("Abc")));

        System.out.println("Filtered value"+value2.filter(s -> s.equals("Java optional class")));

        System.out.println("Getting value"+value2.get());
        System.out.println("Getting is the hashcode "+value2.hashCode());
        System.out.println("Is value present "+value2.isPresent());
        System.out.println("Nullable optional"+Optional.ofNullable(str1[5]));
        System.out.println("or Else"+value2.orElse("Value is not present"));
        System.out.println("orelse"+isEmpty.orElse("Value is not present"));
        value2.ifPresent(System.out::println);
    }

}
