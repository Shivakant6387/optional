package org.example;

import java.util.Optional;

public class OptionalEX {
    public static void main(String[] args) {
        OptionalEX optionalEX=new OptionalEX();
        Integer value1=null;
        Integer value2=90;
        //Integer value2=new Integer(10);
        Optional<Integer>a=Optional.ofNullable(value1);
        Optional<Integer>b=Optional.of(value2);
        System.out.println(value1);
        System.out.println(value2);
    }
}
